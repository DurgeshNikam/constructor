public class B
{
public B()
{
System.out.println("constructor--B");
}
public static void main(String[]args)
{
B b= new B();
System.out.println("B");
System.out.println(new B());
}
}