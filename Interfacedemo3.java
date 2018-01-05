interface A
{
     void f1();
}
interface B
{
     void f2();
 }
interface C
{
      void f3();
}
class Test  implements A,B,C
{
            public void f1()
	{
	      System.out.println("Hello F1");
	}
	 public void f2()
	{
	      System.out.println("Hello F2");
	}
 	public void f3()
	{
	     System.out.println("Hello F3");
	}
}
public class Interfacedemo3
{
     public static void main(String ar[])
      {
	Test t1=new Test();
	t1.f1();
	t1.f2();
	t1.f3();
      }

}