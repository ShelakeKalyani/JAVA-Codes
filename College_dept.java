/*
Developer Name  : Shelake Kalyani Rajendra
Program Name    : Write a program to create parent class College(cno, cname, caddr) and derived class Department(dno, dname) from College. Write a necessary methods to 
display College details.
Developed Date  : 29-12-2022 
Technology Used : JAVA (Interface)
*/


import java.util.*;
class College
{
	int cno;
	String cname,caddr;
	
	College(int cno,String cname,String caddr)
	{
		this.cno = cno;
		this.cname = cname;
		this.caddr = caddr;
	}
}

class department extends College
{
	int dno;
	String dname;
	
	department(int cno,String cname,String caddr,int dno,String dname)
	{
		super(cno,cname,caddr);
		this.dno = dno;
		this.dname = dname;
	}
	
	public void Display()
	{
		System.out.println("College number = "+cno);
		System.out.println("College name = "+cname);
		System.out.println("College address = "+caddr);
		System.out.println(" Department number = "+dno);
		System.out.println("Department name = "+dname);
	}
}

class College_dept
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int cno,dno;
		String cname,caddr,dname;
		
		System.out.println("Enter College number = ");
		cno = sc.nextInt();
		System.out.println("Enter College name = ");
		cname = sc.next();
		System.out.println("Enter College address = ");
		caddr = sc.next();
		System.out.println("Enter Department number = ");
		dno = sc.nextInt();
		System.out.println("Enter Department name = ");
		dname = sc.next();
		
		department obj = new department(cno,cname,caddr,dno,dname);
		
		System.out.println("\n*****************College Information********************");
		obj.Display();
	}
}