/*
Programmer Name = Shelake Kalyani.
Program			= Program to display elements of an array.			  
Date 			= 15-09-2022
Technology Used = JAVA
*/

import java.util.*;
class Array
{
	public static void main(String args[])
	{
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many elements you want in an array = ");
		num = sc.nextInt();
		
		int arr[] = new int[num];
		
		System.out.println("Enter "+num+" numbers = ");
		for(int i=0;i<num;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Your array = ");
		for(int i=0;i<num;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}

/*
Output :
Enter how many elements you want in an array =
5
Enter 5 numbers =
1
2
3
4
5
Your array =
1 2 3 4 5
*/