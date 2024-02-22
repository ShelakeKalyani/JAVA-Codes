/*
Developer Name  : Shelake Kalyani Rajendra
Program Name    : Accept 'n' cities from user and print them in ascending order.
Developed Date  : 30-12-2022 
Technology Used : JAVA 
*/


import java.util.*;
class City_Sort
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num;
		String temp;
		
		System.out.println("Enter how many cities you want = ");
		num = sc.nextInt();
		String city[] = new String[num];
		
		System.out.println("Enter "+num+" names of cities = ");
		for(int i=0;i<num;i++)
		{
			city[i] = sc.next();
		}
		
		
		for(int i=0;i<num;i++)
		{
			for(int j=1;j<num;j++)
			{
				if(city[j-1].compareTo(city[j])>0)
				{
					temp = city[j-1];
					city[j-1] = city[j];
					city[j] = temp;
				}
			}
		}
		
		System.out.println("\nAfter Sorting = ");
		
		for(int i=0;i<num;i++)
		{
			System.out.println(city[i]);
		}
		
	}
}