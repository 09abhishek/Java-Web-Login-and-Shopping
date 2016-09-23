package priyatravels;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jdbcpack.JDBCUtility;

public class DBAction {
	PreparedStatement ps;ResultSet rs;
	
	public boolean checkUser(String uname,String upass){
		try{
			Connection con=JDBCUtility.getConnection();
			ps=con.prepareStatement("select * from users where uname=? and upass=?");
			ps.setString(1, uname);
			ps.setString(2, upass);
			rs=ps.executeQuery();
			if(rs.next()){
				return true;
			}
			else{
				return false;
			}
		}catch(Exception e){
			JDBCUtility.closeConnection(e);
			return false;
		}
		finally{
			JDBCUtility.closeConnection(null);
		}
	}
	public boolean checkStatus(String uname){
		try{
			Connection con=JDBCUtility.getConnection();
			ps=con.prepareStatement("select status from users where uname=?");
			ps.setString(1, uname);
			rs=ps.executeQuery();
			if(rs.next()){
				int status=rs.getInt(1);
				if(status==0){
					return true;
				}
				else{
					return false;
				}
			}
			else{
				return false;
			}
		}catch(Exception e){
			JDBCUtility.closeConnection(e);
			return false;
		}
		finally{
			JDBCUtility.closeConnection(null);
		}
	}
	public void changeStatus(String uname,int status){
		try{
			Connection con=JDBCUtility.getConnection();
			ps=con.prepareStatement("update users set status=? where uname=?");
			ps.setInt(1, status);
			ps.setString(2, uname);
			ps.executeUpdate();
			JDBCUtility.closeConnection(null);
		}
		catch(Exception e){
			JDBCUtility.closeConnection(e);
		}
	}
	public void registerUser(int uid,String uname,String upass,int status){
		try{
			Connection con=JDBCUtility.getConnection();
			ps=con.prepareStatement("insert into users values (?,?,?,?)");
			ps.setInt(1, uid);
			ps.setString(2, uname);
			ps.setString(3, upass);
			ps.setInt(4, status);
			ps.executeUpdate();
			JDBCUtility.closeConnection(null);
		}
		catch(Exception e){
			JDBCUtility.closeConnection(e);
		}
	}
	/*public static void main(String[] args) {
		
		
		
		DBAction obj=new DBAction();
		System.out.println(obj.checkUser("root", "root"));
		//obj.changeStatus("ramu", 1);
		//System.out.println(obj.checkStatus("ramu"));
		//obj.registerUser(4, "rajesh", "secret", 0);
		//System.out.println(obj.checkUser("rajesh", "secret"));
	}*/
}
