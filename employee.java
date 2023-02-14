public class employee
{
int eid;
String ename;
String eaddress;
String edept;

public employee(int eid, String ename, String eaddress, String edept)
{
this.eid=eid;
this.ename=ename;
this.eaddress=eaddress;
this.edept=edept;

System.out.println("Constructor Employee");
}
public static void main(String[]args)
{
employee e=new employee(11,"Varun","pune","Production");

System.out.println(e.eid);
System.out.println(e.ename);
System.out.println(e.eaddress);
System.out.println(e.edept);
}
}