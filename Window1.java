import java.awt.*;

class MyWindow extends Frame		// Frame is child of component
{
	MyWindow()
	{
		Button obj = new Button("Add (+)");
		Button obj1 = new Button("Sub (-)");
		Button obj2 = new Button("Mul (*)");
		Button obj3 = new Button("Div (/)");
		TextField one = new TextField("   !!...Welcome to my Calculator...!!");
		
		obj.setBounds(100,200,110,50);    // 4 parameter = x-coordinate,y-coordinate,width,height
		obj1.setBounds(100,300,110,50);
		obj2.setBounds(100,400,110,50);    // 4 parameter = x-coordinate,y-coordinate,width,height
		obj3.setBounds(100,500,110,50);
		one.setBounds(300,100,250,50);
		
		add(obj);
		add(obj1);
		add(obj2);
		add(obj3);
		add(one);
		
		setSize(1000,1000);
		//setSize(500,500);
		
		setLayout(null);
		//setLayout(null);
		
		
		setVisible(true);		// default value = false
		//setVisible(true);
	}
}

class Window1
{
	public static void main(String args[])
	{
		MyWindow obj1 = new MyWindow();
		
	}
}