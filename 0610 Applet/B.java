import java.applet.*;
import java.awt.*;

/*
<applet code="B" width="500" height="300"></applet>
*/

public class B extends Applet
{
	TextField t1, t2;
	Button b1;
	public void init()
	{
		t1 = new TextField(20);
		t2 = new TextField(10);
		b1 = new Button("Hello");

		add(t1);
		add(t2);
		add(b1);
	}
}