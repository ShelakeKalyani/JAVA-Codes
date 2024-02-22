/*
Programmer Name = Shelake Kalyani.
Program			= Program to find area of circle using final variable.
Date 			= 06-09-2022
Technology Used = JAVA
*/


public class Area_Circle
{
	public static void main(String args[])
	{
		int r = 5;									// Initializing radius
		final double PI = 3.141592;					// Final Variable
		double area;
		
		area = PI*r*r;
		System.out.println("Area of circle = "+area);
	}
}

/*
Output :
Area of circle = 78.5398
*/