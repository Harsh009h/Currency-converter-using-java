import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class  Converter5 extends JFrame 
{
  public Converter5()
 {

JFrame f=new JFrame("CONVERTER");


JLabel l1=new JLabel("Rupees:");
l1.setBounds(20,40,60,30);
add(l1);


JLabel l2=new JLabel("Dollars:");
l2.setBounds(170,40,60,30);
add(l2);


JTextField t1=new JTextField("0");
t1.setBounds(80,40,50,30);
add(t1);

JTextField t2=new JTextField("0");
t2.setBounds(240,40,50,30);
add(t2);


JButton b1=new JButton("INR");
b1.setBounds(50,80,60,15);
add(b1);


JButton b2=new JButton("Dollar");
b2.setBounds(190,80,60,15);
add(b2);


JButton b3=new JButton("close");
b3.setBounds(150,150,60,15);
add(b3);



//Adding ActionListener

b1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
//converting to double

double d=Double.parseDouble(t1.getText());

//converting rupee to dollar

double d1=(d  / 65.25);

//Getting the string value of the 

//calculated value

String s1=String.valueOf(d1);

//Placing it in the text box 

t2.setText(s1);
}
});


//Adding ActionListener

b2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{  
//converting to double

double d2=Double.parseDouble(t2.getText());

//converting rupee to dollar

double d3=(d2  * 65.25);

//Getting the string value of the 

//calculated value

String s2=String.valueOf(d3);

//Placing it in the text box 

t1.setText(s2);
}
});
           

//Adding ActionListener to close the form

b3.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
dispose();
}
});

//default method for closing  the Frame

addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent e)
{
System.exit(0);

}

});

setLayout(null);
setSize(400,400);
setVisible(true);
}

 
public static void main(String s[])
{
Converter5 c1=new Converter5();
}
}

