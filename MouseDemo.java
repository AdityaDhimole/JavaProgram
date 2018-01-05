import java.awt.*;
import java.awt.event.*;
class MouseAction extends Frame implements MouseListener,MouseMotionListener
{
     public MouseAction()
            {
	setSize(200,200);
	setVisible(true);
	addMouseListener(this);
	addMouseMotionListener(this);
            }
   public void mouseExited(MouseEvent e)
       {
	setBackground(Color.green);
       }
   public void mouseEntered(MouseEvent e)
       {
	setBackground(Color.yellow);
       }
   public void mouseReleased(MouseEvent e)
       {
	setBackground(Color.red);
       }
   public void mousePressed(MouseEvent e)
       {
	setBackground(Color.blue);
       }
   public void mouseClicked(MouseEvent e)
       {
	setTitle("click");
       }
    public void mouseMoved(MouseEvent e)
           {
	 int x=e.getX();
	 int y=e.getY();
	setTitle("x=:"+x+"y=:"+y);
           }
   public void mouseDragged(MouseEvent e)
	{

	}
}
class MouseDemo
{
     public static void main(String ar[])
        {
	new MouseAction();
        }
}