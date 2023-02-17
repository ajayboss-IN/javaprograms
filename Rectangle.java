//Cascade or Tile
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="Rectangle" width=500  height=500></applet>*/
public class Rectangle extends Applet implements ActionListener
{
Label l1;
TextField tcho;
Button btn;
public void init()
{
l1=new Label("Enter the 1.Tile 2.Cascade");
		tcho=new TextField();
btn=new Button("Draw");
add(l1);
add(tcho);
add(btn);
btn.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
 repaint();
 }
public void paint (Graphics g)
{
if(Integer.parseInt(tcho.getText())==1)
{
g.drawString("Tile", 50, 50);
			g.drawRect(78, 86, 92, 92);
g.drawRect(296, 86, 92, 92);
g.drawRect(80, 254, 92, 92);
g.drawRect(303, 254, 92, 92);}
else
{
g.drawString("Cascade", 50, 50);
g.drawRect(60, 90, 100, 100);
			g.drawRect(90, 120, 100, 100);
g.drawRect(120, 150, 100, 100);
g.drawRect(150, 180, 100, 100);
   }
	}
 }
