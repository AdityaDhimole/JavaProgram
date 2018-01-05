class Exdemo2
{
      Exdemo1 ob=new Exdemo1();
     public void callDiv(String s1,String s2)throws ArithmeticException,NumberFormatException
         {
	System.out.println("start callDiv");
	ob.div(s1,s2);
	System.out.println("end callDiv");
         }
}