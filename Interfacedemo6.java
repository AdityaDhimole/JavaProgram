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
     public static void show(A ob)
         {
	ob.f1();
	ob.f2();
          }
}
public class Interfacedemo6
{
     public static void main(String ar[])
      {
	Demo.show(new Test());
      }

}