/*
Developer Name  : Shelake Kalyani Rajendra
Program Name    : Write a program to print all prime numbers of 'n' elements.
				 (Use command line arguments).
Developed Date  : 25-12-2022 
Technology Used : JAVA (command line argument)
*/



class Prime
{
	public static void main(String args[])
	{
		for(int i=0;i<args.length;i++)
		{
			System.out.println(Integer.parseInt(args[i])+" ");
		}
		
		System.out.println("Prime numbers are = ");
		
		for(int i=0;i<args.length;i++)                      //0
		{
			int flag = 0;                                    //0
			for(int j=2;j<Integer.parseInt(args[i]);j++)    //2
			{
				if(Integer.parseInt(args[i])%j==0)
				{
					flag = 1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(Integer.parseInt(args[i]));
			}
		}
	}
}