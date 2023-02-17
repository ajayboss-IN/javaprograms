import java.math.*;
import java.awt.*;
import java.applet.*;
/*<applet code="midptcircle" width=500 height=500></applet>*/
public class midptcircle extends Applet {
public void paint(Graphics g){
int r=150;
int d=(5/4)*r;
int x=0;
int y=r;
do
{
g.setColor(Color.red);
g.drawLine(y+200,x+200,y+200,x+200);
g.drawLine(x+200,y+200,x+200,y+200);
g.drawLine(x+200,-y+200,x+200,-y+200);
g.drawLine(y+200,-x+200,y+200,-x+200);
g.drawLine(-y+200,-x+200,-y+200,-x+200);
g.drawLine(-x+200,-y+200,-x+200,-y+200);
g.drawLine(-x+200,y+200,-x+200,y+200);
g.drawLine(-y+200,x+200,-y+200,x+200);
if(d<0)
d=d+2*x+1;
else
{
d=d+2*(x-y)+1;
y=y-1;
}
x=x+1;
}
while(x<y);}}
