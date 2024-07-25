import java.util.*;
class sample
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String str=s.nextLine();
char[] c=str.toCharArray();
int len=c.length;
boolean flag=true;
int j=len-1;
for(int i=0;i<len;i++)
{
if(c[i]!=c[j])
{
flag=false; 
break;
}
else
j--;
}
if(flag==true)
System.out.println("Palindrome");
else
System.out.println("Not a Palindrome");
}
}