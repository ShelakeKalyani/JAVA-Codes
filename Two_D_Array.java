/*
Programmer Name = Shelake Kalyani.
Program			= Program to read and display 2D array.			  
Date 			= 17-09-2022
Technology Used = JAVA
*/


import java.io.*;
class Two_D_Array
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
	}
}

/*
Output :
Enter how many rows you want =
3
Enter how many columns you want =
3
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
*/