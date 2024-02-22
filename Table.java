/*
9th): -
Write a program to display the 1 to 15 tables.*/

class Table
{
	public static void main(String args[])
	{
		int num = 5,mul = 1;
		
		/*for(int i=1;i<=10;i++)
		{
			mul = i*num;
			System.out.println(" "+mul);
		}*/
		
		for(int i=1;i<=15;i++)
		{
			for(int j=1;j<=10;j++)
			{
				mul = i*j;
				System.out.println(mul);
			}
			System.out.println();
		}
	}
}