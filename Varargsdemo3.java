class Varargsdemo3
{
       public static void show(int...v)
            {
	for(int a :v)
	     System.out.println(a);	
	System.out.println("---------");         
        }
     public static void show(String...s)
	{
	for(String s1:s)
	      System.out.println(s1);
	} 
  public static void main(String...ar)
       {
	int a[]={10,20,30,40,50,60};
	show(a);
	
	show(1,2,3,4,5);
	show("abc","xyz","pqr");	
       }
}