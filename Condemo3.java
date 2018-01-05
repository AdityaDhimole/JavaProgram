class Test
{
    private static int x,y;
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
   public Test(Test t)
      {
              x=t.x;	
              y=t.y;
      }
    public void show()
       {
	System.out.println("x=:"+x);
	System.out.println("y=:"+y);
       }
}
class Condemo3
{
    public static void main(String ar[])
         {
	Test t1=new Test();
	Test t2=new Test(5,6);
	 Test t3=new Test(t1);
	t1.show();
	t2.show();
	t3.show();
        }
}