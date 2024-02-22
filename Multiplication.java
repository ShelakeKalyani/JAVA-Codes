


class Multiplication
{
	public static void main(String args[])
	{
		int arr[][] = {{3,4,5},{1,2,3},{6,7,2}};
		int brr[][] = {{1,4,2},{4,2,1},{3,1,2}};
		int crr[][] = new int[3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				crr[i][j] = 0;
				for(int k=0;k<3;k++)
				{
					crr[i][j] = crr[i][j] + (arr[i][k]*brr[k][j]);
				}
			}
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(" "+crr[i][j]);
			}
			System.out.println();
		}
	}
}