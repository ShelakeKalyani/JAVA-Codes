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
		while(true)
		{
			try
			{
					
					obj.setBounds(610,310,80,30);    // 4 parameter = x-coordinate,y-coordinate,width,height
					add(obj);
					setVisible(true);
					Thread.sleep(500);
				
					
					obj1.setBounds(600,300,100,50);
					add(obj1);
					setVisible(true);
					Thread.sleep(500);
		
					
					obj2.setBounds(590,290,120,70);    // 4 parameter = x-coordinate,y-coordinate,width,height
					add(obj2);
					setVisible(true);
					Thread.sleep(500);
				
					setSize(950,950);
				
					setLayout(null);
				}
	
				catch(Exception ex)
				{
					System.out.println("ex");
				}
		}	
	}
		
}

class Box_GUI
{
	public static void main(String args[])
	{
		
			MyWindow obj1 = new MyWindow();
	}
}