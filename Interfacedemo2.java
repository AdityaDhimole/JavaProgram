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
	System.out.println("create Acc Sbi");
           }
      public void deposit()
          {
	System.out.println("deposit Sbi");
           }
      public void withDraw()
          {
	System.out.println("withdraw Sbi");
           }
}
class Pnb implements Bank
{
        public void createAcc()
          {
	System.out.println("create Acc Pnb");
           }
      public void deposit()
          {
	System.out.println("deposit Pnb");
           }
      public void withDraw()
          {
	System.out.println("withdraw pnb");
           }
}
public class Interfacedemo2
{
     public static void main(String ar[])
      {
              Bank b=null;
	b=new Sbi();
 	b.withDraw();
	b.deposit();
	b.createAcc();
	b=new Pnb();
 	b.withDraw();
	b.deposit();
	b.createAcc();

    }

}