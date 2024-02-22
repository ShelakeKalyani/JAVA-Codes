/*
Programmer Name = Shelake Kalyani.
Program			= Program for reverse a number.
Date 			= 09-09-2022
Technology Used = JAVA
*/

import java.io.*;
class Reverse_num
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num,digit;
		int rev = 0;
		
		System.out.println("Enter any number = ");
		num = Integer.parseInt(br.readLine());
		
		while(num!=0)
		{
			digit = num%10;
			rev = (rev*10) + digit;
			num = num/10;
		}
		System.out.println("Reverse Number = "+rev);
		
	}
}


/*
Output :
Enter any number =
1234
Reverse Number = 4321
*/
		