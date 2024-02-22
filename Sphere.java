/*
Developer Name  : Shelake Kalyani Rajendra
Program Name    : Create a class Sphere, to calculate the volume and surface area of sphere. (Hint : Surface area=4*3.14(r*r), Volume=(4/3)3.14(r*r*r))
Developed Date  : 30-12-2022 
Technology Used : JAVA 
*/


import java.util.*;
class Sphere
{
	public static void main(String args[])
	{
		int r;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius of sphere = ");
		r = sc.nextInt();
		
		double S_Area = 4*(3.14)*(r*r);
		double Volume = (4/3)*3.14*(r*r*r);
		
		System.out.println("Surface area of circle = "+S_Area);
		System.out.println("Volume of circle = "+Volume);
	}
}