import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="translation2d" width=500 height=500>
</applet>
*/
public class translation2d extends Applet implements ActionListener
{
Label lt,lx,ly;
TextField tx,ty;
Button translate;
public void init()
{
lt=new Label("2d Transformation Translation");
lx=new Label("Enter Translation Left position");
ly=new Label("Enter Translation Top position");
tx=new TextField(10);
ty=new TextField(10);
translate=new Button("Translation");
add(lt);
add(lx);
add(tx);
add(ly);
add(ty);
add(translate);
translate.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
repaint();
}
public void paint(Graphics g)
{
int x,y;
x=Integer.parseInt(tx.getText());
y=Integer.parseInt(ty.getText());
g.drawString("Before Translation",100,75);
g.drawRect(100,200,100,120);
g.drawString("After Translation",300,250);
g.drawRect(100+x,200+y,100,120);
}
}