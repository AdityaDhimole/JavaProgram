class Employee
{
      private int id,sal,age;
      private String name,city;
 public void setEmpDetails(int id,int sal,int age,String name,String city)
             {
	this.id=id;
	this.sal=sal;
	this.age=age;
	this.name=name;
	this.city=city;
            }
   public void showEmpDetails()
           {
	System.out.println("id=:"+id);
	System.out.println("Age=:"+age);
	System.out.println("Name=:"+name);
	System.out.println("sal=:"+sal);
	System.out.println("city=:"+city);
           }
}
class Demo
{
    public static void main(String ar[])
         {
	Employee e=new Employee();
	e.setEmpDetails(101,20000,20,"Abc","Indore");
	e.showEmpDetails();
         }
}