import java.io.*;
class DataOutputStreamdemo1
{
        public static void main(String ar[])
             {
	DataOutputStream dos=null;
	FileOutputStream fos=null;
      	try{
	  fos=new FileOutputStream("mydata3.txt");
	 dos=new DataOutputStream(fos);
	// dos.writeFloat(3.5f);
	    dos.writeBoolean(true);
	  }
	 catch(FileNotFoundException ex)
	 {}
	 catch(IOException ex)
	    {}
	 finally{
	          try{
	               fos.close();
		 dos.close();
		}
	              catch(IOException ex){}
	
	}
              }
}

/*
DataOutputStream(OutputStream);
 void writeInt(int);     
void writeChar(char);     
void writeByte(byte);     
void writeLong(long);     
void writeFloat(float);     
void writeDouble(double);     
void writeShort(short);     
void writeBoolean(boolean);
void writeChars(String);
*/
