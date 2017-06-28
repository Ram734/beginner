import java.util.*;
class natural
{
	public static void main(String args[])
	{
		int i=1;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the limit for sum of natural number");
		int n=sc.nextInt();
		while(i<=n)
		{
			sum=sum+i;
			i++;
		}
		System.out.print(sum);
	}
}
