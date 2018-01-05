class StringBufferdemo1
{
     public static void main(String ar[])
         {
	StringBuffer s1=new StringBuffer("Hello");
	//System.out.println(s1.length());
	//System.out.println(s1.capacity());
	System.out.println(s1);
	s1.append("Indore");
	System.out.println(s1);
	s1.append(3.5f);
	System.out.println(s1);
	s1.append("This is indore City");
	System.out.println(s1);
       }
}

// StringBuffer();
// StringBuffer(String);
/*
   append(int);
   append(float);
   append(boolean);
   append(byte);
   append(short);
   append(long);
   append(double);
   append(char);
   append(String);



*/