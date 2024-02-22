/*
Developer Name  : Shelake Kalyani Rajendra
Program Name    : write a program to read the first name and last name of a person,his weight and height using command line argument
				  calculate the BMI index which is defined as the indivisual's body mass divided by the square of their height.
				  (hint BMI = wts.in kgs /(ht)^2)
Developed Date  : 29-12-2022
Technology Used : JAVA (command line argument)
*/


class Bmi
{
	public static void main(String args[])
	{
		
		String fname = args[0];
		String lname = args[1];
		double height = Double.parseDouble(args[2]);
		double weight = Double.parseDouble(args[3]);
		double BMI = weight/(height*height);
		System.out.println("Body Mass Index(BMI) = "+BMI);
	}
}
		
		