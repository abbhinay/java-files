import java.util.*;
class TokenDemo
{
	public static void main(String[] arr)
	{
		String s1="hello$how^are*you";
		//StringTokenizer st=new StringTokenizer(s1);
		//StringTokenizer st=new StringTokenizer(s1,"$,^,*");
		StringTokenizer st=new StringTokenizer(s1,"$,^,*",true);
		System.out.println("following tokens are extracted");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
}



