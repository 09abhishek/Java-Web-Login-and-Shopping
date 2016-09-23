package control;

import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LangAction extends Action{
@Override
public String execute(HttpServletRequest request, HttpServletResponse response) {
	// TODO Auto-generated method stub
	String lang=request.getParameter("lang");
	System.out.println(lang);
	
	ResourceBundle rb=ResourceBundle.getBundle("dictionary",new Locale(lang));
	HttpSession session=request.getSession();
	session.setAttribute("rb", rb);
	return "lang.success";
}
}
