interface A
{
     void f1();
}
class Demo
{
     public static A show()
         {
	return new A()		
	    {
	         public void f1()
		{
		     System.out.println("Hello F1");
	                  }
	    };
         }
}
public class Interfacedemo10
{
     public static void main(String ar[])
      {
	A ob=Demo.show();
	ob.f1();
      }
}