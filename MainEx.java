import p1.p2.Nage;
import p1.p2.Age;
class MainEx
{
     public static void main(String ar[])
       {
	Age ob=new Age();
	try{
	ob.decide(ar[0]);
	}
	catch(NumberFormatException ex)
	    {
	             System.out.println("pass number only");
	   }      
	catch(Nage n)
	    {
	           System.out.println(n);
	   }
	catch(ArrayIndexOutOfBoundsException ex)
	    {
	             System.out.println("pass command value");
	   }      

}
}