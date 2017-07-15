import java.util.*;
class palin
{
	static public void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		String s1=String.valueOf(sb);
		char c[]=s.toCharArray();
		char c1[]=s1.toCharArray();
		if(Arrays.equals(c,c1))
		{
			System.out.print("Palindrome");
		}
		else
		{
			System.out.print("Not Palindrome");
		}
	}
}
		
			