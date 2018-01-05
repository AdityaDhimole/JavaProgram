class Bank
{
private int acno,bal;
public Bank(int acno,int bal)
{
this.acno=acno;
this.bal=bal;
}
synchronized public void withDraw(int amt)
{
try
{
if(bal>=amt)
{
System.out.println("Tran comp for acno:"+acno);
System.out.println("collect your cash"+amt+"for acno:"+acno);
bal=bal-amt;
Thread.sleep(1000);
System.out.println("Rem bal:"+bal+"for acno:"+acno);
}
else
System.out.println("Insufficient bal for acno:"+acno);
}
catch(InterruptedException ex)
{}
}
}
class Atm extends Thread
{
private Bank b=null;
public Atm(Bank b)
{
this.b=b;
}
public void run();
{
synchronized(b)
b.withDraw(8000);
}}}
class Thdemo6
{
public static void main(String arg[])
{
Bank ac1=new Bank(101,10000);
Bank ac2=new Bank(102,15000);
Atm c1=new Atm(ac1);
Atm c2=new Atm(ac2);
Atm c3=new Atm(ac3);
c1.start();
c2.start();
c3.start();
}
}