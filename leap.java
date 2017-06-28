import java.util.*;
class leap
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if((n%400==0)||(n%4==0)&&(n%100!=0))
		{
			System.out.print("Year" +n +"is a leap year");
		}
		else
		{
			System.out.print("Year" +n +"is a non-leap year");
		}
	}
}