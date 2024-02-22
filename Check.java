/*
3rd): -
Write a program to accept the array element and find the entered number whether present in
array or not and print appropriate message.*/

import java.util.*;
class Check
{
	public static void main(String args[])
	{
		//int arr = new arr[5];
		Scanner sc = new Scanner(System.in);
		int num,value,flag = 0;
		
		System.out.println("Enter how many elements you want in an array = ");
		num = sc.nextInt();
		
		int arr[] = new int[num];
		
		System.out.println("Enter elements = ");
		for(int i=0;i<num;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter value to search = ");
		value = sc.nextInt();
		
		for(int i=0;i<num;i++)
		{
			if(value==arr[i])
			{
				flag = 1;
			}
		}
		
		if(flag==1)
		{
			System.out.println("Value found..");
		}
		else
		{
			System.out.println("Value not found..");
		}
				
	}
}