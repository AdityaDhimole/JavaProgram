class Test 
{
         private int code,age;
         private String name;
    public Test(int code,int age,String name)
            {
	this.code=code;
	this.age=age;
	this.name=name;
             }  
    public  String toString()
            {
   return "Code :"+code+"\nName="+name+"\nAge="+age+"";
            }
}
class Stringdemo14
{
    public static void main(String ar[])
        {
	String s1=new String("This is indore");
	System.out.println(s1);
	Test t1=new Test(101,20,"Abc");
	System.out.println(t1);
        }
}

