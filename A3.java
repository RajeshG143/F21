import java.util.*;
public class A3
{
public static void main(String args[])
{
Map<String,Integer> m=new HashMap<String,Integer>();
Scanner sc =new Scanner(System.in);

for(int i=0;i<=10;i++)
{
    System.out.println("Enter key");
    String key =sc.next();
    System.out.println("Enter value");
    int value= sc.nextInt();
    m.put(key,value);
}
Iterator <Map.Entry <String,Integer> > itr = m.entrySet().iterator();
while(itr.hasNext())
{
Map.Entry<String,Integer> e = itr.next();
if(e.getValue()>20)
{
itr.remove();
}
}
System.out.println(m);

}
}
