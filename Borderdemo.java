import java.awt.*;
class Test extends Frame
{
         private Button b1,b2,b3,b4;
	public Test()
	 {
	       setSize(200,200);
	       setVisible(true);
	        initComp();	      
	}
	public void initComp()
	    {
	    b1=new Button("North");
	    b2=new Button("South");
	    b3=new Button("East");
	    b4=new Button("West");
	  setLayout(new BorderLayout());
	add(b1,"North");add(b2,"South");add(b3,"East");add(b4,"West");
         }
}
class Borderdemo
{
     public static void main(String ar[])
         {
	new Test();
         }
}