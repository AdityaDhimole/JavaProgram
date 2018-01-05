class Test
{
     private int x,y;
     public void setValue(int x,int y)
              {
	this.x=x;
	this.y=y;
              }
     public void show()
         {
           	System.out.println("x=:"+x);
	System.out.println("y=:"+y);    
         }
}
class Demo2
{
    public static void main(String ar[])
         {
	Test t1=new Test();
	t1.setValue(5,6);
	t1.show();
         }
}