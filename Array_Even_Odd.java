/*
Programmer Name = Shelake Kalyani.
Program			= Program to print odd and even numbers from an array.			  
Date 			= 15-09-2022
Technology Used = JAVA
*/

import java.util.*;
class Array_Even_Odd
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
		
		System.out.println("\n\nEven numbers inan array = ");
		for(int i=0;i<num;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println("\n\nOdd numbers inan array = ");
		for(int i=0;i<num;i++)
		{
			if(arr[i]%2==1)
			{
				System.out.print(arr[i]+" ");
			}
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

Even numbers inan array =
2 4

Odd numbers inan array =
1 3 5
*/