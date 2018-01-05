class Exdemo1
{
      public static void main(String ar[])
           {
	try{
	int x=Integer.parseInt(ar[0]);
	int y=Integer.parseInt(ar[1]);
	int z=(x/y);
	System.out.println("z=:"+z);
	}
	catch(Exception ex)
	 {
	         System.out.println("pass number only");
   	}
       }
}