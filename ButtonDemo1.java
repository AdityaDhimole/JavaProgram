import java.awt.*;
import java.awt.event.*;
class ActionDemo extends Frame
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
            b1.addActionListener(new C1());
            b2.addActionListener(new C2());
            b3.addActionListener(new C3());

	}
        class C1 implements ActionListener
               {
	public void actionPerformed(ActionEvent e)
	      {
	int x=Integer.parseInt(t1.getText().trim());	
	int y=Integer.parseInt(t2.getText().trim());	
	int z=x+y;
	t3.setText("z=:"+z);
    	}
      }
    class C2  implements ActionListener
            {
	public void actionPerformed(ActionEvent e)
	   {
	int x=Integer.parseInt(t1.getText().trim());	
	int y=Integer.parseInt(t2.getText().trim());	
	int z=x-y;
	t3.setText("z=:"+z);
	   }
            } 
    class C3  implements ActionListener
            {
	public void actionPerformed(ActionEvent e)
	   {
	int x=Integer.parseInt(t1.getText().trim());	
	int y=Integer.parseInt(t2.getText().trim());	
	int z=x/y;
	t3.setText("z=:"+z);
	   }
 }
};
class ButtonDemo1
{
    public static void main(String ar[])
          {
	new ActionDemo();
         }
}