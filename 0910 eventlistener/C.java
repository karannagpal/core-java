import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="C" width="800" height="500"></applet>
*/

public class C extends Applet implements ActionListener
{
	TextField t1, t2;
	Button b1;
	Checkbox c1, c2, c3, c4;

	public void init()
	{
		t1 = new TextField(10);
		t2 = new TextField(10);
		b1 = new Button("Compute");
		c1 = new Checkbox("HRA");
		c2 = new Checkbox("TA");
		c3 = new Checkbox("DA");
		c4 = new Checkbox("EPF");

		//add("enter bsal");
		add(t1);
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(b1);
		add(t2);

		b1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		int bsal, net;
		bsal = Integer.parseInt(t1.getText());
		net = bsal;

		if(c1.getState())
		{
			net = net + (bsal*10/100);
		}

		if(c2.getState())
		{
			net = net + (bsal*10/100);
		}
		if(c3.getState())
		{
			net = net + (bsal*10/100);
		}
		if(c4.getState())
		{
			net = net - (bsal*10/100);
		}



		t2.setText("net: " + net);
	}

}