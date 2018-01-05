class Sbi
 {
    public static void main(String ar[])
      {
 	Bank ac1=new Bank();
	Bank ac2=new Bank();
	Bank ac3=new Bank();
	Bank ac4=new Bank();

	ac1.setAccDetails(101,"Abc",7000);
	ac2.setAccDetails(102,"Xyz",8000);
	ac3.setAccDetails(103,"Pqr",10000);
	ac4.setAccDetails(104,"aaa",12000);
	/*
	ac1.showAccDetails();
	ac2.showAccDetails();
	ac3.showAccDetails();
	ac4.showAccDetails();
	*/
	Bank.showAccDetails(ac1,ac2,ac3,ac4);

                  Bank.showTotal();
	Bank.withDraw(2000,ac1);
	Bank.showTotal();

      }

}