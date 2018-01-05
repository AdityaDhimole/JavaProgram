class Exdemo1
{
     public void div(String s1,String s2)throws ArithmeticException,NumberFormatException
       {
            System.out.println("Start div ");
           int x=Integer.parseInt(s1);
           int y=Integer.parseInt(s2);
           int z=(x/y);
            System.out.println("z=:"+z);
            System.out.println("End div");
       }
}