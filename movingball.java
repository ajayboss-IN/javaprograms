import java.awt.*;
import java.applet.*;
/*<applet code="movingball"  width=500 height=500>
</applet>*/
public class movingball extends Applet implements Runnable
{
Thread t;
int x=0;
int y=0;
public void start()
{
t=new Thread(this);
t.start();
}
public void paint(Graphics g)
{
g.fillOval(x,y,50,50);
}
public void run()
{
try{
for(;;){
for(;;){
if(y==300)
break;
else
{
y=y+3;
x=x+3;
Thread.sleep(100);
repaint();
}
}
for(;;)
{
if(y==0)
break;
else
{
y=y-5;
x=x+3;
Thread.sleep(100);
repaint();
}
}					
run();
}
}
catch(InterruptedException ae)
{
}
}
}
