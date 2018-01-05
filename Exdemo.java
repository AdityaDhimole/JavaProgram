class Exdemo
{
      public static void main(String ar[])
           {
	try{
	int x=Integer.parseInt(ar[0]);
	int y=Integer.parseInt(ar[1]);
	int z=(x/y);
	System.out.println("z=:"+z);
	}
	catch(ArithmeticException ex)
	   {
	     //     System.out.println(ex);
	  //         System.out.println(ex.getMessage());
	 //    ex.printStackTrace();
	        System.out.println("div By Zero Error");   
	}
	catch(NumberFormatException ex)
	  {
	   //     System.out.println(ex);
	  //        System.out.println(ex.getMessage());
	 //   ex.printStackTrace();
	  System.out.println("Type only number ");
	  }
	catch(ArrayIndexOutOfBoundsException ex)
	    {
	           System.out.println("pass command value");
	   }  
	finally
	 {
	         System.out.println("Ok Bye!!!");
	}  
       }
}