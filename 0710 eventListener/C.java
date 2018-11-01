//<<repaint>>

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="C" width="500" height="300"></applet>
*/

public class C extends Applet implements ActionListener
{
	TextField t1, t2, t3;
	Button b1, b2;
	int c = 0;

	public void init()
	{
		t1 = new TextField(10);
		t2 = new TextField(10);
		b1 = new Button("sum");
		b2 = new Button("prod");
		add(t1);
		add(t2);
		add(b1);
		add(b2);

		b1.addActionListener(this);
		b2.addActionListener(this);

	}

	public void actionPerformed(ActionEvent ae)
	{
		//this will return the label of button clicked
		String s = ae.getActionCommand();


		int a, b;
		a = Integer.parseInt(t1.getText());
		b = Integer.parseInt(t2.getText());
		
		if(s.equals("sum"))
		{
			c = a + b;
		}
		else if(s.equals("prod"))
		{
			c = a * b;
		}

		//t3.setText("result is " + c);
		repaint();
	}

	public void paint(Graphics g)
	{
		g.drawString("result is " + c, 50, 100);
	}
}