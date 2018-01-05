class Bc
{
  public Bc()
       {
	System.out.println("default con in Bc");
        }
  public Bc(int x)
       {
	this();  
          System.out.println("one par con in Bc "+x);
        }
}
class Dc extends Bc
{
       public Dc()
           {
              super(5);
            System.out.println("default con in Dc");
           }
}
class Inhdemo4
{
    public static void main(String ar[])
       {
	Dc ob=new Dc();
       }
}