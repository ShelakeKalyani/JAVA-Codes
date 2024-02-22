/*
1st) :-

Write a program to calculate perimeter and area of rectangle implement the program using class and 
object.(hint : area = length * breadth , perimeter=2*(length+breadth))*/

class Reactangle
{
	int length,breadth,Area_R,peri;
	
	
	Reactangle(int len,int b)
	{
		length = len;
		breadth = b;
	}
	
	void Area()
	{
		Area_R = length*breadth;
		System.out.println("Area of rectangle = "+Area_R);
	}
	
	void Perimeter()
	{
		peri = 2*(length+breadth);
		System.out.println("Area of rectangle = "+peri);
	}
}

class Rect_Area_Peri
{
	public static void main(String args[])
	{
		Reactangle obj = new Reactangle(2,4);
		
		obj.Area();
		obj.Perimeter();
	}
}


/*
OUTPUT:
Area of rectangle = 8
Area of rectangle = 12
*/