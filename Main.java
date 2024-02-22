/*
12): - 
Write a program for multilevel inheritance such that country is inherited from continent. 
State is inherited from country. 
Display the place, state, country and continent.
*/

class continent
{
	String cont_name;
	continent(String cont)
	{
		this.cont_name=cont;
	}
}

class country extends continent
{
	String country_name;
	country(String cont,String coun)
	{
		super(cont);
		this.country_name=coun;
	}
}

class state extends country
{
	String state_name;
	state(String cont,String coun,String state)
	{
		super(cont,coun);
		this.state_name=state;
	}
}
class district extends state
{
	String district_name;
	district(String cont,String coun,String state,String district)
	{
		super(cont,coun,state);
		this.district_name=district;
	}
}

class Main
{
	public static void main(String args[])
	{
		district obj = new district("Asia","India","Maharashtra","Ahmednager");

		System.out.println("Contient: "+obj.cont_name);
		System.out.println("Country: "+obj.country_name);
		System.out.println("State: "+obj.state_name);
		System.out.println("District: "+obj.district_name);
		
	}
	
}