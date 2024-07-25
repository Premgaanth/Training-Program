import java.util.*;
class sample
{
public static void main(String args[])
{
try
{
Scanner s=new Scanner(System.in);
String str=s.nextLine();
int n=Integer.parseInt(str);
}
catch(NumberFormatException e)
{
System.out.println(e);
}
}
}