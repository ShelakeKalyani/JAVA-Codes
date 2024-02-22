
/*
Developer Name  : Shelake Kalyani Rajendra
Program Name    : Write a program to design a screen using Awt that,
Developed Date  : 28-12-2022 
Technology Used : JAVA 
*/


import java.awt.*;
class menu1 extends Frame
{
  menu1()
  {
  
    MenuBar bar = new MenuBar();
    Frame f = new Frame();
    f.setMenuBar(bar);
    f.setLayout(new FlowLayout());
    f.setVisible(true);
    f.setSize(500,500);
    f.setTitle("Java AWT Examples");
    Menu file = new Menu("File");
    Menu file1 = new Menu("Edit");
    Menu file2 = new Menu("About");
    file.add(new MenuItem("New   Ctrl+N"));
    file.add(new MenuItem("Open"));
    file.add(new MenuItem("Save"));
    file.add(new MenuItem("________"));
    file.add(new MenuItem("Show about"));
      file.add(new MenuItem("________"));
        file.add(new MenuItem("Exit"));
    bar.add(file);
       bar.add(file1);
          bar.add(file2);
    
    
    
  }
  public static void main(String args[])
  {
     
    menu1 m = new menu1();
  }

}