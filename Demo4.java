class A
{
    public void m1()
         {
	System.out.println("Hello M1");
         }
}
class B
{
      public A m1()
           {
              return new A();	
           }
}
class C
{
     public B m1()
          {
	return new B();
           }
}
class D
{
     public C m1()
         {
           return new C();
         }

}
class Demo4
{
    public static void main(String ar[])
         {
	/*
	D ob=new D();
	       C c1=ob.m1();	
	         B b1=c1.m1();		
	A a=b1.m1();
	a.m1();
	*/
new D().m1().m1().m1().m1();
  
       }
}