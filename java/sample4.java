import java.util.*;
class sample
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String str1=s.next();
String str2=s.next();
int len1=str1.length();
int len2=str2.length();
String str3=new String();
if(len1<len2)
{
str3=str1.concat(str2);
System.out.println(str3.concat(str1));
}
else
{
str3=str2.concat(str1);
System.out.println(str3.concat(str2));
}
}
}
