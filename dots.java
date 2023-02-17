import java.awt.*;
import java.applet.*;
/*<applet code="dots" width=800 height=500></applet>*/
public class dots extends Applet implements Runnable
{
int x=0,y=0;
Thread t;
Dimension d;
public void init()
{
t=new Thread(this);
t.start();
}
public void run()
{
while(true)
{
try{
repaint();
Thread.sleep(10);
}
catch(Exception e)
{}
}
}
public void paint(Graphics g)
{
d=getSize();
x=(int)(Math.random()*d.getWidth());
y=(int)(Math.random()*d.getHeight());
g.fillOval(x,y,50,50);	}}
