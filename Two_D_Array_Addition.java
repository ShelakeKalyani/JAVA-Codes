/*
Programmer Name = Shelake Kalyani.
Program			= Program to addition of 2 Dimensional array.			  
Date 			= 17-09-2022
Technology Used = JAVA
*/


import java.io.*;
class Two_D_Array_Addition
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int row,col;
		
		System.out.println("Enter how many rows you want = ");
		row = Integer.parseInt(br.readLine());
		
		System.out.println("Enter how many columns you want = ");
		col = Integer.parseInt(br.readLine());
		
		int arr[][] = new int[row][col];
		int brr[][] = new int[row][col];
		int c[][] = new int[row][col];
		
		
		//Accept elements for first 2D array
		System.out.println("Enter elements for first matrix = ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j] = Integer.parseInt(br.readLine());
			}
		}
		
		System.out.println("Your 2D Array = ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		//Accept elements foe second 2D array
		System.out.println("Enter elements for first matrix = ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				brr[i][j] = Integer.parseInt(br.readLine());
			}
		}
		
		System.out.println("Your 2D Array = ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(brr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		// Addition of two matrix
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				c[i][j] = arr[i][j] + brr[i][j];
			}
		}
		
		
		//Display Addition
		
		System.out.println("Addition = ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(c[i][j]+"  ");
			}
			System.out.println();
		}
	}
}


/*
OUTPUT :

Enter how many rows you want =
3
Enter how many columns you want =
3
Enter elements for first matrix =
1
2
3
1
2
3
1
2
3
Your 2D Array =
1 2 3
1 2 3
1 2 3
Enter elements for first matrix =
3
2
1
3
2
1
3
2
1
Your 2D Array =
3 2 1
3 2 1
3 2 1
Addition =
4  4  4
4  4  4
4  4  4
*/
