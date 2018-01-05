import java.io.*;
class ReadData3
{
     public static void main(String ar[])
         {
	FileInputStream fis=null;
	File f=new File("abc.txt");
	try{
	fis=new FileInputStream(f);
	int av=0;
	 av=fis.available();
	System.out.println("av=:"+av);
	byte bt[]=new byte[av];	
	fis.skip(5);	
	fis.read(bt);
	  for(byte b :bt)
	       System.out.print((char)b);
	 av=fis.available();
	System.out.println("\nav=:"+av);
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