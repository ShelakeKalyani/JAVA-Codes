/*
Developer Name  : Shelake Kalyani Rajendra
Program Name    : Define a Item class (item_number, item_name, item_price). Define a default and parameterized
constructor. Keep a count of objects created. Create objects using parameterized constructor
and display the object count after each object is created.(Use static member and method). Also
display the contents of each object.
Developed Date  : 26-12-2022 
Technology Used : JAVA 
*/


import java.util.Scanner;
class Item
{
	public static void main (String args[])
	{
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter how many item you want: ");
		int num = obj.nextInt();
		
		Item2 eobj[] = new Item2[num];
		
		for (int i = 0; i<num; i++)
		{
			System.out.print("Enter item number: ");
			int item_number = obj.nextInt();
			
			System.out.print("Enter item name: ");
			String item_name = obj.next();
			
			System.out.print("Enter item price: ");
			int item_price = obj.nextInt();
			
			eobj[i] = new Item2(item_number,item_name,item_price);
		}
		
		for (int i = 0; i<num; i++)
		{
			eobj[i].display();
		}
	}
}


class Item2
{
	int item_number,item_price;
	String item_name;
	static int count=0;
		
	Item2(int item_number,String item_name,int item_price)
	{
		this.item_number=item_number;
		this.item_name=item_name;
		this.item_price=item_price;
		count++;
		System.out.println(count+" object is created. \n");
	}
	void display()
	{
		//System.out.println("omkar");
		System.out.println("Item Number:"+item_number+"\tItem Name:"+item_name+"\tItem price:"+item_price);
	}
}
