/*
Developer Name  : Shelake Kalyani Rajendra
Program Name    : Write a program to accept the two dimensional array from user and display sum of its diagonal elements.
Developed Date  : 21-12-2022 
Technology Used : JAVA 
*/




import java.util.*;

class Matrix_op_diagonal
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int choice,sum = 0;
		
		int arr[][] = new int[3][3];
		
		System.out.println("Enter elements for matrix = ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Your Matrix = ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		for(int i=0;i<3;i++)
		{
		     for(int j=0;j<3;j++)
		    {
			if(i==j)
			{
			     sum = sum+arr[i][j];
			}
		    }
		}
		System.out.println("Sum of diagonal = "+sum);
					
	}
}