 /*30
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Division extends JFrame implements ActionListener
{
Container c;
JButton btn;
JLabel lbl1,lbl2,lbl3;
JTextField tf1,tf2,tf3;
JPanel p;

Division()
{
super("Exception Handler");
c=getContentPane();
c.setBackground(Color.red);
btn=new JButton("DIVIDE");
btn.addActionListener(this);
tf1=new JTextField(30);
tf2=new JTextField(30);
tf3=new JTextField(30);
lbl1=new JLabel("NUM 1");
lbl2=new JLabel("NUM 2");
lbl3=new JLabel("RESULT");
p=new JPanel();
p.setLayout(new GridLayout(3,2));
p.add(lbl1);
p.add(tf1);
p.add(lbl2); p.add(tf2);
p.add(lbl3); p.add(tf3);
c.add(new JLabel("Division"),"North");
c.add(p,"Center");
c.add(btn,"South");
}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==btn)
{
try
{
int a=Integer.parseInt(tf1.getText());
int b=Integer.parseInt(tf2.getText());
int c=a/b;
tf3.setText(" "+c);
}
catch(NumberFormatException ex)
{
tf3.setText("-");
JOptionPane.showMessageDialog(this,"NumberFormatException");
}
catch(ArithmeticException ex)
{
tf3.setText("-");
JOptionPane.showMessageDialog(this,"Division by zero");
}
catch(Exception ex)
{
tf3.setText("-");
JOptionPane.showMessageDialog(this,"Other Err "+ex.getMessage());
}
}
}
//actionPerformed
}
class hello
{
public static void main(String args[])
{
Division b=new Division();
b.setSize(200,200);
b.setVisible(true);
}

}*/

 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Division extends Frame implements ActionListener
{
Container c;
Button btn;
Label lbl1,lbl2,lbl3;
TextField tf1,tf2,tf3;
Panel p;

Division()
{
super("Exception Handler");
//c=getContentPane();
//c.setBackground(Color.red);
btn=new Button("DIVIDE");
btn.addActionListener(this);
tf1=new TextField(30);
tf2=new TextField(30);
tf3=new TextField(30);
lbl1=new Label("NUM 1");
lbl2=new Label("NUM 2");
lbl3=new Label("RESULT");
p=new Panel();
p.setLayout(new GridLayout(3,2));
p.add(lbl1);
p.add(tf1);
p.add(lbl2); p.add(tf2);
p.add(lbl3); p.add(tf3);
add(new Label("Division"),"North");//
add(p,"Center");
add(btn,"South");
}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==btn)
{
try
{
int a=Integer.parseInt(tf1.getText());
int b=Integer.parseInt(tf2.getText());
int c=a/b;
tf3.setText(" "+c);
}
catch(NumberFormatException ex)
{
tf3.setText("-");
JOptionPane.showMessageDialog(this,"NumberFormatException");
}
catch(ArithmeticException ex)
{
tf3.setText("-");
JOptionPane.showMessageDialog(this,"Division by zero");
}
catch(Exception ex)
{
tf3.setText("-");
JOptionPane.showMessageDialog(this,"Other Err "+ex.getMessage());
}
}
}
//actionPerformed
}
class hello
{
public static void main(String args[])
{
Division b=new Division();
b.setSize(200,200);
b.setVisible(true);
}

}