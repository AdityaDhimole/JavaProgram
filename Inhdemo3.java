class Bc
{
  public Bc(int x)
       {
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
class Inhdemo3
{
    public static void main(String ar[])
       {
	Dc ob=new Dc();
       }
}