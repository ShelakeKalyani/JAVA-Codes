import java.applet.*;
import java.awt.*;
public class Concentric extends Applet
{
    //Initialize the applet
    public void init()
    {
	setBackground(Color.yellow);
    }
    //Draw cocentric circle
    public void paint(Graphics g)
    {
	g.setColor(Color.red);
	int rad=25;
	int dia=50;
	for(int i=0;i<5;i++)
	{
	    g.drawOval(250-(i*rad),250-(i*rad),(i+1)*dia,(i+1)*dia);
	}
    }
}