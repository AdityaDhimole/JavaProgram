abstract class Abs
{
     public abstract  void f1();
     public abstract  void f2();
}
abstract class C1 extends Abs
{
         public void f1()
               {
	System.out.println("Hello F1");
               }
}
class C2 extends C1
{
       public void f1()
             {
	super.f1();
	System.out.println("Hello f1 in C2 class");
              }
         public void f2()
              {
	System.out.println("Hello F2");
             }
}
class Absdemo1
{
    public static void main(String ar[])
         {
	C2 ob=new C2();
	
               ob.f1();
	
	ob.f2();
         }
}