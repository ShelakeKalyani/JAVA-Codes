/*
Developer Name  : Shelake Kalyani Rajendra
Program Name    : Design a Super class Customer (name, phone-number). Derive a class Depositor(accno , balance)
from Customer. Again, derive a class Borrower (loan-no, loan-amt) from Depositor. Write
necessary member functions to read and display the details of ‘n’customers.
Developed Date  : 18-12-2022 
Technology Used : JAVA 
*/

import java.util.*;
class Customer
{
	String name,phone;
	
	Customer()
	{
		name = null;
		phone = null;
	}
	
	Customer(String name,String phone)
	{
		this.name = name;
		this.phone = phone;
	}
}

class Depositor extends Customer
{
	String accno;
	int balance;
	
	Depositor()
	{
		super();
		accno = null;
		balance = 0;
	}
	
	Depositor(String name,String phone,String accno,int balance)
	{
		super(name,phone);
		this.accno = accno;
		this.balance = balance;
	}
}

class Borrower extends Depositor
{
	String loan_no;
	int loan_amt;
	
	Borrower()
	{
		super();
		loan_no = null;
		loan_amt = 0;
	}
	
	Borrower(String name,String phone,String accno,int balance,String loan_no,int loan_amt)
	{
		super(name,phone,accno,balance);
		this.loan_no = loan_no;
		this.loan_amt = loan_amt;
	}
	
	void Display()
	{
		System.out.println("Customer name = "+name);
		System.out.println("Customer phone number = "+phone);
		System.out.println("Customer account number = "+accno);
		System.out.println("Customer bank balance = "+balance);
		System.out.println("Customer loan number = "+loan_no);
		System.out.println("Customer loan amount = "+loan_amt);
		System.out.println();
	}
}

class cust_depo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num,balance,loan_amt;
		String name,phone,accno,loan_no;
		
		System.out.println("Enter how many customer you want = ");
		num = sc.nextInt();
		
		Borrower obj[] = new Borrower[num];
		
		for(int i=0;i<num;i++)
		{
			obj[i] = new Borrower();
		}
		
		for(int i=0;i<num;i++)
		{
			System.out.println("\n\n******Enter detail for "+(i+1)+" coustomer");
			System.out.println("Enter customer name = ");
			name = sc.next();
			System.out.println("Enter customer phone number = ");
			phone = sc.next();
			System.out.println("Enter customer accno number = ");
			accno = sc.next();
			System.out.println("Enter bank balance = ");
			balance = sc.nextInt();
			System.out.println("Enter loan number = ");
			loan_no = sc.next();
			System.out.println("Enter loan amount = ");
			loan_amt = sc.nextInt();
			obj[i] = new Borrower(name,phone,accno,balance,loan_no,loan_amt);
		}
		
		
		System.out.println("\n--------------------------------------------------");
		System.out.println("ALL CUSTOMER DETAIL");
		System.out.println("--------------------------------------------------");
		for(int i=0;i<num;i++)
		{
			obj[i].Display();
		}
	}
}