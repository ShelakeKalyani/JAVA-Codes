/*
Developer Name  : Shelake Kalyani Rajendra
Program Name    : Write a program to implement Border Layout Manager.
Developed Date  : 31-12-2022 
Technology Used : JAVA 
*/

import java.awt.*;
public class Borderlayout extends Frame
{
   Borderlayout()
   {
    this.setVisible(true);
    this.setTitle("Border layout");
    this.setSize(500,500);
    this.setBackground(new Color(0X009270));
    Button b1=new Button("SOUTH");
     Button b2=new Button("NORTH");
      Button b3=new Button("EAST");
       Button b4=new Button("WEST");
        Button b5=new Button("CENTER");
        
        this.add(b1,BorderLayout.NORTH);
         this.add(b2,BorderLayout.SOUTH);
          this.add(b3,BorderLayout.EAST);
           this.add(b4,BorderLayout.WEST);
            this.add(b5,BorderLayout.CENTER);
           
   }
   
    public static void main(String args[])
    {
      Borderlayout b = new Borderlayout();
    }

}