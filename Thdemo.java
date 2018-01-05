class Th1 extends Thread
{
private even,odd;
public Th1(even)
{
super(even);
this.even no=even no;
}
public void run()
{
System.out.println(even);
}
}
class Th2 implements Runnable
{
public Th2(odd)
{
super(odd)
this.odd no=odd no;
}
public void run()
{
}
System.out.println(odd);
}
class Thdemo
{
public static void main(String arg[])
{
Thread Th1=new Thread();
Thread Th2=new Thread();
Th1.start();
Th2.start();
}
}