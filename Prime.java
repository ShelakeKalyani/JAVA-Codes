/*
Programmer Name = Shelake Kalyani.
Program			= Program to check whether an entered number is prime or not.
Date 			= 21-09-2022
Technology Used = JAVA
*/

import java.util.*;
class Prime
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num;
		int flag = 0;
		
		System.out.println("Enter any element = ");
		num = sc.nextInt();
		
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				flag = 1;
				break;
			}
		}
		
		if(flag==0)
		{
			System.out.println(num+"is a prime number.");
		}
		else
		{
			System.out.println(num+"is not a prime number.");
		}
	}
}


/*
OUTPUT 1:
78
78 is not a prime number.

OUTPUT 2:
3
3 is a prime number.
*/