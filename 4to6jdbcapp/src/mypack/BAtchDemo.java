package mypack;
import java.sql.*;
import java.io.*;

public class BAtchDemo {

	public static void main(String[] args) {
	
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test");
			PreparedStatement psmt=con.prepareStatement("insert into emp values(?,?,?,?)");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			while(true)
			{
				System.out.println("enter id");
				int a=Integer.parseInt(br.readLine());
				System.out.println("enter name");
				String b=br.readLine();
				System.out.println("enter job");
				String c=br.readLine();
				System.out.println("enter sal");
				int d=Integer.parseInt(br.readLine());
				psmt.setInt(1,a);
				psmt.setString(2,b);
				psmt.setString(3,c);
				psmt.setInt(4,d);
				psmt.addBatch();
				System.out.println("successfully inserted\ndo u want to insert more press yes or no");
				String ans=br.readLine();
				if(ans.equals("no"))
					break;
			}
			psmt.executeBatch();
			con.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
