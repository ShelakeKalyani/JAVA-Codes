//package com.mkyong;

import java.awt.*;
import java.util.*;
//import java.util.concurrent.TimeUnit;

class MyWindow extends Frame		// Frame is child of component
{
	MyWindow()
	{
		Scanner sc = new Scanner(System.in);
		
		Button obj = new Button("*.*");
		Button obj1 = new Button(" ");
		Button obj2 = new Button(" ");
		//Button obj3 = new Button(" ");
		
		obj.setBounds(610,310,80,30);    // 4 parameter = x-coordinate,y-coordinate,width,height
		obj1.setBounds(600,300,100,50);
		obj2.setBounds(590,290,120,70);    // 4 parameter = x-coordinate,y-coordinate,width,height
		//obj3.setBounds(580,280,140,90);
		
		
		add(obj);
		add(obj1);
		add(obj2);
		//add(obj3);
		
		
		setSize(950,950);
		
		setLayout(null);
		//setLayout(null);
		
		
		setVisible(true);		// default value = false
		//setVisible(true);
		
		while(true)
		{
		/*int no;
		
		System.out.println("Enter First letter of any Colour = ");
		no = sc.nextInt();
		
			if(no==1)
			{
				setBackground(Color.RED);
			}
			if(no==2)
			{
				setBackground(Color.BLUE);
			}
			if(no==3)
			{
				setBackground(Color.PINK);
			}
			if(no==4)
			{
				setBackground(Color.ORANGE);
			}
			if(no==5)
			{
				setBackground(Color.YELLOW);
			}
			if(no==6)
			{
				setBackground(Color.GREEN);
			}*/
			//else
			//{
				//setBackground(Color.WHITE);
			//}
		
			
		for(int no=0;no<10;no++)
		{
			if(no==1)
			{
				setBackground(Color.RED);
				//TimeUnit.SECONDS.sleep(5);
			}
			else if(no==2)
			{
				setBackground(Color.CYAN);
				//TimeUnit.SECONDS.sleep(5);
			}
			else if(no==3)
			{
				setBackground(Color.PINK);
				//Thread.sleep(5);
			}
			else if(no==4)
			{
				setBackground(Color.BLUE);
				//Thread.sleep(5);
			}
			else if(no==5)
			{
				setBackground(Color.YELLOW);
				//Thread.sleep(5);
			}
			else if(no==6)
			{
				setBackground(Color.GREEN);
				//Thread.sleep(5);
			}
			else if(no==7)
			{
				setBackground(Color.GRAY);
				//Thread.sleep(5);
			}
			else if(no==8)
			{
				setBackground(Color.ORANGE);
				//Thread.sleep(5);
			}
			else
			{
				setBackground(Color.WHITE);
				//Thread.sleep(5);
			}
		}
	 }
	}
}

class Window_Color_Change
{
	public static void main(String args[])
	{
		MyWindow obj1 = new MyWindow();
		
	}
}