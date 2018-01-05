import java.io.*;
class WriteData1
{
        public static void main(String ar[])
             {
	FileOutputStream fos=null;
	try{
	 //fos=new FileOutputStream("mydata.txt");
     fos=new FileOutputStream("mydata1.txt",true); // append 
	byte bt[]={65,66,67,68,69,70,71,72};
	fos.write(bt);  
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