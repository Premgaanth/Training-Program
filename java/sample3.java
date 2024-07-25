import java.util.*;
class sample
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String str=s.next();
int len=str.length();
char[] c=str.toCharArray();
for(int i=1;i<len-1;i++)
System.out.print(c[i]);
}
}
