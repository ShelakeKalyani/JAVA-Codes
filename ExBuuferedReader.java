/*
Programmer Name = Shelake Kalyani.
Program			= Program to reading a data from console.
Date 			= 07-09-2022
Technology Used = JAVA
*/

import java.io.*;
class ExBuuferedReader
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name = "";
		System.out.println("Enter data = ");
		name = br.readLine();
		System.out.println("Dsts is = "+name);
	}
}

/*
Output :
Enter data =
Hello Good Morning
Dsts is = Hello Good Morning
*/