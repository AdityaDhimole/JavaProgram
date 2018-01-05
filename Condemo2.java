class Test
{
    private int x,y;
     public Test()
         {
	x=10;
	y=20;
         }
    public Test(int x,int y)
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
class Condemo2
{
    public static void main(String ar[])
         {
	Test t1=new Test();
	Test t2=new Test(5,6);
	t1.show();
	t2.show();
        }
}