/*
Developer Name  : Shelake Kalyani Rajendra
Program Name    : Define an abstract class Staff with protected members id and name.Define a parameterized contructor.
				  Define one subclass OfficeStaff with member department. Create n objects of OfficeStaff and display all
				  detail.
Developed Date  : 25-12-2022 
Technology Used : JAVA (abstract class,inheritance,constructor)
*/


import java.util.*;
abstract class Staff
{
	protected int id;
	protected String name;
	
	Staff(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
}

class OfficeStaff extends Staff 
{
	String Deptartment;
	
	OfficeStaff(int id,String name,String Deptartment)
	{
		super(id,name);
		this.Deptartment = Deptartment;
	}
	
	
	public void Display()
	{
		System.out.println("Id = "+id);
		System.out.println("Name = "+name);
		System.out.println("Deptartment = "+Deptartment);
		System.out.println("====================================================");
	}
}

class Office_info
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num,id;
		String name,Deptartment;
		
		System.out.println("Enter how many staff member you want = ");
		num = sc.nextInt();
		
		OfficeStaff obj[] = new OfficeStaff[num];
		
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter id = ");
			id = sc.nextInt();
			System.out.println("Enter Name = ");
			name = sc.next();
			System.out.println("Enter Department Name = ");
			Deptartment = sc.next();
			
			obj[i] = new OfficeStaff(id,name,Deptartment);
		}
		
		System.out.println("\n\n*****************Staff Detail****************************\n");
		for(int i=0;i<num;i++)
		{
			obj[i].Display();
		}
	}
}
		