package control;

import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpServletRequest;

public abstract class Action {
	public abstract String execute(HttpServletRequest request,HttpServletResponse response);
}
