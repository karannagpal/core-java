import java.applet.*;
import java.awt.*;

/*
<applet code="A" width="500" height="300"></applet>
*/

public class A extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("welcome", 100, 150);
		g.drawString("Hello", 100, 180);
		g.drawLine(10, 10, 80, 80);
		g.drawRect(20, 20, 40, 60);

		Color cred = new Color(255, 0, 0);
		g.setColor(cred);
		g.drawOval(80, 70, 30, 30);
		g.drawRect(80, 70, 40, 80);

		Color cblue = new Color(0, 0, 255);
		g.setColor(cblue);
		g.fillOval(10, 40, 10, 10);
		g.fillRect(200, 20, 50, 70);
		
		
		g.drawOval(10, 10, 20, 20);
	}
}