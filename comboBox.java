/*
Developer Name  : Shelake Kalyani Rajendra
Program Name    : Write a program which shows the combo box which includes list of T.Y.B.Sc.(Comp. Sci)
subjects. Display the selected subject in a text field
Developed Date  : 31-12-2022 
Technology Used : JAVA 
*/

import java.awt.*;
class comboBox extends Frame
{
    comboBox()
    {
    Frame f = new Frame();
    
    f.setVisible(true);
    f.setSize(400,400);
     f.setLayout(new FlowLayout());
    f.setTitle("ComboBox");
    Choice c = new Choice();
    c.add("TCS");
    c.add("JAVA");
    c.add("Python");
    c.add("WebTech");
    f.add(c);
    
    
    
  }
  public static void main(String args[])
  {
     
   comboBox m = new comboBox();
  }

}
