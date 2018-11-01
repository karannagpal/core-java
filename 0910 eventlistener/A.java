import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="A" width="500" height="300"></applet>
*/

public class A extends Applet implements ItemListener
{
	Choice c1;
	public void init()
	{
		c1 = new Choice();
		c1.add("India");
		c1.add("Amarica");
		c1.add("England");

		add(c1);
		c1.addItemListener(this);

	}

	public void itemStateChanged(ItemEvent it)
	{
		repaint();
	}

	public void paint(Graphics g)
	{
		g.drawString("Selected country is: " + c1.getSelectedItem(), 30, 20);
	}

}