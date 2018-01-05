class Bc
{
  public Bc()
       {
	this(5);
             System.out.println("default con in Bc");
        }
  public Bc(int x)
       {
              System.out.println("one par con in Bc "+x);
        }
}
class Ibc extends Bc
{
         public Ibc()
            {
	this(10);
	System.out.println("default con in Ibc");
            }
        public Ibc(int x)
           {
            System.out.println("one par con in Ibc "+x);
          }
}
class Dc extends Ibc
{
       public Dc()
           {
	this(20);
              System.out.println("default con in Dc");
           }
       public Dc(int x)
           {
              System.out.println("one  par con in Dc "+x);
           }
}
class Inhdemo6
{
    public static void main(String ar[])
       {
	new Dc();
       }
}