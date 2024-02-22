/*
Write a program that creates a user interface to perform integer divisions. The user enters two
numbers in the text fields, Number1 and Number2. The division of Number1 and Number2 is
displayed in the Result field when the Divide button is clicked. If Number1 or Number2 were
not an integer, the program would throw a NumberFormatException. If Number2 were Zero,
the program would throw an Arithmetic Exception Display the exception in a message
dialog box.
*/


import java.awt.*;
import java.awt.event.*;

class DivideOp extends Frame implements ActionListener
{
	TextField txt1,txt2,txt3;      //txt1 apn contructor chya baher pn access kartoy so to contructor chya baher declare kela ahe
	Button btn1;
	
	DivideOp()
	{
		txt1 = new TextField();
		txt1.setBounds(60,50,250,40);
		
		txt2 = new TextField();
		txt2.setBounds(60,120,250,40);
		
		txt3 = new TextField();
		txt3.setBounds(60,190,250,40);
		
		btn1 = new Button("button1");
		btn1.setBounds(100,250,80,30);
		
		
		btn1.addActionListener(this);
		
		add(txt1);
		add(txt2);
		add(txt3);
		add(btn1);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		//txt1.setText("Welcome");
		String str1,str2,concatStr;
		str1 = txt1.getText();
		str2 = txt2.getText();
		int c;		
		int a = Integer.parseInt(str1);
		int b = Integer.parseInt(str2);
		
		try
		{
			String type = ((Object)a).getClass().getSimpleName();
			String type1 = ((Object)b).getClass().getSimpleName();
			
			if((type.equals("Double")) || (type1.equals("Double")))
			{
				throw new NumberFormatException("Please enter integer numbers.");
			}
			else if(b==0)
			{
				throw new ArithmeticException("You entered second number 0...which is not valid.!");
			}
			else
			{
				c = a/b;
				String result = String.valueOf(c);
				txt3.setText(result);
			}
		}
		catch(NumberFormatException ne)
		{
			System.out.println("Warning: "+ne);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error: "+e);
		}
		 
	}
	
	public static void main(String args[])
	{
		DivideOp obj = new DivideOp();
	}
} 



/*
class DivideOp
{
   	public static void main(String args[])
	{
		float a = 34.5;
		
		String type = ((Object)a).getClass().getSimpleName();
		
		System.out.println("Type = "+type);
	}
}
*/