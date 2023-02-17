import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.lang.*;
/*<applet code="dda" width=500 height=500></applet>*/
public class dda extends Applet implements ActionListener
{
Label lt,lx1,ly1,lx2,ly2;
TextField tx1,ty1,tx2,ty2;
Button bdda;
public void init(){
setFont(new Font("arial",Font.BOLD,24));
lt=new Label("DDA Algorithm");
lx1=new Label("Enter x1");
lx2=new Label("Enter x2");
ly1=new Label("Enter y1");
ly2=new Label("Enter y2");
tx1=new TextField(10);
tx2=new TextField(10);
ty1=new TextField(10);
ty2=new TextField(10);
bdda=new Button("Draw Line DDA");
add(lt);
add(lx1);
add(tx1);
add(lx2);
add(tx2);
add(ly1);
add(ty1);
add(ly2);
add(ty2);
add(bdda);                                         
bdda.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
String str=ae.getActionCommand();
repaint();
}
public void paint(Graphics g)
{
double dx,dy,steps,x,y,k;
double xc,yc,x1=10,x2=0,y1=0,y2=0;
x1=Double.parseDouble(tx1.getText());
x2=Double.parseDouble(tx2.getText());
y1=Double.parseDouble(ty1.getText());
y2=Double.parseDouble(ty2.getText());
dx=x2-x1;
dy=y2-y1;
if(Math.abs(dx)>Math.abs(dy))
steps=Math.abs(dx);
else
steps=Math.abs(dy);
xc=(dx/steps);
yc=(dy/steps);
x=x1;
y=y1;
for(k=1;k<=steps;k++)
{
x=x+xc;
y=y+yc;
g.fillOval((int)x,(int)y,5,5);
}
}
}
