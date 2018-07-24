package mypack;
import java.sql.*;
import java.io.*;

public class DeleteDemo {

	public static void main(String[] args) {
	
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test");
			PreparedStatement psmt=con.prepareStatement("delete from emp where id=?");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			while(true)
			{
				System.out.println("enter id");
				int a=Integer.parseInt(br.readLine());
				psmt.setInt(1,a);
				int r=psmt.executeUpdate();
				if(r>0)
				{
					System.out.println("successfully deleted\ndo u want to delete more press yes or no");
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
