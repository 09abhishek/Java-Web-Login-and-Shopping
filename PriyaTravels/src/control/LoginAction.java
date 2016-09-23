package control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import priyatravels.DBAction;

public class LoginAction extends Action{
@Override
public String execute(HttpServletRequest request, HttpServletResponse response) {
	String uname=request.getParameter("uname");
	String upass=request.getParameter("upass");
	DBAction dba=new DBAction();
	HttpSession session=request.getSession();
	boolean valid=dba.checkUser(uname, upass);
	if(valid){
		boolean status=dba.checkStatus(uname);
		if(status){
			dba.changeStatus(uname, 1);
			session.setAttribute("uname", uname);
			return "login.success";
		}
		else{
			return "login.already";
		}
	}
	else{
		return "login.failure";
	}
}
}
