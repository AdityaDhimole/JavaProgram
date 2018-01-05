import java.io.*;
class Fdemo
{
     public static void main(String ar[])
          {
	File f=new File("d:\\pqr");
	       if(f.exists())
                          {	
	          if(f.isFile())
	          {
	            long len=f.length();	
	           System.out.println(len);
	         }
	         else
	              System.out.println(f.toString()+ "not a File");
	    }
	 else
	   System.out.println(f.toString()+" Not Exists");
         }
}