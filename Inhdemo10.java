class Bc
{
         public final void show()
              {
                     System.out.println("Hello show in Bc");
               } 
}
class Dc extends Bc
{
           public  void show()
              {
                     System.out.println("Hello show in Dc");
               } 
      public void disp()
             {
	 System.out.println("display");
              } 
}
class Inhdemo10
{
    public static void main(String ar[])
       {
	Bc ob=null;
	ob=new Dc();
	  ob.show();
	ob=new Bc();
	ob.show();
       }
}

 