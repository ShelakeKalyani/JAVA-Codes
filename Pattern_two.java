/*
Programmer Name = Shelake Kalyani.
Program			= Program for Pattern.
				  A
				  A  B
				  A  B  C
				  A  B  C  D
				  A  B  C  D  E
				  
Date 			= 09-09-2022
Technology Used = JAVA
*/

class Pattern_two
{
	public static void main(String args[])
	{
		int i,j;
		//char ch;
		
		for(i=0;i<5;i++)
		{
			char ch = 'A';
			for(j=0;j<5;j++)
			{
				if(i>=j)
				{
				    //ch = 'A';
					System.out.print(ch+"  ");
					//ch++;
				}
				ch++;
			}
			
			System.out.println();
		}
	}
}

/*
Output :
A
A  B
A  B  C
A  B  C  D
A  B  C  D  E
*/
