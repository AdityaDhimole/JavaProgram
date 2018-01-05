class StringBufferdemo2
{
     public static void main(String ar[])
         {
	StringBuffer s1=new StringBuffer("Hello");
	//s1.insert(2,5);
	s1.insert(4,true);
	//s1.setCharAt(2,'E');	
System.out.println(s1);
       }
}

// StringBuffer();
// StringBuffer(String);
/*
    insert(int pos,int);
    insert(int pos,float);
    insert(int pos,byte);
    insert(int pos,boolean);
    insert(int pos,char);
    insert(int pos,long);


*/

