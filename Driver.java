interface Vehical
{
     void engine();
     void breaks();
     void ac();
}
abstract class Bus implements Vehical
{
     public void breaks()
         {
                 System.out.println("bus stop");
        }
}
class RedBus extends Bus
{
      public void engine()
           {
       System.out.println("redBus engine capacity 200 kmph");
           }
    public void ac()
          {
	System.out.println("Non-Ac Bus");
         }
}
class Cbus extends Bus
{
          public void engine()
           {
       System.out.println("CBus engine capacity 400 kmph");
           }
    public void ac()
          {
	System.out.println("Ac Bus");
         }
}
class Driver
{
     public static void main(String ar[])
           {
	Vehical v=null;
	v=new RedBus();
	v.breaks();
	v.engine();
	v.ac();
	v=new Cbus();
	v.breaks();
	v.engine();
	v.ac();
	
          }
}