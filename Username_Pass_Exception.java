/*
Developer Name  : Shelake Kalyani Rajendra
Program Name    : Write a program to accept the username and password from user if username and password are not same then raise "Invalid Password" with appropriate msg.
Developed Date  : 31-12-2022 
Technology Used : JAVA
*/


import java.util.*;

class MyException extends Exception
{
	public MyException(String s)
	{
		super(s);
	}
}


class Username_Pass_Exception
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String username,pass;
		
		System.out.println("Enter username = ");
		username = sc.next();
		System.out.println("Enter Password = ");
		pass = sc.next();
		
		try
		{
			if(username.compareTo(pass)!=0)
			{
				throw new MyException("Invalid username or password...Try again.!!");
			}
			else
			{
				System.out.println("Valid username and password");
			}
		}
		catch(MyException e)
		{
			System.out.println("Error : "+e.getMessage());
		}
	}
}