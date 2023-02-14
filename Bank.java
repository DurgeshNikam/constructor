public class Bank
{
	int Acno;
	String Acaddress;
	int Acaadhar;
	int Acpanno;
public Bank(int Acno, String Acaddress, int Acaadhar, int Acpanno)
{
	this.Acno=Acno;
	this.Acaddress=Acaddress;
	this.Acaadhar=Acaadhar;
	this.Acpanno=Acpanno;
}
public static void main(String[]args)
{
	Bank B=new Bank(204,"Delhi",2233,4520);
	System.out.println(B.Acno);
	System.out.println(B.Acaddress);
	System.out.println(B.Acaadhar);
	System.out.println(B.Acpanno);
}
}