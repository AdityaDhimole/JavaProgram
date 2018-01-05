import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.JPopupMenu;
import com.sun.java.swing.plaf.motif.MotifLookAndFeel;
public class Editor extends Frame implements ActionListener
{
    MenuBar mb;
    Menu m1,m2,m3;
    MenuItem i1,i2,i3,i4,i5,i6,i7,i8,i9,i10;
    TextArea ta;
    Dialog d1;
    Checkbox c1,c2;
    Label l1;
    Choice ch;
    Button b1;
  public Editor()
           {
	
	initComponent();

             }
          public void initComponent()
              {
	ta=new TextArea();
	add(ta);
	createMenu();
	createFontDialog();
               }
            public void changeFonts()
                 {
	int size=Integer.parseInt(ch.getSelectedItem());
	int style=Font.PLAIN;

	if(c1.getState()==true && c2.getState()==true)
	{
	style=Font.BOLD+Font.ITALIC;
	}
	else if(c1.getState()==true && c2.getState()==false)
	{
	style=Font.BOLD;
	}
	if(c1.getState()==false && c2.getState()==true)
	{
	style=Font.ITALIC;
	}
	Font fnt=new Font("Arial",style,size);
	ta.setFont(fnt);
	d1.dispose();
}
public void createFontDialog()
{
	d1=new Dialog(this);
	l1=new Label("Font-Size");
	c1=new Checkbox("Bold");
	c2=new Checkbox("Italic");
	b1=new Button("Apply"); 
	b1.addActionListener(this);
	ch=new Choice();	
	for(int i=10;i<=80;i++)
                     {ch.add(""+i);}
	d1.setSize(500,100);
	d1.setLocation(120,100);
	d1.setLayout(new FlowLayout());
	d1.add(l1);d1.add(ch);d1.add(c1);d1.add(c2);d1.add(b1);

 }
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==i1)
	{
		ta.setText("");
	}
	else if(e.getSource()==i2)
	{
  FileDialog fd=new FileDialog(this,"Select for Opening",FileDialog.LOAD);
		fd.setVisible(true);
		String s1=fd.getDirectory();
		String s2=fd.getFile();
		String path=s1+s2;
		setTitle(path);
		try
		{
		File f=new File(path);
		FileInputStream fs=new FileInputStream(f);
		byte b[]=new byte[(int)f.length()];	
		fs.read(b);
		String s=new String(b);
		ta.setText(s);
		fs.close();
		}
		catch(Exception ex){}
	}
	else if(e.getSource()==i3)
	{
	FileDialog fd=new FileDialog(this,"Select for Saving",FileDialog.SAVE);
		fd.setVisible(true);
		String path=fd.getDirectory()+fd.getFile();
		setTitle(path);
		try
		{
		FileOutputStream fs=new FileOutputStream(path);
		String data=ta.getText();
		byte b[]=data.getBytes();
		fs.write(b);
		fs.close();
		}
		catch(Exception ex){}
	}
	else if(e.getSource()==i4)
	{
		System.exit(0);
	}
	else if(e.getSource()==i5)
	{
		d1.setVisible(true);
	}
 	else if(e.getSource()==i6)
	{
		ta.setForeground(Color.red);
	}
	else if(e.getSource()==i7)
	{
		ta.setForeground(Color.green);
	}
	else if(e.getSource()==i8)
	{
		ta.setForeground(Color.blue);
	}
	else if(e.getSource()==b1)
	{
		changeFonts();
	}
}
public void createMenu()
{
	mb=new MenuBar();
	setMenuBar(mb);
	MenuShortcut ms1=new MenuShortcut('R');
	MenuShortcut ms2=new MenuShortcut('G');
	MenuShortcut ms3=new MenuShortcut('B');

                  m1=new Menu("File");
                 m2=new Menu("Format");
                 m3=new Menu("Color");
                i1=new MenuItem("New"); 
                i2=new MenuItem("Open"); 
                i3=new MenuItem("Save"); 
                i4=new MenuItem("Exit");
                i5=new MenuItem("Font");
               i6=new MenuItem("Red",ms1); 
               i7=new MenuItem("Green",ms2);
              i8=new MenuItem("Blue",ms3);
	m1.add(i1); m1.add(i2); m1.add(i3); m1.add(i4);
	m2.add(m3);m2.add(i5);
	m3.add(i6); m3.add(i7); m3.add(i8);
	mb.add(m1);mb.add(m2);
	i1.addActionListener(this); i2.addActionListener(this);
	i3.addActionListener(this); i4.addActionListener(this);
	i5.addActionListener(this); i6.addActionListener(this);
	i7.addActionListener(this); i8.addActionListener(this);
 }

public static void main(String args[])
{
	Editor ob=new Editor();
	ob.setLocation(120,80);
	ob.setSize(700,600);
	ob.setVisible(true);
}


  }