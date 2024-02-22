/*
Programmer Name = Shelake Kalyani.
Program			= Program for Pattern.
				  A
				  B  B
				  C  C  C
				  D  D  D  D
				  E  E  E  E  E
				  
Date 			= 10-09-2022
Technology Used = JAVA
*/

class Pattern_four
{
	public static void main(String args[])
	{
		int i,j;
		//char ch;
		char ch = 'A';
		for(i=0;i<5;i++)
		{
			
			for(j=0;j<5;j++)
			{
				
				if(i>=j)
				{
				    //ch = 'A';
					System.out.print(ch+"  ");
					//ch++;
				}
				//ch++;
			}
			ch++;
			System.out.println();
		}
	}
}

/*
Output:
A
B  B
C  C  C
D  D  D  D
E  E  E  E  E
*/