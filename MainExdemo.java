class MainExdemo
{
    public static void main(String ar[])
   {
       Exdemo2 ob=new Exdemo2();
        System.out.println("start Main");
	try{
	ob.callDiv(ar[0],ar[1]);	
                  }
	catch(ArithmeticException ex)
	       {
	              System.out.println("div by zero Error");	
	       }
	catch(NumberFormatException ex)
	       {
	              System.out.println("pass only number value");	
	       }
	catch(ArrayIndexOutOfBoundsException ex)
	  {
                   System.out.println("pass command value");	

	   }
        System.out.println("end main");
   }
}