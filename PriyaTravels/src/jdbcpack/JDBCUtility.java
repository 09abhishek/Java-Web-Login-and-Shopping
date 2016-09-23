package jdbcpack;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JDBCUtility {
	static Properties prop;
	public static void init(String file){
		try{
			System.out.println("file...:"+file);
			prop=new Properties();
			prop.load(new FileInputStream(file));
			Class.forName(prop.getProperty("driver"));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	private static final ThreadLocal<Connection> tlocal=new ThreadLocal<Connection>();

	public static Connection getConnection(){
		try{
			Connection con=null;
			con=tlocal.get();
			if(con==null){
				con=DriverManager.getConnection
						(prop.getProperty("url"),
						prop.getProperty("username"),
						prop.getProperty("password"));
				tlocal.set(con);
				con.setAutoCommit(false);
				return con;
			}
			else{
				return con;
			}
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	public static void closeConnection(Exception e){
		Connection con=tlocal.get();
		if(con!=null){
			try{
			if(e==null){
				con.commit();
			}
			else{
				con.rollback();
			}
			tlocal.remove();
			con.close();}catch(Exception e1){e1.printStackTrace();}
		}
	}
}






