package tourist_managment_system;

import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.*;



public class bookPackage extends JFrame implements ActionListener{
Choice c1;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l11,l12,l13,l14,l15;
JTextField t1;
JButton B1,B2,B3;

bookPackage(String username){
    setBounds(250,150 , 1100, 500);
    setLayout(null);
    getContentPane().setBackground(Color.WHITE);

    ImageIcon i12 = new ImageIcon(ClassLoader.getSystemResource("tourist_managment_system/icons/bookpackage.jpg"));
Image i13 = i12.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
ImageIcon i14 = new ImageIcon(i13);
JLabel l9 = new JLabel(i14);
l9.setBounds(550,50,500,300);
add(l9);
  
l1 = new JLabel("BOOK PACKAGE");
l1.setBounds(100,10,200,30);
l1.setFont(new Font("Yu Mincho",Font.PLAIN,20));
add(l1);

 l2 = new JLabel("USERNAME");
l2.setBounds(40,70,100,30);
l2.setFont(new Font("Tahoma",Font.PLAIN,15));
add(l2);

 l11 = new JLabel();
l11.setBounds(250,70,100,30);
l11.setFont(new Font("Tahoma",Font.PLAIN,15));
add(l11);

 l3 = new JLabel("Select Package");
l3.setBounds(40,110,150,30);
l3.setFont(new Font("Tahoma",Font.PLAIN,15));
add(l3);
c1 = new Choice();
c1.add("Gold Package");
c1.add("silver Package");
c1.add("Bronze Package");
c1.setBounds(250,110,200,30);
add(c1);

l4 = new JLabel("Total person");
l4.setBounds(40,150,150,30);
l4.setFont(new Font("Tahoma",Font.PLAIN,15));
add(l4);

t1 = new JTextField("1");
t1.setBounds(250,150,200,25);
add(t1);

l5 = new JLabel("ID:");
l5.setBounds(40,190,100,30);
l5.setFont(new Font("Tahoma",Font.PLAIN,15));
add(l5);

 l12 = new JLabel();
l12.setBounds(250,190,100,30);
l12.setFont(new Font("Tahoma",Font.PLAIN,15));
add(l12);

l6 = new JLabel("NUMBER");
l6.setBounds(40,230,100,30);
l6.setFont(new Font("Tahoma",Font.PLAIN,15));
add(l6);

 l13 = new JLabel();
l13.setBounds(250,230,100,30);
l13.setFont(new Font("Tahoma",Font.PLAIN,15));
add(l13);

l6 = new JLabel("PHONE");
l6.setBounds(40,270,100,30);
l6.setFont(new Font("Tahoma",Font.PLAIN,15));
add(l6);

 l14 = new JLabel();
l14.setBounds(250,270,100,30);
l14.setFont(new Font("Tahoma",Font.PLAIN,15));
add(l14);

l5 = new JLabel("Total Price");
l5.setBounds(40,310,100,30);
l5.setFont(new Font("Tahoma",Font.PLAIN,15));
add(l5);

 l15 = new JLabel();
l15.setBounds(250,310,100,30);
l15.setForeground(Color.RED);
l15.setFont(new Font("Tahoma",Font.PLAIN,15));
add(l15);
try{Conn c = new Conn();
    ResultSet rs = c.s.executeQuery("select * from customers where username = '"+username+"'");
while(rs.next() ){
    l11.setText(rs.getString("username"));
    l12.setText(rs.getString("id"));
    l13.setText(rs.getString("number"));
    l14.setText(rs.getString("phone"));
}
}catch(Exception e){}

B1 = new JButton("Check price");
B1.setBackground(Color.BLACK);
B1.setForeground(Color.WHITE);
B1.setBounds(60,380,120,25);
B1.addActionListener(this);
add(B1);

B2 = new JButton("Book Package");
B2.setBackground(Color.BLACK);
B2.setForeground(Color.WHITE);
B2.setBounds(200,380,120,25);
B2.addActionListener(this);
add(B2);

B3 = new JButton("Back");
B3.setBackground(Color.BLACK);
B3.setForeground(Color.WHITE);
B3.setBounds(340,380,120,25);
B3.addActionListener(this);
add(B3);
}


public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==B1){
String p = c1.getSelectedItem();
int cost = 0;
if(p.equals("Gold Package")){
    cost += 2000;
}else if(p.equals("silver Package")){
    cost += 1000;
}else if(p.equals("Bronze Package")){
    cost += 30000;
}
int persons = Integer.parseInt(t1.getText() ); 
cost *= persons;
l15.setText("Rs " + cost);
}else if(ae.getSource()==B2){
    try{Conn c = new Conn();
        c.s.executeUpdate("insert into bookPackage values ('"+l11.getText()+"', '"+c1.getSelectedItem()+"','"+t1.getText()+"','"+l12.getText()+"','"+l13.getText()+"','"+l14.getText()+"','"+l15.getText()+"')");
JOptionPane.showMessageDialog(null,"package book successfully");
this.setVisible(false);
    }catch(Exception e){
    }
    }else if(ae.getSource()== B3){
        this.setVisible(false);

    }
}
   public static void main(String[] args) {
       new bookPackage("").setVisible(true);
   } 
}
