import java.util.*;
class sum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int no[]=new int[100];
		int c=0;
		for(int i=0;i<n;i++)
		{
			no[i]=sc.nextInt();
			c=c+no[i];
		}
		System.out.print(c);
	}
}
	