/*
Programmer Name = Shelake Kalyani.
Program			= Program to find whether number is palindrome or not.(Use command line argument )
Date 			= 21-09-2022
Technology Used = JAVA
*/

class Palindrome
{
	public static void main(String args[])
	{
		int num = Integer.parseInt(args[0]);
		int temp = num;
		
		int digit;
		int rev = 0;
		
		while(num!=0)
		{
			digit = num%10;
			rev = rev*10 + digit;
			num = num/10;
		}
		
		if(rev==temp)
		{
			System.out.println(temp+" is Palindrome number.");
		}
		else
		{
			System.out.println(temp+" is not a Palindrome number.");
		}
	}
}


/*
OUTPUT :
java Palindrome 121
121 is Palindrome number.
*/