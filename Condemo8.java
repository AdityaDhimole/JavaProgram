class Test
{
     private int x;
      public Test(int x)
           {
	this.x=x;
	System.out.println("Object  "+x + "  init.......");
            }
      public void finalize()
            {
System.out.println("Object  "+x + "  destroy========");
  x--;
           }
}
class Condemo8
{
         public static void main(String ar[])
	{
	int a=1;
	while(a<=150)
	  {	
	      new Test(a++);
	          if(a>=100)
		System.gc();	
	 }	   
           }
}



