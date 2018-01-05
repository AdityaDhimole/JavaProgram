import java.awt.*;
import java.awt.event.*;
class ActionDemo extends Frame
{
      private TextField t1,t2,t3;
      private Button b1,b2,b3;
      private Checkbox ch1,ch2;
      private CheckboxGroup cg;
      private int x,y,z;
                 public ActionDemo()
	   {
	        setSize(250,260);
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
	cg=new CheckboxGroup();
	ch1=new Checkbox("Allow Editing",cg,true);
	ch2=new Checkbox("NotAllow Editing",cg,false);
	setLayout(new FlowLayout());
	add(t1);add(t2);add(t3);
	add(b1);add(b2);add(b3);
	add(ch1);add(ch2);
      ch1.addItemListener(new ItemListener()
	{
	  public void itemStateChanged(ItemEvent e)
	       {
	            t1.setEditable(true);
	            t2.setEditable(true);
	        }
	});

      ch2.addItemListener(new ItemListener()
	{
	  public void itemStateChanged(ItemEvent e)
	       {
	            t1.setEditable(false);
	            t2.setEditable(false);
	        }
	});

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
class ButtonDemo3
{
    public static void main(String ar[])
          {
	new ActionDemo();
         }
}