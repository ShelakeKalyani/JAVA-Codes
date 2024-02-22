import java.awt.*;

class MyWindow extends Frame		// Frame is child of component
{
	MyWindow()
	{
		Button obj = new Button("Hello Kalyani..!!");
		
		obj.setBounds(100,100,110,50);    // 4 parameter = x-coordinate,y-coordinate,width,height
		
		add(obj);
		
		setSize(500,500);
		
		setLayout(null);
		
		setVisible(true);		// default value = false
		
	}
}

class Window
{
	public static void main(String args[])
	{
		MyWindow obj1 = new MyWindow();
		
	}
}