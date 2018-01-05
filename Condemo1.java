class Test
{
    private int x,y;
     public Test()
         {
	x=10;
	y=20;
         }
    public void show()
       {
	System.out.println("x=:"+x);
	System.out.println("y=:"+y);
       }
}
class Condemo1
{
    public static void main(String ar[])
         {
	//Test t1=new Test();
	//t1.show();

	new Test().show();
        }
}