/*
Programmer Name = Shelake Kalyani.
Program			= Program for Pattern.
				  A
				  B  C
				  D  E  F
				  G  H  I  J
				  K  L  M  N  O
				  
Date 			= 09-09-2022
Technology Used = JAVA
*/

class Pattern_three
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
					ch++;
				}
				//ch++;
			}
			
			System.out.println();
		}
	}
}

/*
Output:
A
B  C
D  E  F
G  H  I  J
K  L  M  N  O
*/