package mypack;
import java.sql.*;

public class DatabaseMetaDemo {

	public static void main(String[] args) {
	
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test");
			DatabaseMetaData dmd=con.getMetaData();
			System.out.println(dmd.getDatabaseProductName());
			System.out.println(dmd.getDriverName());
			System.out.println(dmd.getDatabaseProductVersion());
			ResultSet rs=dmd.getTables(null, null, "e%", new String[]{"TABLES"});
			if(rs.next()){
				System.out.println(rs.getString(3));
			}
			con.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
