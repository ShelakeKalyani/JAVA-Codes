/*
Programmer Name = Shelake Kalyani.
Program			= Program to get the number from ucommand line argument.
Date 			= 07-09-2022
Technology Used = JAVA
*/

class cmd_line_int
{
	public static void main(String args[])
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}

/*
Output :
java cmd_line_int 1 4

a = 1
b = 4
*/