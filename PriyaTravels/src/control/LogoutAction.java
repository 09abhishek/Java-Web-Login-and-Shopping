package control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import priyatravels.DBAction;

public class LogoutAction extends Action{
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		DBAction dba=new DBAction();
		HttpSession session=request.getSession();
		String uname=session.getAttribute("uname").toString();
		if(uname!=null){
			dba.changeStatus(uname, 0);
		}
		return "logout.success";
	}
}
