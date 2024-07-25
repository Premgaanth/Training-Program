import java.util.*;
class sample
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String str1=s.next();
String str2=s.next();
int len=str1.length();
String str="";
for(int i=0;i<len;i++)
{
str+=str1.charAt(i);
str+=str2.charAt(i);
}
System.out.println(str);
}
}