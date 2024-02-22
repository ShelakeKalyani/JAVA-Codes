/*
Developer Name  : Shelake Kalyani Rajendra
Program Name    : Define an interface “Operation” which has method volume( ).Define a constant PI having a value 3.142 Create a class cylinder which implements 
this interface (members – radius, height). Create one object and calculate the volume.
Developed Date  : 28-12-2022 
Technology Used : JAVA (Interface)
*/

import java.util.*;
interface Operation
{
	final double PI = 3.142;
	void Area();
	void Volume();
}

class Cylinder implements Operation
{
	int radius,height;
	double area,volume;
	
	Cylinder(int radius,int height)
	{
		this.radius = radius;
		this.height = height;
	}
	
	public void Area()
	{
		area = (2*PI*radius*height)+(2*PI*radius*radius);
		System.out.println("Area of Cylinder = "+area);
	}
	
	public void Volume()
	{
		volume = PI*radius*radius*height;
		System.out.println("Volume of Cylinder = "+volume);
	}
}

class Cylinder_cal
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int height,radius;
		
		System.out.println("Enter radius = ");
		radius = sc.nextInt();
		System.out.println("Enter height = ");
		height = sc.nextInt();
		
		Cylinder obj = new Cylinder(radius,height);
		
		obj.Area();
		obj.Volume();
	}
}