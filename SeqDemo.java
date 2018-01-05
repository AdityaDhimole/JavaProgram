import java.io.*;
class SeqDemo
{
    public static void main(String ar[])
        {
	FileInputStream fis1=null;
	FileInputStream fis2=null;
	SequenceInputStream seq=null;
	try{
	fis1=new FileInputStream("mydata.txt");
	fis2=new FileInputStream("mydata1.txt");
	seq=new SequenceInputStream(fis2,fis1);
	   int a=0;
	    while((a=seq.read())!=-1)	
	            System.out.print((char)a);
	}
	catch(FileNotFoundException ex){}
	catch(IOException ex){}
        }
}