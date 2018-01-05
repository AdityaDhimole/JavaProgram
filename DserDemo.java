import java.io.*;
class DserDemo
{
      public static void main(String ar[])
        {
	FileInputStream fis=null;
	ObjectInputStream ois=null;
	try{
	fis=new FileInputStream("xyz7.txt");
	ois=new ObjectInputStream(fis);
	    Object ob=ois.readObject();
	  Employee em=(Employee)ob;  
	  em.display();
	fis.close();
	ois.close();	
       }
	catch(ClassNotFoundException ex)
	 {}
	catch(IOException ex){}

       }
}