
/*
Developer Name  : Shelake Kalyani Rajendra
Program Name    : Define a class MyNumber having one private int data member.Write a default constructor to
initialize it to 0 and another constructor to initialize it to a value (Use this). 
Write methods isNegative, isPositive, isZero, isOdd, isEven. Create an object in main. 
Use command line arguments to pass a value to the object 
(Hint : convert string argument to integer) and 
perform the above tests. Provide javadoc comments for all constructors 
and methods and generate the html help file.


To generate Documentation(html) file ---> javadoc setB_b.java
Developed Date  : 25-12-2022 
Technology Used : JAVA 
*/



class MyNumber
{
	int number;
	
	/** Default Constructor */
	
	MyNumber()
	{
		number = 0;
	}
	
	/**
	Member function
	@param num Represents the new value of num
	@return void No return value 
	*/
	
	MyNumber(int num)
	{
		number = num;
	}
	
	/**
	Method
	@return void no value return 
	It check number is negative or not.
	*/
	void isNegative()
	{
		if(number<0)
		{
			System.out.println("Number is negative.");
		}
	}
	
	void isPositive()
	{
		if(number>0)
		{
			System.out.println("Number is positive.");
		}
	}
	
	void isZero()
	{
		if(number==0)
		{
			System.out.println("Number is equal to zero.");
		}
	}
	
	void isOdd()
	{
		if(number%2!=0)
		{
			System.out.println("Number is odd.");
		}
	}
	
	void isEven()
	{
		if(number%2==0)
		{
			System.out.println("Number is even.");
		}
	}
}

public class Check_num_even_etc
{
	public static void main(String args[])
	{
		int num = Integer.parseInt(args[0]);
		
		MyNumber obj = new MyNumber(num);
		
		System.out.println("Number is = "+num);
		
		obj.isNegative();
		obj.isPositive();
		obj.isZero();
		obj.isOdd();
		obj.isEven();
	}
}