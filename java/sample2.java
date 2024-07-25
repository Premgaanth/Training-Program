import java.util.*;
class sample
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String str=s.next();
int len=str.length();
if(len%2==0)
{
String str2=str.substring(0,len/2);
System.out.println(str2);
}
else
 System.out.println("Null");
}
}
