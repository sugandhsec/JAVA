
import java.awt.*;
import java.applet.*;
public class appEg extends Applet
{
	public void paint(Graphics g)
	{
		//smiling face
		//g.drawOval(50,50,100,100);
		setBackground(Color.pink);
		/*g.setColor(Color.yellow);
		g.fillOval(50,50,300,300);
		g.setColor(Color.black);
		g.fillOval(100,100,50,50);
		g.fillOval(200,100,50,50);
		g.fillArc(100,180,100,150,-180,180);
		g.setColor(Color.red);
		g.fillArc(120,220,50,100,-180,180);*/

		//Circle mai triangle
		/*int x[]={175,100,250};
		int y[]={70,250,250};
		g.setColor(Color.yellow);
		g.fillOval(50,50,300,300);
		g.setColor(Color.green);
		g.fillPolygon(x,y,3);
		g.setColor(Color.black);
		g.drawString("ExtraBits",150,200);
		g.drawLine(150,202,200,202);*/
		
		//Drawing Ghar
		/*g.setColor(Color.green);
		g.fillRect(150,150,200,200);

		int x[]={250,150,350};
		int y[]={20,150,150};

		g.setColor(Color.red);
		g.fillPolygon(x,y,3);
		g.fillRect(200,250,100,100);*/

		//Stick Manas

		g.drawOval(100,100,70,70);
		g.drawLine(135,170,135,270);
		g.drawLine(135,270,70,320);
		g.drawLine(135,270,210,320);
	}
}