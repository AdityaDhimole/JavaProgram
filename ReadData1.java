import java.io.*;
class ReadData1
{
     public static void main(String ar[])
         {
	FileInputStream fis=null;
	//File f=new File("abc.txt");
	//fis=new FileInputStream(f);
	try{
	fis=new FileInputStream("abc.txt");
	int a=0;
		while((a=fis.read())!=-1)   // -1 EOF
		    {					         System.out.print((char)a);
	                      }
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
FileInputStream(String)
FileInputStream(File);
*/