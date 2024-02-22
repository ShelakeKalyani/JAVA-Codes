/*
Developer Name  : Shelake Kalyani Rajendra
Program Name    : Design a class for Bank. Bank Class should support following operations; 
				  a. Deposit a certain amount into an account 
                  b. Withdraw a certain amount from an account 
				  c. Return a Balance value specifying the amount with details.
Developed Date  : 29-12-2022 
Technology Used : JAVA 
*/

import java.util.Scanner;

public class Bank
{
		String name;
		int money;
		Scanner sc = new Scanner(System.in);
		void createAccount()
		{
			System.out.println("Enter the name of the new Account Holder:");
			name = sc.next();
			System.out.println("Enter the money u want to Deposit");
			money = sc.nextInt();
		}
		void deposit()
		{
			System.out.println("Enter the money u want to deposit:");
			int deposit_money = sc.nextInt();
			money = money + deposit_money;
			System.out.println("Successfully Deposit");
			System.out.println("Account Balance is:"+money);
		}
		void withdraw()
		{
			System.out.println("Enter the how much money u want to withdraw:");
			int withdraw_money = sc.nextInt();
			if(money>=withdraw_money)
			{
			money = money - withdraw_money;
			System.out.println("Successfully Withdraw");
			System.out.println("Account Balance is:"+money);
		}
}
	void accountDetail()
	{
		System.out.println("Account Holder:"+name);
		System.out.println("Account Balnce:"+ money);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Create ur Bank Account:");
		Bank obj = new Bank();
		obj.createAccount();
		int ch;
		do {
		System.out.println("\n Enter ur choice:");
		System.out.println("1.Deposit\n2.Withdraw\n3.Amount Detail");
		System.out.println("Enter ur choice enter 0 to end:");
		ch = sc.nextInt();
		switch(ch)
		{
		case 1: obj.deposit();
		break;
		case 2: obj.withdraw();
		break;
		case 3: obj.accountDetail();
		break;
		default:
		System.out.println("Invalid Case!!!");
		}
         }while(ch!=0);
    }
}