/*
5th): - 
Define a class MyNumber having one private int data member.Write a default constructor to
initialize it to 0 and another constructor to initialize it to a value (Use this). 
Write methods isNegative, isPositive, isZero, isOdd, isEven. Create an object in main. 
Use command line arguments to pass a value to the object 
(Hint : convert string argument to integer) and 
perform the above tests. Provide javadoc comments for all constructors 
and methods and generate the html help file.*/

class MyNumber
{
	private int value;
	
	MyNumber()
	{
		value = 0;
	}
	
	MyNumber(int value)
	{
		this.value = value;
	}
	
	boolean isNegative()
	{
		if(value<0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	boolean isPositive()
	{
		if(value>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	boolean isZero()
	{
		if(value==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	boolean isOdd()
	{
		if(value%2!=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	boolean isEven()
	{
		if(value%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class Num_Check
{
	public static void main(String args[])
	{
		MyNumber obj = new MyNumber();
		int num = Integer.parseInt(args[0]);
		MyNumber obj2 = new MyNumber(num);
		boolean ans;
		
		
		//System.out.println("Number = "+num);
		
		ans = obj2.isNegative();
		if(ans==true)
		{
			System.out.println(num+" is negative number.");
		}
		
		
		ans = obj2.isPositive();
		if(ans==true)
		{
			System.out.println(num+" is positive number.");
		}
		
		
		ans = obj2.isZero();
		if(ans==true)
		{
			System.out.println(num+" is equal to zero.");
		}
		
		ans = obj2.isOdd();
		if(ans==true)
		{
			System.out.println(num+" is odd number.");
		}
		
		
		ans = obj2.isEven();
		if(ans==true)
		{
			System.out.println(num+" is Even number.");
		}
	}
}