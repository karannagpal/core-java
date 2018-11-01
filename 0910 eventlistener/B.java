import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="B" width="500" height="300"></applet>
*/

public class B extends Applet implements ItemListener
{
	Checkbox c1, c2;
	public void init()
	{
		c1 = new Checkbox("Reading");
		c2 = new Checkbox("Writing");

		add(c1);
		add(c2);

		c1.addItemListener(this);
		c2.addItemListener(this);
	}

	public void itemStateChanged(ItemEvent it)
	{
		repaint();
	}

	public void paint(Graphics g)
	{
		g.drawString("Reading is: " + c1.getState(), 20, 50);
		g.drawString("Writing is: " + c2.getState(), 150, 50);
	}

}