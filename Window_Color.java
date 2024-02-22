import java.awt.*;

class MyWindow extends Frame		// Frame is child of component
{
	MyWindow()
	{
		
		Button obj = new Button("  7  ");
		Button obj1 = new Button("  8  ");
		Button obj2 = new Button("  9  ");
		Button obj3 = new Button("  /  ");
		
		Button obj4 = new Button("  4  ");
		Button obj5 = new Button("  5  ");
		Button obj6 = new Button("  6  ");
		Button obj7 = new Button("  X  ");
		
		Button obj8 = new Button("  1  ");
		Button obj9 = new Button("  2  ");
		Button obj10 = new Button("  3  ");
		Button obj11 = new Button("  -  ");
		
		Button obj12 = new Button("  0  ");
		Button obj13 = new Button("  .  ");
		Button obj14 = new Button("  =  ");
		Button obj15 = new Button("  +  ");
		
		
		TextField one = new TextField("   ");
		TextField two = new TextField("\t\t\t   CALCULATOR");
		
		obj.setBounds(100,200,110,50);    // 4 parameter = x-coordinate,y-coordinate,width,height
		obj1.setBounds(205,200,110,50);
		obj2.setBounds(305,200,110,50);    // 4 parameter = x-coordinate,y-coordinate,width,height
		obj3.setBounds(405,200,110,50);
		
		obj4.setBounds(100,250,110,50);    // 4 parameter = x-coordinate,y-coordinate,width,height
		obj5.setBounds(205,250,110,50);
		obj6.setBounds(305,250,110,50);    // 4 parameter = x-coordinate,y-coordinate,width,height
		obj7.setBounds(405,250,110,50);
		
		obj8.setBounds(100,300,110,50);    // 4 parameter = x-coordinate,y-coordinate,width,height
		obj9.setBounds(205,300,110,50);
		obj10.setBounds(305,300,110,50);    // 4 parameter = x-coordinate,y-coordinate,width,height
		obj11.setBounds(405,300,110,50);
		
		obj12.setBounds(100,350,110,50);    // 4 parameter = x-coordinate,y-coordinate,width,height
		obj13.setBounds(205,350,110,50);
		obj14.setBounds(305,350,110,50);    // 4 parameter = x-coordinate,y-coordinate,width,height
		obj15.setBounds(405,350,110,50);
		one.setBounds(100,155,415,50);
		two.setBounds(100,50,415,50);
		
		add(obj);
		add(obj1);
		add(obj2);
		add(obj3);
		add(obj4);
		add(obj5);
		add(obj6);
		add(obj7);
		add(obj8);
		add(obj9);
		add(obj10);
		add(obj11);
		add(obj12);
		add(obj13);
		add(obj14);
		add(obj15);
		add(one);
		add(two);
		
		
		/*obj.setBackground(Color.GRAY);
		obj1.setBackground(Color.GRAY);
		obj2.setBackground(Color.GRAY);
		obj3.setBackground(Color.GRAY);*/
		one.setBackground(Color.LIGHT_GRAY);
		two.setBackground(Color.MAGENTA);
		
		
		//setBackground(Color.GRAY);
		
		setSize(950,950);
		
		setLayout(null);
		//setLayout(null);
		
		
		setVisible(true);		// default value = false
		//setVisible(true);
	}
}

class Window_Color
{
	public static void main(String args[])
	{
		MyWindow obj1 = new MyWindow();
		
	}
}