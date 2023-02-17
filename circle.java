import java.applet.*;
import java.awt.*;
/*<applet code="circle" width=500 height=500></applet>*/
public class circle extends Applet implements Runnable
{
Thread t;
int i=300,j=300;
public void start()
{
t=new Thread(this);
t.start();
}
public void run()
{
try{
while(i>10)
{
repaint();
Thread.sleep(250);
i+=10;
j-=10;
}
}
catch(Exception e)
{}
}
public void paint(Graphics g)
{
g.drawOval(i,i,j,j);}	}
