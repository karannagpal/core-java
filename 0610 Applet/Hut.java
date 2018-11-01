import java.applet.*;
import java.awt.*;

/*
<applet code="Hut" width="800" height="600"></applet>
*/

public class Hut extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("This is a applet hut", 300, 500);
		
		g.drawLine(150, 50, 50, 200);
		g.drawLine(150, 50, 250, 200);
		//the inverted v

		g.drawLine(50, 200, 50, 400);
		g.drawLine(250, 200, 250, 400);
		g.drawLine(50, 400, 250, 400);
		//under that v

		g.drawLine(150, 50, 500, 50);
		g.drawLine(250, 200, 600, 200);
		g.drawLine(250, 400, 600, 400);
		//three horizontal lines

		g.drawLine(500, 50, 600, 200);
		g.drawLine(600, 200, 600, 400);
		//three horizontal lines
	}
}