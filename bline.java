import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="bline" width=500 height=500></applet>*/
public class bline extends Applet implements ActionListener
{
Label lt,lx1,ly1,lx2,ly2;
TextField tx1,ty1,tx2,ty2;
Button bline;
public void init(){
lt=new Label("Bresenhams Line algorithm");
lx1=new Label("enter x1");
lx2=new Label("enter x2");
ly1=new Label("enter y1");
ly2=new Label("enter y2");
tx1=new TextField(10);
tx2=new TextField(10);
ty1=new TextField(10);
ty2=new TextField(10);
bline=new Button("Draw Line Algorithm");
add(lt);
add(lx1);
add(tx1);               
add(lx2);
add(tx2);
add(ly1);
add(ty1);
add(ly2);
add(ty2);
add(bline);
bline.addActionListener(this);	}
public void actionPerformed(ActionEvent ae)
{
String str=ae.getActionCommand();
repaint();
}
public void paint(Graphics g)
{
int k;
double x,y,dx,dy,p,x1=0,x2=0,y1=0,y2=0;
int x3=200,y3=300,x4=600,y4=400;
x1=Double.parseDouble(tx1.getText());
x2=Double.parseDouble(tx2.getText());
y1=Double.parseDouble(ty1.getText());
y2=Double.parseDouble(ty2.getText());
dx=Math.abs(x2-x1);
dy=Math.abs(y2-y1);
x=x1;
y=y1;
p=2*dy-dx;
g.fillOval(200,500,5,5);
for(k=0;k<dx;k++)
{
if(p<0)
{
g.fillOval((int)x++,(int)y,5,5);
p=p+(2*dy);
}
else
{	
g.fillOval((int)x++,(int)y++,5,5);
p=p+(2*(dy-dx));
}
}}}
