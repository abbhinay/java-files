import java.util.*;
class ArrayDemo2
{
	public static void main(String[] arr)	
	{
		Scanner sc=new Scanner(System.in);
		int[][] a=new int[3][];
		a[0]=new int[3];
		a[1]=new int[4];
		a[2]=new int[5];
		int i,j;
		for(i=0;i<3;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				System.out.println("enter no");
				a[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}