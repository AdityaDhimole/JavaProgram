import java.awt.*;
class Checkdemo extends Frame
{
   private Checkbox ch1,ch2,ch3,ch4;
   private CheckboxGroup cg;
       public Checkdemo()
             {
	setSize(200,200);
	setVisible(true);
	initComp();             
}
     public void initComp()
           {
	ch1=new Checkbox();
	ch2=new Checkbox("play",true);
	cg=new CheckboxGroup();
	ch3=new Checkbox("male",cg,true);
	ch4=new Checkbox("Female",cg,false);
		setLayout(new FlowLayout());
	add(ch1);add(ch2);add(ch3);add(ch4);
           }
}
class Framedemo3
{
      public static void main(String ar[])
         {
	new Checkdemo();
         }
}
