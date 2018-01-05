class Test
{
         static{
	System.out.println("Hello static block");
	}

     public Test()
         {
	System.out.println("default con");
         }
     {
	System.out.println("No Name block");
      }  
}
class Condemo5
{
    public static void main(String ar[])
         {
	new Test();
        }
}