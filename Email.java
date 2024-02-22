/*
Developer Name  : Shelake Kalyani Rajendra
Program Name    : Write a program to design a screen using Awt that will take a user name and password. If the user name and password are not same, raise an Exception with appropriate message. User can have 3 login chances only. Use clear button to clear the TextFields.
Developed Date  : 25-12-2022 
Technology Used : JAVA 
*/


import java.awt.*;
import javax.naming.InvalidNameException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class InvalidPasswordException extends Exception

{
	InvalidPasswordException()
	{
		System.out.println("invalid name and password");
	}
}
public class Email extends Frame implements ActionListener
{
	Label userNameLabel,userPasswordLabel;
	Button Login,Clear;
	TextField username,password,message;
	Panel p;
	char ch = '*';
	int attempt =0;
	
	
		
		void setMethod()
		{
		p = new Panel();
		
		//setLayout(null);
		setTitle("email");
		setSize(400,400);
		setVisible(true);
		setResizable(false);
		
		userNameLabel = new Label("enter user name");
		userPasswordLabel = new Label("enter the password");
		username = new TextField(20);
		password = new TextField(20);
		password.setEchoChar(ch);
		message = new TextField(20);
		message.setEnabled(false);
	
		Login = new Button("Login");
		Clear = new Button("clear");
		p.add(userNameLabel);
		p.add(username);
		p.add(userPasswordLabel);
		p.add(password);
		
		p.add(Login);
		p.add(Clear);
		p.add(message);
		add(p);
		Login.addActionListener(this);
		Clear.addActionListener(this);
	}
	public static void main(String args[])
	{
		Email obj = new Email();
		obj.setMethod();
	}
public void actionPerformed(ActionEvent ae)
	{
		try
		{
			if(attempt<3)
			{
				if(ae.getSource()==Clear)
				{
					username.setText(" ");
					password.setText("");
					username.requestFocus();
				}
				if(ae.getSource()==Login)
				{
					String uname = username.getText();
					String pname = password.getText();
					
					if(uname.compareTo(pname)==0)
					{
						message.setText("valid");
						System.out.println("Email is valid");
					}
					else
					{
						message.setText("invalid");
						throw new InvalidPasswordException();
					}
				}
				attempt++;
			}
			else
			{
				System.out.println("Attempt is greater than 3");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
					
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
