import java.awt.*;
class Listdemo extends Frame
{
     private List lst;
     private Choice ch;
     private TextArea ta;
       public Listdemo()
             {
	setSize(200,200);
	setVisible(true);
	initComp();             
}
     public void initComp()
           {
	lst=new List(3);
	ch=new Choice();
	ta=new TextArea(5,15);
	lst.add("Indore");
	lst.add("Ratlam");
	lst.add("bhopal");
	lst.add("Dewas");
	lst.add("pune");
	ch.add("Indore");
	ch.add("Ratlam");
	ch.add("bhopal");
	ch.add("Dewas");
	ch.add("pune");
	setLayout(new FlowLayout());
	add(lst);add(ch);add(ta);
           }
}
class Framedemo4
{
      public static void main(String ar[])
         {
	new Listdemo();
         }
}
