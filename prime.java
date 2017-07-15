import java.util.*;
class prime
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int i=0;
int num=0;
String primenumber="";
System.out.print("enter the range");
int n=s.nextInt();
for(i=1;i<=n;i++)
{
int c=0;
for(num=i;num>=1;num--)
{
if(i%num==0)
{
c=c+1;
}
}
if(c==2)
{
primenumber=primenumber+i+"";
}
}
System.out.println(primenumber);
}
}