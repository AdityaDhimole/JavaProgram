import java.awt.*;
class Login extends Frame
{
    private Label l1,l2;
    private TextField t1,t2;
    private Button b1;
      public Login()  
         {
	setSize(200,200);
	setVisible(true);
	setTitle("Login");  
	initComp();
        }
     public void initComp()
        {
            l1=new Label("Uname");
            l2=new Label("password");
            t1=new TextField(10);
            t2=new TextField(10);
             t2.setEchoChar('#');
            b1=new Button("Login");
	setLayout(new FlowLayout());	
             add(l1);add(t1);add(l2);add(t2);
	add(b1);
			
        }


}
class Framedemo2
{
     public static void main(String ar[])
           {
  	new Login();
          }
}