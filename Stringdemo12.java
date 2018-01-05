class Stringdemo12
{
    public static void main(String ar[])
        {
	String s1=new String("This is indore City");
	String s2[]=s1.split(" ");
	//String s2[]=s1.split(" ",2);
	for(String s:s2)
	     System.out.println(s);
          }
}

