import java.awt.*;
import java.util.*;

class MyWindow extends Frame		// Frame is child of component
{
	MyWindow()
	{
		Scanner sc = new Scanner(System.in);
		
		Button obj = new Button("*.*");
		Button obj1 = new Button(" ");
		Button obj2 = new Button(" ");
		Button obj3 = new Button(" ");
		Button obj4 = new Button(" ");
		Button obj5 = new Button(" ");
		Button obj6 = new Button(" ");
		Button obj7 = new Button(" ");
		Button obj8 = new Button(" ");
		
		while(true)
		{
			
			try
			{
					obj.setBounds(610,310,80,30);    // 4 parameter = x-coordinate,y-coordinate,width,height
					add(obj);
					setVisible(true);
					obj.setBackground(Color.WHITE);
					setBackground(Color.CYAN);
					Thread.sleep(500);
				
					
					obj1.setBounds(600,300,100,50);
					add(obj1);
					setVisible(true);
					obj1.setBackground(Color.BLUE);
					//setBackground(Color.DARK_GRAY);
					Thread.sleep(500);
		
					
					obj2.setBounds(590,290,120,70);    // 4 parameter = x-coordinate,y-coordinate,width,height
					add(obj2);
					setVisible(true);
					obj2.setBackground(Color.MAGENTA);
					//setBackground(Color.LIGHT_GRAY);
					Thread.sleep(500);
				
					obj3.setBounds(580,280,140,90);
					add(obj3);
					setVisible(true);
					obj3.setBackground(Color.GREEN);
					//setBackground(Color.GRAY);
					Thread.sleep(500);
					
					obj4.setBounds(570,270,160,110);
					add(obj4);
					setVisible(true);
					obj4.setBackground(Color.RED);
					//setBackground(Color.DARK_GRAY);
					Thread.sleep(500);
					
					obj5.setBounds(560,260,180,130);
					add(obj5);
					setVisible(true);
					obj5.setBackground(Color.BLUE);
					//setBackground(Color.DARK_GRAY);
					Thread.sleep(500);
					
					obj6.setBounds(550,250,200,150);
					add(obj6);
					setVisible(true);
					obj6.setBackground(Color.MAGENTA);
					//setBackground(Color.DARK_GRAY);
					Thread.sleep(500);
					
					obj7.setBounds(540,240,220,170);
					add(obj7);
					setVisible(true);
					obj7.setBackground(Color.GREEN);
					//setBackground(Color.GRAY);
					Thread.sleep(500);
					
					obj8.setBounds(530,230,240,190);
					add(obj8);
					setVisible(true);
					obj8.setBackground(Color.RED);
					//setBackground(Color.DARK_GRAY);
					Thread.sleep(500);
					setSize(2000,1000);
				
					setLayout(null);
				}
	
				catch(Exception ex)
				{
					System.out.println("ex");
				}
				
		}

		/*while(true)
		{
			
		}*/
	}
		
}

class Box_GUI_T
{
	public static void main(String args[])
	{
		
			MyWindow obj1 = new MyWindow();
	}
}