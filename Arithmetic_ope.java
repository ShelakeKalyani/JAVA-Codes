/*
Programmer Name = Shelake Kalyani.
Program			= Arithmatic OPerations.
Date 			= 05-09-2022
Technology Used = JAVA
*/


public class Arithmetic_ope
{
	public static void main(String args[])
	{
		int a = 10;
		int b = 20;
		int c = 25;
		int d = 25;
		
		System.out.println("a + b = "+(a+b));
		System.out.println("a - b = "+(a-b));
		System.out.println("a * b = "+(a*b));
		System.out.println("a / b = "+(a/b));
		System.out.println("a % b = "+(a%b));
		System.out.println("a++ = "+(a++));					// 10 	11
		System.out.println("a-- = "+(a--));					// 11 	10
		
		System.out.println("d++ = "+(d++));					// 25 	26
		System.out.println("--d = "+(--d));					// 25
	}
}

/*
Output :
a + b = 30
a - b = -10
a * b = 200
a / b = 0
a % b = 10
a++ = 10
a-- = 11
d++ = 25
--d = 25
*/