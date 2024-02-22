/*
Programmer Name = Shelake Kalyani.
Program			= Program to accept two numbers as command line arguments and print the addition
				  of those numbers.
Date 			= 20-09-2022
Technology Used = JAVA
*/

class Add_cmd
{
	public static void main(String args[])
	{
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		int ans = num1 + num2;
		
		System.out.println("Addition = "+ans);
	}
}

/*
OUTPUT :
java Add_cmd 5 9
Addition = 14
*/