import java.io.*;
class Fdemo2
{
     public static void main(String ar[])
          {
	File f1=new File("d:\\aaa.txt");
	File f=new File("d:\\pqr.txt");
	
	boolean b=f.renameTo(f1);
	System.out.println(b);         
}
}