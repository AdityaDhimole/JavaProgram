public class Employee implements java.io.Serializable
{
          private int code,sal;
          private String name;
        transient  private String pwd;	
	public Employee()
	{
	}           
       public Employee(int code,String name,int sal,String pwd)
	{
	      this.code=code;
	      this.name=name;
	      this.pwd=pwd;     
	      this.sal=sal;
	}
          public void display()
	 {
	      System.out.println("code=:"+code);
	      System.out.println("Name=:"+name);
      	      System.out.println("pwd=:"+pwd);

	      System.out.println("salary=:"+sal);
	}
}