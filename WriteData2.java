import java.io.*;
class WriteData2
{
        public static void main(String ar[])
             {
	FileOutputStream fos=null;
	try{
	 //fos=new FileOutputStream("mydata.txt");
     fos=new FileOutputStream("mydata1.txt",true); // append 
	String s1="This is indore City";
		byte bt[]=s1.getBytes();	
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