import java.util.*;
class arm
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=0;
		int d=0;
		int temp;
		temp=n;
		while(n>0)
		{
			n1=n%10;
			n=n/10;
			d=d+n1*n1*n1;
		}
		if(d==temp)
		{
			System.out.print("Given number is palindrome");
		}
		else
		{
			System.out.print("Given number is not palindrome");
		}
	}
}