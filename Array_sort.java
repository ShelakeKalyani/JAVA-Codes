/*
Programmer Name = Shelake Kalyani.
Program			= Program to display the array element in descending order.			  
Date 			= 16-09-2022
Technology Used = JAVA
*/


import java.util.*;
class Array_sort
{
	public static void main(String args[])
	{
		int num,temp;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many elements you want in an array = ");
		num = sc.nextInt();
		
		int arr[] = new int[num];
		
		System.out.println("Enter "+num+" numbers = ");
		for(int i=0;i<num;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("\nArray Before Sorted = ");
		for(int i=0;i<num;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		for(int i=0;i<num;i++)
		{
			for(int j=i+1;j<num;j++)
			{
				if(arr[j]>arr[i])
				{
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		System.out.println("\nArray After Sorted = ");
		for(int i=0;i<num;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}

/*
Enter how many elements you want in an array =
5
Enter 5 numbers =
76
34
12
99
67

Array Before Sorted =
76 34 12 99 67
Array After Sorted =
99 76 67 34 12
*/