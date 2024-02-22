/*
Developer Name  : Shelake Kalyani Rajendra
Program Name    : Write a menu driven program to perform the following operations on multidimensional array 
ie matrix : 
i. Addition 
ii. Multiplication 
iv. Exit
Developed Date  : 29-12-2022 
Technology Used : JAVA (Inheritance)
*/


import java.util.*;
class matrix_op
{
	
     public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[3][3];
		int brr[][] = new int[3][3];
		int crr[][] = new int[3][3];
		int drr[][] = new int[3][3];
		int i,j,choice,temp;
		
		System.out.println("Enter elements for first matrix = ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("  "+arr[i][j]);
			}
			System.out.println();
		}
		
		
		System.out.println("Enter elements for second matrix = ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				brr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("*****************MENU******************");
		System.out.println("1.Addition");
		System.out.println("2.Multiplication");
		System.out.println("3.Exit");
		
		
		System.out.println("Enter your choice = ");
		choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
						for(i=0;i<3;i++)
						{
							for(j=0;j<3;j++)
							{
								crr[i][j] = arr[i][j]+brr[i][j];
							}
						}
						
						System.out.println("Addition = ");
						for(i=0;i<3;i++)
						{
							for(j=0;j<3;j++)
							{
								System.out.print("  "+crr[i][j]);
							}
							System.out.println();
						}
						break;
				case 2:
						for(i=0;i<3;i++)
						{
							for(j=0;j<3;j++)
							{
								crr[i][j] = 0;
								for(int k=0;k<3;k++)
								{
									crr[i][j] = crr[i][j] + (arr[i][k]*brr[k][j]);
								}
							}
						}
						
						for(i=0;i<3;i++)
						{
							for(j=0;j<3;j++)
							{
								System.out.print(" "+crr[i][j]);
							}
							System.out.println();
						}
						break;
				
				case 3:
						return;
				default:
						System.out.println("Invalid choice..");
			}
	}
}






/*for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("  "+arr[i][j]);
			}
			System.out.println();
		}*/