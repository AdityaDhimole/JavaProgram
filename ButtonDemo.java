import java.awt.*;
import java.awt.event.*;
class ActionDemo extends Frame implements ActionListener
{
      private TextField t1,t2,t3;
      private Button b1,b2,b3;
                 public ActionDemo()
	   {
	        setSize(150,160);
	        setVisible(true);
	initComp();    
	 }
                public void initComp()
	  {
	t1=new TextField(10);
	t2=new TextField(10);
	t3=new TextField(10);
	b1=new Button("sum");
	b2=new Button("sub");
	b3=new Button("div");
		
	setLayout(new FlowLayout());
	add(t1);add(t2);add(t3);
	add(b1);add(b2);add(b3);

	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	   }
             public void actionPerformed(ActionEvent e)
	 {
	     int x=Integer.parseInt(t1.getText());
	     int y=Integer.parseInt(t2.getText());
	     int z=0;
	     if(e.getSource()==b1)
	          {
	               z=x+y;
	               t3.setText(""+z);
	           }  
	    else if(e.getSource()==b2)
	             {
		z=x-y;
		t3.setText(""+z);
	              }
	   else if(e.getSource()==b3)
	        {
		z=x/y;
		t3.setText(""+z);
	           }
 	}
}
class ButtonDemo
{
    public static void main(String ar[])
          {
	new ActionDemo();
         }
}