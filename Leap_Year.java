/*
Programmer Name = Shelake Kalyani.
Program			= Program to check year is leap year or not.
Date 			= 08-09-2022
Technology Used = JAVA
*/

import java.util.*;
class Leap_Year
{
	public static void main(String args[])
	{
		int year;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any year = ");
		year = sc.nextInt();
		
		if(((year%4==0) && (year%100!=0)) || (year%400==0))
		{
			System.out.println(year +" is leap year.");
		}
		else
		{
			System.out.println(year +" is not leap year.");
		}
	}
}


/*
Output :
Enter any year =
2020
2020 is leap year.
*/