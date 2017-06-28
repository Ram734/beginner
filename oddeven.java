import java.util.*;
class oddeven
{
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0)
		{
			System.out.print("Given number is even");
		}
		else
		{
			System.out.print("Given number is odd");
		}
	}
}