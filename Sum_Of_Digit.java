/*
Programmer Name = Shelake Kalyani.
Program			= Program to find sum of digit of number entered by user. 
Date 			= 19-09-2022
Technology Used = JAVA
*/

import java.util.*;
class Sum_Of_Digit
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num,digit;
		int sum = 0;
		
		System.out.println("Enter any number = ");
		num = sc.nextInt();
		
		while(num!=0)
		{
			digit = num%10;
			sum = sum+digit;
			num = num/10;
		}
		
		System.out.println("Sum of Digits = "+sum);
	}
}

/*
Output:
Enter any number =
213
Sum of Digits = 6
*/