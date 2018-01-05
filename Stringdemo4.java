class Stringdemo4
{
    public static void main(String ar[])
        {
	byte bt[]={65,66,67,68,69,70,71,72,73,112};
	//String s1=new String(bt);
	String s1=new String(bt,2,5);
	System.out.println(s1);
        }
}
/*String();
String(String);
String(chra[]);
String(char[],int,int)
String(byte[]);
String(byte[],int,int)*/