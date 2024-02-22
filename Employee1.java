/*
Developer Name  : Shelake Kalyani Rajendra
Program Name    : Create an employee class(id,name,deptname,salary).Define a default and parameterized constructor. 
Use ‘this’ keyword to initialize instance variables. Keep a count of objects created. 
Create objects using parameterized constructor and display the object count after each object 
is created.(Use static member and method). Also display the contents of each object.
Developed Date  : 24-11-2022 
Technology Used : JAVA 
*/


import java.util.Scanner;
class Employee1
{
	public static void main (String args[])
	{
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter Number of  Employee: ");
		int num = obj.nextInt();
		
		employee eobj[] = new employee[num];
		
		for (int i = 0; i<num; i++)
		{
			System.out.print("Enter ID: ");
			int id = obj.nextInt();
			
			System.out.print("Enter Name: ");
			String name = obj.next();
			
			System.out.print("Enter Department: ");
			String dept = obj.next();
			
			System.out.print("Enter Salary: ");
			float salary = obj.nextFloat();
			
			eobj[i] = new employee(id,name,dept,salary);
		}
		
		for (int i = 0; i<num; i++)
		{
			eobj[i].display();
		}
	}
}


class employee
{
	int id;
	String name;
	String dept;
	double salary;
	static int count=0;
		
	employee(int i,String n,String d,double s)
	{
		this.id=i;
		this.name=n;
		this.dept=d;
		this.salary=s;
		count++;
		System.out.println(count+" object is created. \n");
	}
	void display()
	{
		//System.out.println("omkar");
		System.out.println("ID:"+id+"\tName:"+name+"\tDepartment:"+dept+"\t\tSalary:"+salary);
	}
}
