package shapes2d;


import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Circle
{
	public static void main(String args[])
	{
		JFrame fr = new JFrame();
		fr.setBound(10,10,500,500);
		fr.setDefaultCloseOperatin(3);
		JPanel pn = new JPanel() {
			@override
			public void paint(Graphics g) {
				g.setColor(Color.red);
				g.fillOval(10,40,100,100);
			
		}
		
		
	};
	fr.add(pn);
	fr.setVisible(true);
	}
}