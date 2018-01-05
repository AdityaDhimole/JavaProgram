class Bc
{
      public static final float PI=3.14f;
}
class Dc extends Bc
{
        public void show()
           {
	PI=4.2f;
	System.out.println(PI);
           }
}
class Inhdemo8
{
    public static void main(String ar[])
       {
	new Dc().show();
	System.out.println("pi=:"+Dc.PI);
       }
}