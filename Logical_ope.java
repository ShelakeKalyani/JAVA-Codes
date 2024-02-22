/*
Programmer Name = Shelake Kalyani.
Program			= Logical OPerations.
Date 			= 05-09-2022
Technology Used = JAVA
*/


public class Logical_ope
{
	public static void main(String args[])
	{
		int a = 60;
		int b = 20;
		int c = 25;
		int d = 25;
		
		System.out.println("(a>b && c==d) = "+(a>b && c==d));
		System.out.println("(a<b && c==d) = "+(a<b && c==d));
		System.out.println("(a<b || c==d) = "+(a<b || c==d));
		System.out.println("!(a<b) = "+!(a<b));
	}
}

/*
Output :
(a>b && c==d) = true
(a<b && c==d) = false
(a<b || c==d) = true
!(a<b)        = true
*/