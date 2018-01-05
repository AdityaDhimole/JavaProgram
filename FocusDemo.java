import java.awt.*;
import java.awt.event.*;
class FocusAction extends Frame implements FocusListener
{
   private TextField t1;
     public FocusAction()
            {
	setSize(200,200);
	setVisible(true);
	t1=new TextField(10);
	setLayout(new FlowLayout());
	add(t1);
	add(new Button("Button-1"));
	t1.addFocusListener(this);
            }
     public void focusLost(FocusEvent e)
           {
	t1.setBackground(Color.red);
            }
   public void focusGained(FocusEvent e)
	{
	t1.setBackground(Color.green);
	}
}
class FocusDemo
{
     public static void main(String ar[])
        {
	new FocusAction();
        }
}













