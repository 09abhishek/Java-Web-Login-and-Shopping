package control;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShoppingAction extends Action{
@Override
public String execute(HttpServletRequest request, HttpServletResponse response) {
	Enumeration<String> e=request.getParameterNames();
	while(e.hasMoreElements()){
		String paramname=e.nextElement();
		String paramvalue=request.getParameter(paramname);
		HttpSession session=request.getSession();
		session.setAttribute(paramname, paramvalue);
	}
	String shopid=request.getParameter("shopid");
	return shopid+".success";
}
}
