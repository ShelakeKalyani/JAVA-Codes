/*
Developer Name  : Shelake Kalyani Rajendra
Program Name    : Write a program to find the cube of given number using functional interface.
Developed Date  : 22-12-2022 
Technology Used : JAVA (Interface)
*/

import java.util.*;
interface Num_Cube
{
	void findCube();
}

class cubeOfNum implements Num_Cube
{
	int num,cube;
	
	cubeOfNum(int num)
	{
		this.num = num;
	}
	
	public void findCube()
	{
		cube = num*num*num;
		System.out.println("Cube of number = "+cube);
	}
	
}

class Cube
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Enter any number = ");
		num = sc.nextInt();
		
		cubeOfNum obj = new  cubeOfNum(num);
		obj.findCube();
	}
}
		