/*
Programmer Name = Shelake Kalyani.
Program			= Program to accept number from command line and print square root of the
				   number.
Date 			= 19-09-2022
Technology Used = JAVA
*/

class Squart_By_cmd
{
	public static void main(String args[])
	{
		int num = Integer.parseInt(args[0]);
		
		double root = Math.sqrt(num);
		
		System.out.println("Square root = "+root);
	}
}

/*
OUTPUT :
java Squart_By_cmd 256
Square root = 16.0
*/