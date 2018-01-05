import java.io.*;
class FileReaderDemo
{
     public static void main(String ar[])
         {
	try{
	File f=new File("mydata.txt");
	FileReader fr=new FileReader(f);
	 int a=0;
	while((a=fr.read())!=-1)	   
	          System.out.print((char)a);
	}
	catch(IOException ex)
	 {
	}
          }   
}