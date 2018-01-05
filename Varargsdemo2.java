class Varargsdemo2
{
       public static void sum(int x,int y,int...v)
            {
	System.out.println("x=:"+x);
	System.out.println("y=:"+y);
	for(int a :v)
	     System.out.println(a);	
	System.out.println("---------");         
    }
   public static void main(String ar[])
       {
	sum(1,2,3,4,5,6,7,8);
	sum(10,20,30,40);
	sum(5,6);
       }
}