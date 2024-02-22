/*
Developer Name  : Shelake Kalyani Rajendra
Program Name    : Write a program to find the cube of given number using functional interface.
Developed Date  : 30-12-2022 
Technology Used : JAVA 
*/

import java.util.*;
interface Num_Sqr
{
	void findSqr();
}

class sqrOfNum implements Num_Sqr
{
	int num,cube;
	
	sqrOfNum(int num)
	{
		this.num = num;
	}
	
	public void findSqr()
	{
		cube = num*num;
		System.out.println("Square of number = "+cube);
	}
	
}

class Square
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Enter any number = ");
		num = sc.nextInt();
		
		sqrOfNum obj = new sqrOfNum(num);
		obj.findSqr();
	}
}
		