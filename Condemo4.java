class Test
{
    private  int x,y;
     public Test()
         {
	this(7,8);
	x=10;
	y=20;
	System.out.println("default con");
	System.out.println("x=:"+x);
	System.out.println("y=:"+y);
         }
     public Test(int x)
         {
	this.x=x;
	System.out.println("one par con");
	System.out.println("x=:"+x);
          }
    public Test(int x,int y)
          {
	this(4);
	this.x=x;
	this.y=y;
	System.out.println("Two par  con");
	System.out.println("x=:"+x);
	System.out.println("y=:"+y);
          }
  }
class Condemo4
{
    public static void main(String ar[])
         {
	new Test();
        }
}