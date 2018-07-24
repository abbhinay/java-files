package mypack;
import java.sql.*;

public class ResultSetDemo {

	public static void main(String[] args) {
	
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from emp");
			ResultSetMetaData rsmd=rs.getMetaData();
			int count=rsmd.getColumnCount();
			System.out.println("count="+count);
			for(int i=1;i<=count;i++)
			{
				System.out.println(rsmd.getColumnName(i)+" "+rsmd.getColumnTypeName(i)+" "+rsmd.getTableName(i));
			}
			con.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
