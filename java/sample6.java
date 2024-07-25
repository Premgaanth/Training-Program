import java.util.*;
class sample
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String str=s.next();
int n=s.nextInt();
int len=str.length();
String str2=str.substring(len-n,len);
for(int i=0;i<len;i++)
System.out.print(str2);
}
}