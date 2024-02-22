/*
Programmer Name = Shelake Kalyani.
Program			= Program for Pattern.
				  1  2  3  4  5
				  1  2  3  4
				  1  2  3
				  1  2
				  1
				  
Date 			= 09-09-2022
Technology Used = JAVA
*/

class Pattern_one
{
	public static void main(String args[])
	{
		int i,j,cnt;
		
		for(i=0;i<5;i++)
		{
			cnt = 1;
			for(j=0;j<5;j++)
			{
				if(i<=j)
				{
					System.out.print(cnt+"  ");
					cnt++;
				}
			}
			System.out.println();
		}
	}
}

/*
Output :
1  2  3  4  5
1  2  3  4
1  2  3
1  2
1
*/