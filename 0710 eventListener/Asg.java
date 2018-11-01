//assingment

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="Asg" width="500" height="300"></applet>
*/

public class Asg extends Applet implements ActionListener
{
	Button left, right, grow, shrink, up, down;
	int x = 100, y = 100, w = 20, h = 20;

	public void init()
	{
		left = new Button("left");
		right = new Button("right");
		grow = new Button("grow");
		shrink = new Button("shrink");
		up = new Button("up");
		down = new Button("down");

		add(left);
		add(right);
		add(grow);
		add(shrink);
		add(up);
		add(down);

		left.addActionListener(this);
		right.addActionListener(this);
		grow.addActionListener(this);
		shrink.addActionListener(this);
		up.addActionListener(this);
		down.addActionListener(this);

	}

	public void actionPerformed(ActionEvent ae)
	{
		//this will return the label of button clicked
		String s = ae.getActionCommand();

		if(s.equals("left"))
		{
			x = x - 5;
		}
		else if(s.equals("right"))
		{
			x = x + 5;
		}
		else if(s.equals("grow"))
		{
			w = w + 2;
			h = h + 2;
		}
		else if(s.equals("shrink"))
		{
			w = w - 2;
			h = h - 2;
		}
		else if(s.equals("up"))
		{
			y = y - 5;
		}
		else if(s.equals("down"))
		{
			y = y + 5;
		}

		repaint();
	}

	public void paint(Graphics g)
	{
		g.drawOval(x, y, w, h);
	}
}