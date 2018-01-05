 class Bank
{
      private  int acno,bal;
      private  String name;
       private static int total;
       public void setAccDetails(int a,String n,int b)
            {
	acno=a;
	name=n;
	bal=b;
	total=total+bal;
            }
/*
   public void showAccDetails()
         {
	System.out.println("Acno :"+acno);
	System.out.println("Name :"+name);
	System.out.println("bal   :"+bal);
	System.out.println("------------------------");
          }
 */
 public static void showAccDetails(Bank...ac)
         {
	for(Bank b:ac)
	   {
                         System.out.println("acno :"+b.acno);
	      System.out.println("Name:"+b.name);
	      System.out.println("Bal  :"+b.bal);
	      System.out.println("------------------------");
	   }

         }




   public static void showTotal()
        {
	System.out.println("Total Cash :"+total);
	System.out.println("==================");
        }
  public static void withDraw(int amt,Bank ac)
           {
       if(ac.bal>=amt)
            {
	System.out.println("Tran comp for acno :"+ac.acno);
	System.out.println("Collect  Your Cash :"+amt);
	ac.bal=ac.bal-amt;
	total=total-amt;
	System.out.println("Rem bal "+ac.bal+"  for acno :"+ac.acno);
             }
        else
         System.out.println("Insufficent bal for acno :"+ac.acno);	
	System.out.println("==================");
     }
}