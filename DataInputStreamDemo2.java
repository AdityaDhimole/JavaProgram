import java.io.*;
class DataInputStreamDemo2
{
  public static void main(String ar[])
   {
         FileInputStream fis=null;
         DataInputStream dis=null;
	try{
        fis=new FileInputStream("mydata3.txt");
         dis=new DataInputStream(fis);
	 // float f=dis.readFloat();	
//	System.out.println(f);
	boolean b=dis.readBoolean();
	System.out.println(b);
	  }
	catch(FileNotFoundException ex){}
	catch(IOException ex){}
	finally{
	       try{
		fis.close();
		dis.close();
	          }
	catch(IOException ex){}
}
   }
}