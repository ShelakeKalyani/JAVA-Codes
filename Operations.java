/*
2nd): - 
Write a menu driven program to perform the following operations
i. Calculate the volume of cylinder.
(hint : Volume: π × r² × h)
ii. Find the factorial of given number.
iii. Check the number is Armstrong or not.
iv. Exit
*/

import java.util.*;
class Operations 
{
	final double pi = 3.14;
	double ans;
	
	public double Vol(int r,int h)
	{
		ans = pi*(r*r)*h;
		return ans;
	}
	
	public int factorial(int num)
	{
		int fact = 1;
		while(num!=0)
		{
			fact = fact*num;
			num = num-1;
		}
		return fact;
	}
	
	public boolean Armstrong(int num)
	{
		int temp = num;
		int temp1 = num;
		int cnt = 0,digit,sum = 0;
		
		while(num!=0)
		{
			cnt++;
			num = num/10;
		}
		//System.out.println("Digit = "+cnt);
		
		
		while(temp!=0)		//153
		{
			digit = temp%10;		//3
			int pow = 1;
		
			for(int i=0;i<cnt;i++)
			{
				pow = pow*digit;
			}
			
			//System.out.println("Power = "+pow);
			sum = sum+pow;
			temp = temp/10;
		}
		//System.out.println("Sum = "+sum);
		if(sum==temp1)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int choice,radius,height,num,ans;
		double volume;
		boolean arm;
		Operations obj = new Operations();
		
		while(true)
		{
			System.out.println("*************MENU*************");
			System.out.println("1.Volume");
			System.out.println("2.Factorial");
			System.out.println("3.Armstrong");
			System.out.println("4.Exit");
			
			System.out.println("Enter your choice = ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
						System.out.println("Enter radius and height of cylinder = ");
						radius = sc.nextInt();
						height = sc.nextInt();
						volume = obj.Vol(radius,height);
						System.out.println("Volume of cylinder = "+volume);
						break;
				case 2:
						System.out.println("Enter any number = ");
						num = sc.nextInt();
						ans = obj.factorial(num);
						System.out.println("Factorial = "+ans);
						break;
				case 3:
						System.out.println("Enter any number = ");
						num = sc.nextInt();
						arm = obj.Armstrong(num);
						if(arm==true)
						{
							System.out.println("Armstrong number.");
						}
						else
						{
							System.out.println("Not Armstrong number.");
						}
						break;
				case 4:
						return;
				default:
						System.out.println("Invalid choice..");
			}
		}
	}
}
		





		