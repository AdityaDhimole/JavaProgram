class Stringdemo7
{
    public static void main(String ar[])
        {
	String s1=new String("Hello");
	String s2=new String("hello");
               //  boolean b=(s1.equals(s2));
	  boolean b=(s1.equalsIgnoreCase(s2));
	System.out.println(b);
       }
}
