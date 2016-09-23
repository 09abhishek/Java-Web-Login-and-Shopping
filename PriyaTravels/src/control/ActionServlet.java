package control;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdbcpack.JDBCUtility;
public class ActionServlet extends HttpServlet {
	Properties prop;
	@Override
	public void init(ServletConfig config) throws ServletException {
		try{
		ServletContext ctx=config.getServletContext();
		String dbconfig=config.getInitParameter("dbconfig");
		String appconfig=config.getInitParameter("appconfig");
		System.out.println(dbconfig);
		String dbpath=ctx.getRealPath(dbconfig);
		System.out.println(dbpath);
		String apppath=ctx.getRealPath(appconfig);
		JDBCUtility.init(dbpath);
		prop=new Properties();
		prop.load(new FileInputStream(apppath));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			String id=request.getParameter("id");
			String actionclass=prop.getProperty(id);
			Action action=(Action)Class.forName(actionclass).newInstance();
			String result=action.execute(request, response);
			String nextpage=prop.getProperty(result);
			RequestDispatcher rd=request.getRequestDispatcher(nextpage);
			rd.forward(request, response);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
