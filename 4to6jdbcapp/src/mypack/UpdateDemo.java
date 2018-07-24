package mypack;
import java.sql.*;
import java.io.*;

public class UpdateDemo {

	public static void main(String[] args) {
	
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test");
			PreparedStatement psmt=con.prepareStatement("update emp set name=? , job=? where id=?");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			while(true)
			{
				System.out.println("enter id");
				int a=Integer.parseInt(br.readLine());
				System.out.println("enter name");
				String b=br.readLine();
				System.out.println("enter job");
				String c=br.readLine();
				psmt.setInt(3,a);
				psmt.setString(1,b);
				psmt.setString(2,c);
				int r=psmt.executeUpdate();
				if(r>0)
				{
					System.out.println("successfully updated\ndo u want to update more press yes or no");
					String ans=br.readLine();
					if(ans.equals("no"))
						break;
				}
			}
			con.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
