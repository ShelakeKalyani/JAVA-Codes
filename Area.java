/*
Developer Name  : Shelake Kalyani Rajendra
Program Name    : Write a program to create an abstract class named Shape that contains two integers and an
empty method named printArea(). Provide three classes named Rectangle, Triangle and Circle
such that each one of the classes extends the class Shape. Each one of the classes contain only
the method printArea() that prints the area of the given shape. (use method overriding).
Developed Date  : 30-12-2022 
Technology Used : JAVA 
*/



import java.util.*;
abstract class Shape
{
	int a,b;
	void  printArea()
	{
		
	};
}

class Rectangle extends Shape
{
	Scanner sc = new Scanner(System.in); 
	int Area;
	
	void  printArea()
	{
		System.out.println("\n\nEnter length and breadth of rectangle = ");
		a = sc.nextInt();
		b = sc.nextInt();
		Area = a*b;
		System.out.println("Area of rectangle = "+Area);
	}
}

class Triangle extends Shape
{
	Scanner sc = new Scanner(System.in); 
	double Area;
	
	void  printArea()
	{
		System.out.println("\n\nEnter base and height of triangle = ");
		a = sc.nextInt();
		b = sc.nextInt();
		Area = (0.5)*a*b;
		System.out.println("Area of triangle = "+Area);
	}
}

class Circle extends Shape
{
	Scanner sc = new Scanner(System.in); 
	double Area;
	final double PI = 3.14;
	
	void  printArea()
	{
		System.out.println("\n\nEnter radius of circle = ");
		a = sc.nextInt();
		Area = PI*a*a;
		System.out.println("Area of circle = "+Area);
	}
}

class Area
{
	public static void main(String args[])
	{
		Shape obj1 = new Rectangle();
		obj1.printArea();
		
		Shape obj2 = new Triangle();
		obj2.printArea();
		
		Shape obj3 = new Circle();
		obj3.printArea();
	}
}