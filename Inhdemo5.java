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
class Ibc extends Bc
{
         public Ibc()
            {
	super(13);
	System.out.println("default con in Ibc");
            }
        public Ibc(int x)
           {
	this();  
              System.out.println("one par con in Ibc "+x);
          }
}
class Dc extends Ibc
{
       public Dc()
           {
	this(5);
              System.out.println("default con in Dc");
           }
       public Dc(int x)
           {
	super(10);
              System.out.println("one  par con in Dc "+x);
           }
}
class Inhdemo5
{
    public static void main(String ar[])
       {
	new Dc();
       }
}