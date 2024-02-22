/*
Developer Name  : Shelake Kalyani Rajendra
Program Name    : Write a program for multilevel inheritance such that Country is inherited from Continent.
State is inherited from Country. Display the place, State, Country and Continent.
Developed Date  : 29-12-2022 
Technology Used : JAVA 
*/

class Continent
{
	String continent_name;
	
	Continent(String continent_name)
	{
		this.continent_name = continent_name;
	}
}

class Country extends Continent
{
	String country_name;
	
	Country(String continent_name,String country_name)
	{
		super(continent_name);
		this.country_name = country_name;
	}
}

class State extends Country
{
	String State_name;
	
	State(String continent_name,String country_name,String State_name)
	{
		super(continent_name,country_name);
		this.State_name = State_name;
	}
}

class District extends State
{
	String Dist_name;
	
	District(String continent_name,String country_name,String State_name,String Dist_name)
	{
	    super(continent_name,country_name,State_name);
		this.Dist_name = Dist_name;
	}
}

class Main
{
	public static void main(String args[])
	{
		District obj = new District("Ashia","India","Maharashtra","Ahmednagar");
		
		System.out.println("Continent Name = "+obj.continent_name);
		System.out.println("Country Name = "+obj.country_name);
		System.out.println("State Name = "+obj.State_name);
		System.out.println("District Name = "+obj.Dist_name);
	}
}