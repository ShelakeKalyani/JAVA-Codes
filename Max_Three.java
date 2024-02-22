/*
Programmer Name = Shelake Kalyani.
Program			= Program to display maximum number from three number.
Date 			= 08-09-2022
Technology Used = JAVA
*/

import java.util.*;
class Max_Three
{
	public static void main(String args[])
	{
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers = ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if((a>b) && (a>c))
		{
			System.out.println(a+" is maximum numbers from three numbers.");
		}
		else if((b>a) && (b>c))
		{
			System.out.println(b+" is maximum numbers from three numbers.");
		}
		else
		{
			System.out.println(c+" is maximum numbers from three numbers.");
		}
	}
}

/*
Output:
Enter three numbers =
23
98
65
98 is maximum numbers from three numbers.
*/
			
		