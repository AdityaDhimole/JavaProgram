import java.io.*;
class Fdemo3
{
     public static void main(String ar[])
          {
	File f1=new File("d:\\abc");
	String s[]=f1.list();

	for(String s1:s)
                     {
	          System.out.println(s1);
	   }
}
}