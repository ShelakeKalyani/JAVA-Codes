/*
Write program to define class Person with data member as Personname,Aadharno, Panno.
Accept information for 5 objects and display appropriate information (use this keyword).
*/


import java.util.*;

class PersonInfo
{
	
		String PersonName;
		String AdharNum,PanNo;	
		
		PersonInfo()
		{
			PersonName = null;
			AdharNum = null;
			PanNo = null;
		}
		
		PersonInfo(String PersonName,String AdharNum,String PanNo)
		{
			this.PersonName = PersonName;
			this.AdharNum = AdharNum;
			this.PanNo = PanNo;
		}
	
}

class Person
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		PersonInfo obj[] = new PersonInfo[5];
		
		for(int i=0;i<5;i++)
		{
			obj[i] = new PersonInfo();
		}
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter name = ");
			obj[i].PersonName = sc.next();
			System.out.println("Enter Aadhar Number = ");
			obj[i].AdharNum = sc.next();
			System.out.println("Enter Pan Number = ");
			obj[i].PanNo = sc.next();
			//PersonInfo(obj[i].PersonName,obj[i].AdharNum,obj[i].PanNo);
		}
		
		System.out.println("\n\n**************************Student Information****************************\n\n");
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Name = "+obj[i].PersonName);
			System.out.println("Aadhar Number = "+obj[i].AdharNum);
			System.out.println("Pan Number = "+obj[i].PanNo);
		}
	}
}