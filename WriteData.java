import java.io.*;
class WriteData
{
        public static void main(String ar[])
             {
	FileOutputStream fos=null;
	try{
	 //fos=new FileOutputStream("mydata.txt");
     fos=new FileOutputStream("mydata.txt",true); // append 
	fos.write(65);
	  
	  }
	 catch(FileNotFoundException ex)
	 {}
	 catch(IOException ex)
	    {}
	finally{
	try{
	       fos.close();
	      }
	     catch(IOException ex)
	    {}
	  
				
}
              }
}

/*
FileOutputStream(String);
FileOutputStream(File);
FileOutputStream(String,boolean);
FileOutputStream(File,boolean);
*/