//22-12-2022


import java.util.Scanner;
class account
{
	String cname;
	int accno;
	
	account()
	{
	}
	account(String cname,int accno)
	{
		this.cname=cname;
		this.accno=accno;
	}
}
class SavingAccount extends account
{
	static int Savingbal;
	static int minbal=100;
}
public class AccountDetail extends SavingAccount
{
	int damt;
	int wamt;
	
	static void bal(String name,int accno,int damt,int wamt)
	{
		Savingbal = Savingbal+damt;
		Savingbal = Savingbal-wamt;
		System.out.println("customer name"+name+"\nAccno"+accno+"\nDeposited amount"+damt+"widran amount"+wamt+"\nsaving balance"+
		Savingbal+"minimum balance"+minbal);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter name:");
		String name = sc1.nextLine();
		
		System.out.println("Enter Accno:");
		int accno = sc1.nextInt();
		
		System.out.println("Deposite:");
		int damt = sc1.nextInt();
		
		System.out.println("withdrawn");
		int wamt = sc1.nextInt();
		
		bal(name,accno,damt,wamt);
	}
}
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
		