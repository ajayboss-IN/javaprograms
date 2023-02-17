import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;
import java.math.*;
/*<applet code="Rotation2d" width=500 height=500></applet>*/
public class Rotation2d extends Applet implements ActionListener
{
Label lt,lx1,lx2,lx3,ly1,ly2,ly3;
TextField tx1,tx2,tx3,ty1,ty2,ty3;
Button blin;
public void init()
{
setFont(new Font("Arial",Font.BOLD,24));
lt=new Label("Roatation");
lx1=new Label("Enter x1");
lx2=new Label("Enter x2");
lx3=new Label("Enter x3");
ly1=new Label("Enter y1");
ly2=new Label("Enter y2");
ly3=new Label("Enter y3");
tx1=new TextField(10);
tx2=new TextField(10);
tx3=new TextField(10);
ty1=new TextField(10);
ty2=new TextField(10);
ty3=new TextField(10);
blin=new Button("Rotate");
setFont(new Font("Arial",Font.PLAIN,12));
add(lt);
add(lx1);
add(tx1);
add(lx2);
add(tx2);
add(lx3);
add(tx3);
add(ly1);
add(ty1);
add(ly2);
add(ty2);
add(ly3);
add(ty3);
add(blin);
blin.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
String str=ae.getActionCommand();
repaint();
}
public void paint(Graphics g)
{
int i,j,k;
double r=30*3.14/180;
int x1,y1,x2,y2,x3,y3,x11,y11,x22,y22,x33,y33;
x1=Integer.parseInt(tx1.getText());
y1=Integer.parseInt(ty1.getText());
x2=Integer.parseInt(tx2.getText());
y2=Integer.parseInt(ty2.getText());
x3=Integer.parseInt(tx3.getText());
y3=Integer.parseInt(ty3.getText());
g.drawString("Original Image",200,200);
g.drawLine(x1,y1,x2,y2);
g.drawLine(x2,y2,x3,y3);
g.drawLine(x1,y1,x3,y3);
double p1[][]=new double[3][3];
int p[][]=new int[3][3];
double t[][]=new double[3][3];
t[0][0]=t[1][1]=Math.cos(r);
t[0][1]=-(Math.sin(r));
t[1][0]=Math.sin(r);
t[2][2]=1;
t[0][2]=t[1][2]=t[2][0]=t[2][1]=0;
p[0][0]=x1;
p[0][1]=x2;
p[0][2]=x3;
p[1][0]=y1;
p[1][1]=y2;
p[1][2]=y3;
p[2][0]=p[2][1]=p[2][2]=1;
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
p1[i][j]=0;
for(k=0;k<3;k++)
{
p1[i][j]=p1[i][j]+t[i][k]*p[k][j];
}}
System.out.println();
}
x11=(int)p1[0][0];
x22=(int)p1[0][1];
x33=(int)p1[0][2];
y11=(int)p1[1][0];
y22=(int)p1[1][1];
y33=(int)p1[1][2];
g.drawString("Rotated Image",400,400);
g.drawLine(x11,y11,x22,y22);
g.drawLine(x22,y22,x33,y33);
g.drawLine(x11,y11,x33,y33);}
}