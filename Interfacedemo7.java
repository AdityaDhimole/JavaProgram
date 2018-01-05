interface A
{
     void f1();
     void f2();
 }
class Test  implements A
{
        public void f1()
            {
	  System.out.println("Hello F1");
              }
         public void f2()
              {
	  System.out.println("Hello F2");
              }
}
class Demo
{
     public static A show()
         {
	return new Test();
         }
}
public class Interfacedemo7
{
     public static void main(String ar[])
      {
	A ob=Demo.show();
	ob.f1();
	ob.f2();
      }

}