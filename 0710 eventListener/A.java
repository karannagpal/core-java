import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="A" width="500" height="300"></applet>
*/

public class A extends Applet implements ActionListener
{
	TextField t1, t2, t3;
	Button b1;

	public void init()
	{
		t1 = new TextField(10);
		t2 = new TextField(10);
		t3 = new TextField(10);
		b1 = new Button("sum");
		add(t1);
		add(t2);
		add(b1);
		add(t3);

		b1.addActionListener(this);

	}

	public void actionPerformed(ActionEvent ae)
	{
		int a, b, c;
		a = Integer.parseInt(t1.getText());
		b = Integer.parseInt(t2.getText());
		c = a + b;

		t3.setText("sum is " + c);
	}
}