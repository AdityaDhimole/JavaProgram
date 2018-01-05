import java.awt.*;
import java.awt.event.*;
class KeyAction extends Frame implements KeyListener
{
     public KeyAction()
            {
	setSize(200,200);
	setVisible(true);
	addKeyListener(this);
            }
    public void keyReleased(KeyEvent e)
        {
	setBackground(Color.red);
        }
    public void keyPressed(KeyEvent e)
        {
	setBackground(Color.green);
        }
   public void keyTyped(KeyEvent e)
         {
	setBackground(Color.blue);
         }

}
class KeyDemo
{
     public static void main(String ar[])
        {
	new KeyAction();
        }
}













