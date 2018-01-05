interface A
{
     void f1();
}
class Test
{
     public static void show(A a)
          {
	a.f1();
          }
}
class Interfacedemo12
{
      public static void main(String ar[])
           {
	Test.show(new A(){
		public void f1()
		    {
		         System.out.println("Hello F1");
		    }
		});
          }
}