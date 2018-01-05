class Varargsdemo1
{
       public static void sum(int...x)
            {
	for(int a :x)
	     System.out.println(a);	
	System.out.println("---------");         
    }
   public static void main(String ar[])
       {
	sum(1,2,3,4,5,6,7,8);
	sum(10,20,30,40);
	sum();
       }
}