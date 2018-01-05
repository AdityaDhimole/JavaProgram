import java.io.*;
class FileWriterDemo
{
     public static void main(String ar[])
         {
	try{
	File f=new File("mydata.txt");
	FileWriter fw=new FileWriter(f);
	fw.write("Hello java");

	fw.close();
	}
	catch(IOException ex)
	 {
	}
          }   
}