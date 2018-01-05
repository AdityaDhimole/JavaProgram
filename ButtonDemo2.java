import java.awt.*;
import java.awt.event.*;
class ActionDemo extends Frame
{
      private TextField t1,t2,t3;
      private Button b1,b2,b3;
      private int x,y,z;
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
            b1.addActionListener(new ActionListener()
	      {
	   public void actionPerformed(ActionEvent e)
	         {
	              x=Integer.parseInt(t1.getText());
	              y=Integer.parseInt(t2.getText());
	               z=x+y;
	                  t3.setText("z=:"+z);
	            }
	       });
	  
   b2.addActionListener(new ActionListener()
	{
	   public void actionPerformed(ActionEvent e)
	         {
	              x=Integer.parseInt(t1.getText());
	              y=Integer.parseInt(t2.getText());
	               z=x-y;
	                  t3.setText("z=:"+z);
	          }
	 });         
        addWindowListener(new WindowAdapter()
	{
	 public void windowClosing(WindowEvent e)
	    {
	         System.exit(0);
	   }
	 });             
        }
};
class ButtonDemo2
{
    public static void main(String ar[])
          {
	new ActionDemo();
         }
}