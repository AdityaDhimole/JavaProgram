class ArrayDemo1
{
    public static void main(String ar[])
         {
	int x[]={5,6,7,8,9,4,4,5,7,9,10,20,30,40,50};
	/*
	System.out.println(x[0]);
	System.out.println(x[1]);
	System.out.println(x[2]);
	System.out.println(x[3]);
	System.out.println(x[4]);
	*/
	//System.out.println(x.length);        
	/*
	for(int i=0;i<x.length;i++)
	       {
	           System.out.println(x[i]);
	        }
	 */
	for(int a : x)
	    System.out.println(a);
       }
}






