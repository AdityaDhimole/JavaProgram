class Test
{
     private int x;
     public void setValue()
              {
	x=20;
              }
     public void show()
         {
	int x=50;
           	System.out.println("x=:"+x);
	System.out.println("x="+this.x);
         }
}
class Demo3
{
    public static void main(String ar[])
         {
	Test t1=new Test();
	t1.setValue();
	t1.show();
         }
}