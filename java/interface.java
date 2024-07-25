import java.util.*;
interface playable
{
void play(); 	
}
class veena implements playable
{
public void play()
{
System.out.println("Playing veena");
}
}
class saxophone implements playable
{
public void play()
{
System.out.println("Playing saxophone");
}
}
class test
{
public static void main(String args[])
{
veena v=new veena();
v.play();
saxophone s=new saxophone();
s.play();
playable p1=new veena();
p1.play();
playable p2=new saxophone();
p2.play();
}
}