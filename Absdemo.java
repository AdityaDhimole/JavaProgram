abstract class Op
{
     public abstract  void sum();
}
class Isum extends Op
{
     public void sum()       
           {
	int x=10,y=20,z;
	z=x+y;
	System.out.println("z=:"+z);
           }
}
class Fsum extends Op
{
      public void sum()
           {
	float x=3.5f,y=3.2f,z;
	z=x+y;
	System.out.println("z=:"+z);
           }
}
class Absdemo
{
    public static void main(String ar[])
         {
  	Op ob=null;
	 ob=new Isum();
	  ob.sum();
	 ob=new Fsum();         
	  ob.sum();
}
}