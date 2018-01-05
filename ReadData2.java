import java.io.*;
class ReadData2
{
     public static void main(String ar[])
         {
	FileInputStream fis=null;
	File f=new File("abc.txt");
	try{
	fis=new FileInputStream(f);
	byte bt[]=new byte[17];	
	   fis.read(bt);
	   String s1=new String(bt);  
	  System.out.println(s1); 
	}
	catch(FileNotFoundException ex)
	    {
	             System.out.println("File Not Exists");	
	    }
	catch(IOException ex)
	     {
	             }  
	finally{
	           try{	
	            fis.close();
		}
	            catch(IOException ex)
		 {
		}
	}  
     }
}
/*
int read()
int read(byte[]);
FileInputStream(String)
FileInputStream(File);
*/