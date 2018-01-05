class Stringdemo3
{
    public static void main(String ar[])
        {
	char ch[]={'A','B','C','D','E','F','G','H','I','J'};
	//String s1=new String(ch);
	String s1=new String(ch,2,6);
	System.out.println(s1);
        }
}
/*String();
String(String);
String(chra[]);
String(char[],int,int)
String(byte[]);
String(byte[],int,int)*/