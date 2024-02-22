/*
Developer Name  : Shelake Kalyani Rajendra
Program Name    : Write a program to display the Employee(Empid, Empname, Empdesignation, Empsal) information using toString().
Developed Date  : 31-12-2022 
Technology Used : JAVA 
*/


class Employee
{
	int EmpId;
	String EmpName;
	String EmpDesignamtion;
	int Empsal;
	
	Employee(int EmpId,String EmpName,String EmpDesignamtion,int Empsal)
	{
		this.EmpId = EmpId;
		this.EmpName = EmpName;
		this.EmpDesignamtion = EmpDesignamtion;
		this.Empsal = Empsal;
	}
	
	public String toString()
	{
		return EmpId+" "+EmpName+" "+EmpDesignamtion+" "+Empsal;
	}
}

class Employee_toString
{
	public static void main(String args[])
	{
		Employee e1 = new Employee(1,"XYZ","Manager",150000);
		Employee e2 = new Employee(2,"ABC","Clerk",100000);
		
		System.out.println(e1);
		System.out.println(e2);
	}
}
	
		