import java.util.*;
class vc
{
	public static void main(String a[])
	{
	Scanner sc=new Scanner(System.in);
	char ch=sc.next().charAt(0);
	if(ch>='a'&&ch<='z'||ch>='A'||ch<='Z')
	{
		System.out.print("Given character is alphabet");
	}
	else
	{
		System.out.print("Given character is not alphabet");
	}
	}
}
	