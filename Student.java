public class Student
{
	int rollno;
	String name;
public Student(int rollno, String name)
{
	this.rollno=rollno;
	this.name=name;
}
public static void main(String[]args)
{
	Student Stu= new Student(101,"ABC");
System.out.println(Stu.rollno);
System.out.println(Stu.name);
}
}