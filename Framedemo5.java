import java.awt.*;
class Menudemo extends Frame
{
    private MenuBar mb;
    private Menu m1,m2,m3;
    private MenuItem i1,i2,i3,i4,i5,i6,i7,i8,i9;
       public Menudemo()
             {
	setSize(200,200);
	setVisible(true);
	initComp();             
}
     public void initComp()
           {
	mb=new MenuBar();
	setMenuBar(mb);
	m1=new Menu("File");
	m2=new Menu("Edit");
	m3=new Menu("Color");
	i1=new MenuItem("New");
	i2=new MenuItem("Open");
	i3=new MenuItem("Save");
	
	i4=new MenuItem("Cut");
	i5=new MenuItem("Copy");
	i6=new MenuItem("Paste");

	i7=new MenuItem("Red");
	i8=new MenuItem("Green");
	i9=new MenuItem("Blue");
	
	mb.add(m1);mb.add(m2);//mb.add(m3);
	m1.add(i1);m1.add(i2);m1.add(i3);
	m2.add(i4);m2.add(i5);m2.add(i6);
	m2.add(m3);
	m3.add(i7);m3.add(i8);m3.add(i9);
           }
}
class Framedemo5
{
      public static void main(String ar[])
         {
	new Menudemo();
         }
}
