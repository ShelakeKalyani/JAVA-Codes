/*
Developer Name  : Shelake Kalyani Rajendra
Program Name    : Write a program to display the Employee(Empid, Empname, Empdesignation, Empsal) information using toString().
Developed Date  : 31-12-2022 
Technology Used : JAVA 
*/

import java.util.*;
abstract class Order
{
	int id;
	String Description;
	abstract void Accept();
	abstract void Display();
}

class Purchase_Order extends Order
{
	String Cust_name;
	Scanner sc = new Scanner(System.in);
	
	public void Accept()
	{
		System.out.println("Enter id = ");
		id = sc.nextInt();
		System.out.println("Enter description about product = ");
		Description = sc.next();
		sc.nextLine();
		System.out.println("Enter Customer Name = ");
		Cust_name = sc.next();
	}
	
	public void Display()
	{
		System.out.println("Id = "+id);
		System.out.println("Description : "+Description);
		System.out.println("Customer Name = "+Cust_name);
	}
	
}

class Sales_Order extends Order
{
	String Vendor_name;
	Scanner sc = new Scanner(System.in);
	
	public void Accept()
	{
		System.out.println("Enter id = ");
		id = sc.nextInt();
		System.out.println("Enter description about product = ");
		Description = sc.next();
		sc.nextLine();
		System.out.println("Enter Vendor Name = ");
		Vendor_name = sc.nextLine();
	}
	
	public void Display()
	{
		System.out.println("Id = "+id);
		System.out.println("Description : "+Description);
		System.out.println("Vendor Name = "+Vendor_name);
	}
	
}

class Order_Info
{
	public static void main(String args[])
	{
		Purchase_Order Pobj1[] = new Purchase_Order[3];
		
		for(int i=0;i<3;i++)
		{
			Pobj1[i] = new Purchase_Order();
		}
		
		System.out.println("\n=======Enter Information for purchase order=====");
		for(int i=0;i<3;i++)
		{
			Pobj1[i].Accept();
		}
		
		System.out.println("\n\n*************Purchase Order Information*******************");
		for(int i=0;i<3;i++)
		{
			Pobj1[i].Display();
		}
		
		Sales_Order Sobj1[] = new Sales_Order[3];
		
		for(int i=0;i<3;i++)
		{
			Sobj1[i] = new Sales_Order();
		}
		
		System.out.println("\n=======Enter Information for Sales order=====");
		for(int i=0;i<3;i++)
		{
			Sobj1[i].Accept();
		}
		
		System.out.println("\n\n*************Sales Order Information*******************");
		for(int i=0;i<3;i++)
		{
			Sobj1[i].Display();
		}
	}
}