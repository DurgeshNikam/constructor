public class A{
int x;
public A (int x)
{
this.x=x;
}
public static void main(String[]args)
{
A a=new A(10);
System.out.println(a.x);

a.x=20;
System.out.println(a.x);
}
}