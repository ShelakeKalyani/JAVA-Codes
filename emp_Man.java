/*
Developer Name  : Shelake Kalyani Rajendra
Program Name    : Define an Employee class with suitable attributes having getSalary() method, which returns
salary withdrawn by a particular employee. Write a class Manager which extends a class
Employee, override the getSalary() method, which will return salary of manager by adding
traveling allowance, house rent allowance etc.
Developed Date  : 23-12-2022 
Technology Used : JAVA 
*/


class Employee
{
	void getSalary()
	{
		//salary withdraw
		System.out.println("Salary Withdraw 50000");
	}
}

class Manager extends Employee
{
	void getSalary()
	{
		//salary of manager + ...
		System.out.println("Manager salary with traveling allowance, house rent allowance is 15000");
	}
}

class emp_Man
{
	public static void main(String args[])
	{
		Employee obj = new Employee();
		obj.getSalary();
		
		obj = new Manager();
		obj.getSalary();
	}
}