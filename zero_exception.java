/*
Developer Name  : Shelake Kalyani Rajendra
Program Name    : Write a program to accept a number from the user, if number is zero then throw user defined exception “Number is 0” otherwise check whether no is prime or not (Use static keyword).
Developed Date  : 29-12-2022 
Technology Used : JAVA 
*/


import java.util.*;
class zero_exception
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Enter any number = ");
		num = sc.nextInt();
		
		try
		{
			if(num==0)
			{
				throw new MyException("Number is 0.");
			}
			else
			{
				int flag = 0;
				for(int i=2;i<num;i++)
				{
					if(num%i==0)
					{
						flag = 1;
						break;
					}
				}
				if(flag==0)
				{
					System.out.println("Number is prime.");
				}
				else
				{
					System.out.println("Number is not prime.");
				}
			}
		}
		catch(MyException me)
		{
			System.out.println("Error : "+me.getMessage());
		}
	}
}