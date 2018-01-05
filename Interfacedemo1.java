interface Bank
{
      void withDraw();
      void deposit();
      void createAcc();
}
class Sbi implements Bank
{
        public void createAcc()
          {
	System.out.println("create Acc");
           }
      public void deposit()
          {
	System.out.println("deposit");
           }
      public void withDraw()
          {
	System.out.println("withdraw");
           }

}
public class Interfacedemo1
{
     public static void main(String ar[])
      {
              Bank b=null;
	b=new Sbi();
 	b.withDraw();
	b.deposit();
	b.createAcc();
    }

}