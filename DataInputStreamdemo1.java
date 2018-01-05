import java.io.*;
class DataInputStreamdemo1
{
        public static void main(String ar[])
             {
	DataInputStream dis=null;
	try{
	 dis=new DataInputStream(System.in);
	 System.out.print("Enter The Code :");
	  int code=Integer.parseInt(dis.readLine());
	  System.out.print("Enter The Name :");
	  String name=dis.readLine();
	  System.out.print("Enter The City :");
	  String city=dis.readLine();
	   System.out.println("code=:"+code);
	   System.out.println("Name=:"+name);
	   System.out.println("city=:"+city);
	  }
	 catch(FileNotFoundException ex)
	 {}
	 catch(IOException ex)
	    {}
              }
}

/*
DataInputStream(InputStream);
      int readInt();
      float readFloat();
      double readDouble();
      char readChar();
      byte readByte();
      boolean readBoolean();
      String readLine();
*/
