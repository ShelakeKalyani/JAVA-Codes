/*
8th ):-

Write a menu driven program to perform the following operations on 2D array:
i. Sum of diagonal elements
ii. Sum of upper diagonal elements
iii. Sum of lower diagonal elements
iv. Exit
*/
import java.util.*;
class Sum_ele
{
	public static void main(String args[])
	{
		method obj = new method();
		Scanner val = new Scanner(System.in);
		
		System.out.println("Enter Row:");
		int r=val.nextInt();
		System.out.println("Enter Column:");
		int c=val.nextInt();
		if (r == c)
		{
			int arr[][]=new int[r][c];
			for (int i=0;i<r;i++)
			{
				for (int j=0;j<c;j++)
				{
					arr[i][j] = val.nextInt();
				}
			}
			
			for (int i=0;i<r;i++)
			{
				for (int j=0;j<r;j++)
				{
					System.out.print(" "+arr[i][j]);
				}
				System.out.println();
			}
			
		while(true)
		{
			System.out.println("--------------------------------------");
			System.out.println("Enter Your Choice: ");
			System.out.println("1.Press for Sum of daigonal elements: ");
			System.out.println("2.Press for Sum of upper daigonal elements:");
			System.out.println("3.Press for Sum of lower daigonal elements:");
			System.out.println("4.Exit");
			System.out.println("--------------------------------------");
			System.out.println("Enter Your Choice: ");
			int ch = val.nextInt();
			System.out.println("--------------------------------------");
			
			switch(ch)
			{
				case 1:
					int ad = obj.add(arr,r,c);
					System.out.println("Sum of daigonal elements is: "+ad);
					break;
				
				case 2:
					int ud = obj.uadd(arr,r,c);
					System.out.println("Sum of upper daigonal elements: "+ud);
					break;
				
				case 3:
					int ld = obj.ladd(arr,r,c);
					System.out.println("Sum of lower daigonal elements: "+ld);
					break;
				
				case 4:
					return ;
			
				default :
					System.out.println("Wrong Input");
			}
			
		}
			
		}
		else
		{
			System.out.println("Number of Row not equal Number Column");
		}
		
	}
}

class method
{
	int i=0,j=0;
	int add(int arr[][],int r ,int c)
	{
		int dsum=0;
		for (i=0;i<r;i++)
		{
			for (j=0;j<c;j++)
			{
				if(i==j)//11 22 33
					dsum=dsum+arr[i][j];
			}
		}
		
		return dsum;
	}
	
	int uadd(int arr[][],int r ,int c)
	{
		int ud=0;
		for (i=0;i<r;i++)
		{
			for (j=0;j<c;j++)
			{					
				if(i>j)
					ud=ud+arr[i][j];
			}
		}
		return ud;
	}
	
	int ladd(int arr[][],int r ,int c)
	{
		int ld=0;
		for (i=0;i<r;i++)
		{
			for (j=0;j<c;j++)
			{
				if(i<j)
					ld=ld+arr[i][j];
			}
		}
		return ld;
	}
}


