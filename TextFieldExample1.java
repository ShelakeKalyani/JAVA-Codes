 
/*
Developer Name  : Shelake Kalyani Rajendra
Program Name    : Write Java program to design three text boxes and two buttons using awt.
  Enter different strings in first and second textbox. On clicking the First command button, 
  concatenation of two strings should be displayed in third text box and on clicking second command
  button, reverse of string should display in third text box
Developed Date  : 19-12-2022 
Technology Used : JAVA 
*/


import java.awt.*;
import java.awt.event.*;

class TextFieldExample1 extends Frame implements ActionListener
{
	TextField txt1,txt2,txt3;      //txt1 apn contructor chya baher pn access kartoy so to contructor chya baher declare kela ahe
	Button btn1,btn2;
	
	TextFieldExample1()
	{
		txt1 = new TextField();
		txt1.setBounds(60,50,250,40);
		
		txt2 = new TextField();
		txt2.setBounds(60,120,250,40);
		
		txt3 = new TextField();
		txt3.setBounds(60,190,250,40);
		
		btn1 = new Button("button1");
		btn1.setBounds(100,250,80,30);
		
		btn2 = new Button("button2");
		btn2.setBounds(220,250,80,30);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		add(txt1);
		add(txt2);
		add(txt3);
		add(btn1);
		add(btn2);
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
		
		 if (ae.getSource() == btn1)
		 {
			 concatStr = str1.concat(str2);
			 txt3.setText(concatStr);
		 }
		 
		 if (ae.getSource() == btn2)
		 {
			 char ch;
			 String revStr = "";
			 
			 for(int i=0;i<str1.length();i++)
			 {
				ch = str1.charAt(i);
				revStr = ch+revStr;
			 }
			 txt3.setText(revStr);
		 }
	}
	
	public static void main(String args[])
	{
		TextFieldExample1 obj = new TextFieldExample1();
	}
}   