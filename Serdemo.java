import java.io.*;
class Serdemo
{
      public static void main(String ar[])
             {
	ObjectOutputStream oos=null;
	 FileOutputStream fos=null;
	try{
        fos=new FileOutputStream("xyz7.txt");
        oos=new ObjectOutputStream(fos);
Employee e=new Employee(101,"Abc",20000,"abc123");
	oos.writeObject(e);
	fos.close();
 	oos.close();	
      }
	catch(FileNotFoundException ex)
	 {
                             System.out.println(ex);
	}
	catch(IOException ex){
	                             System.out.println(ex);
	}


            }
}