import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="scaling2d" width=300 height=500></applet>*/
public class scaling2d extends Applet implements ActionListener
{
Label lt,lx,ly;
TextField sx,sy;
Button scaling;
public void init()
{
setFont(new Font("Arial",Font.BOLD,24));
lt=new Label("2d Transformation Scaling");
lx=new Label("2d Scaling Width position");
ly=new Label("2d Scaling Height position");
sx=new TextField(10);
sy=new TextField(10);
scaling=new Button("Scaling");
setFont(new Font("Arial",Font.PLAIN,12));
add(lt);
add(lx);
add(sx);
add(ly);
add(sy);
add(scaling);
scaling.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
String str=ae.getActionCommand();
repaint();
}
public void paint(Graphics g)
{
int x,y;
x=Integer.parseInt(sx.getText());
y=Integer.parseInt(sy.getText());
g.drawString("Before Scaling",100,75);
g.drawRect(100,100,100,120);
g.drawString("After Scaling",100,250);
g.drawRect(100,300,100*x,120*y);
}
}
