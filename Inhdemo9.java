class Bc
{
         public void show()
              {
                     System.out.println("Hello show in Bc");
               } 
}
class Dc extends Bc
{
           public void show()
              {
                     System.out.println("Hello show in Dc");
  	  super.show();
               } 
 }
class Inhdemo9
{
    public static void main(String ar[])
       {
	Dc ob=new Dc();
	ob.show();
       }
}

 