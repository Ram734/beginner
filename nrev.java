import java.util.*;
class nrev
{
	static public void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	    String s=String.valueOf(n);
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
			System.out.print(sb);
	}
}
		
			