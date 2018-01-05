class Bc
{
       protected int x;     
}
class Dc extends Bc
{
      private int x,z;
      public void setValue()
          {
	super.x=10;	
	x=20;
          }
    public void sum()
        {
	z=super.x+x;
	System.out.println("z=:"+z);
         }
}
class Inhdemo2
{
    public static void main(String ar[])
       {
	Dc ob=new Dc();
	ob.setValue();
	ob.sum();
       }

}