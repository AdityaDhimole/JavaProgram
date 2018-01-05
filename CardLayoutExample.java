import java.awt.*;
import java.awt.event.*;
public class CardLayoutExample 
{
   public static void main(String[] arguments)
 {
         Frame f=new Frame(); 
         f.setSize(200,200);
         f.setVisible(true);
         f.setLayout(new BorderLayout());
        CardLayout cardLayout = new CardLayout(); 
        Panel cardPanel = new Panel(cardLayout);
       
        Panel card1 = new Panel();
        card1.setBackground(Color.red);
 
      Panel card2 = new Panel();
     card2.setBackground(Color.blue);
     card2.add(new TextField(10));
 
     Panel card3 = new Panel();
     card3.setBackground(Color.green);
     card3.add(new TextField(10));

     Panel card4 = new Panel();
     card3.setBackground(Color.yellow);
      Panel card5=new Panel();
       card5.setBackground(Color.black);
        card5.add(new Button("Button-1"));
	card5.add(new TextField(10));

    cardPanel.add(card1,"RedCard");
    cardPanel.add(card2,"BlueCard");
     cardPanel.add(card3,"GreenCard");
     cardPanel.add(card4,"YellowCard");
     cardPanel.add(card5,"BlackCard");
   
    Panel buttonPanel = new Panel();
     Button b1 = new Button("Red");
     Button b2 = new Button("Blue");
     Button b3 = new Button("Green");
     Button b4 = new Button("Yellow");
     Button b5 = new Button("Black");
   
    buttonPanel.add(b1);
    buttonPanel.add(b2);
    buttonPanel.add(b3);
    buttonPanel.add(b4);
   buttonPanel.add(b5);
    
 // create action listeners for buttons
      b1.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent event) 
             {
                  cardLayout.show(cardPanel, "RedCard");
            }
    });
 
    b2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        cardLayout.show(cardPanel, "BlueCard");
      }
    });
    b3.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent event) {
        cardLayout.show(cardPanel, "GreenCard");
      }
    });
    b4.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent event) {
        cardLayout.show(cardPanel, "YellowCard");
      }
    });
    b5.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent event) {
        cardLayout.show(cardPanel, "BlackCard");
      }
    });
 
    f.add(cardPanel,BorderLayout.CENTER);
    f.add(buttonPanel,BorderLayout.SOUTH);
  }
}