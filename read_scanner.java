/*
Programmer Name = Shelake Kalyani.
Program			= Program to read a line using Scanner.
Date 			= 07-09-2022
Technology Used = JAVA
*/


import java.util.*;						//Definition of scanner class is in this package
class read_scanner
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);		//Create an object of class
		String str;
		
		System.out.println("Enter any string = ");
		str = sc.nextLine();
		
		System.out.println("You entered = "+str);
	}
}

/*
Output:
Enter any string =
Hello, Welcome in JAVA Programming.
You entered = Hello, Welcome in JAVA Programming.
*/