import java.io.*;
import java.util.*;
import java.sql.*;
class Fdemo1
{
     public static void main(String ar[])
          {
	File f=new File(ar[0]);
	
	long v=f.lastModified();
	System.out.println(v);
	java.util.Date dt=new java.util.Date(v);
	System.out.println(dt);

	java.sql.Date dt1=new java.sql.Date(v);
	System.out.println(dt1);

         }
}