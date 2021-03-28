package tourist_managment_system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class bookTransport extends JFrame implements ActionListener {
    Choice c1,c2,c3,c4;
JTextField t1,t2,t3;
JLabel l21,l22,l23,l24,l25;
JButton B3,B1,B2;


    bookTransport(String username){
setBounds(250,150,1100,600);
getContentPane().setBackground(Color.WHITE);

ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("tourist_managment_system/icons/book.jpg"));
Image i2 = i1.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
ImageIcon i3 = new ImageIcon(i2);
JLabel l100 = new JLabel(i3);
l100.setBounds(500,50,600,400);
add(l100);

JButton B1 = new JButton("check price");
B1.setBackground(Color.BLACK);
B1.setForeground(Color.WHITE);
B1.setBounds(50,490,120,30);
B1.addActionListener(this);
add(B1);

B2 = new JButton("Book");
B2.setBackground(Color.RED);
B2.setForeground(Color.WHITE);
B2.setBounds(200,490,120,30);
B2.addActionListener(this);
add(B2);

B3 = new JButton("BACK");
B3.setBackground(Color.BLUE);
B3.setForeground(Color.WHITE);
B3.setBounds(350,490,120,30);
B3.addActionListener(this);
add(B3);



JLabel l1 = new JLabel("BOOK TRANSPORT");
l1.setFont(new Font("Tahoma",Font.PLAIN,25));
l1.setBounds(100,0,300,30);
add(l1);

JLabel l2 = new JLabel("USERNAME");
l2.setBounds(20,70,300,30);
add(l2);

 l21 = new JLabel();
l21.setBounds(250,70,150,30);
add(l21);

JLabel l3 = new JLabel("select Transport");
l3.setBounds(20,110,100,30);
add(l3);

c1 = new Choice();
try{Conn c = new Conn();
    ResultSet rs = c.s.executeQuery("select * from transport");
    while(rs.next()){
        c1.add(rs.getString("name"));
    }

}catch(Exception e){

}
c1.add("THAR");
c1.add("BUS");    
c1.add("CAR");    
c1.add("BIKE");    
c1.add("Vanity Vein");    
c1.add("Auto");    
c1.add("Farari");    
c1.add("SCOOTY");    
c1.add("helicopter");    

c1.setBounds(250,110,150,30);
add(c1);

JLabel l4 = new JLabel("Total Persons");
l4.setBounds(20,150,100,30);
add(l4);

t1 = new JTextField();
t1.setBounds(250,150,150,25);
add(t1);

JLabel l5 = new JLabel("NUMBER OF DAYS");
l5.setBounds(20,190,150,30);
add(l5);

t2 = new JTextField();
t2.setBounds(250,190,150,25);
add(t2);

JLabel l6 = new JLabel("AC/NON AC");
l6.setBounds(20,230,100,30);
add(l6);

c2 = new Choice();
c2.add("YES");
c2.add("NO");    
c2.setBounds(250,230,150,30);
add(c2);

JLabel l7 = new JLabel("advance payment");
l7.setBounds(20,270,150,30);
add(l7);

c3 = new Choice();
c3.add("yes");
c3.add("no");
c3.setBounds(250,270,150,30);
add(c3);

JLabel l8 = new JLabel("ID:");
l8.setBounds(20,310,100,30);
add(l8);

l22 = new JLabel();
l22.setBounds(250,310,150,30);
add(l22);

JLabel l9 = new JLabel("number");
l9.setBounds(20,350,100,30);
add(l9);

l23 = new JLabel();
l23.setBounds(250,350,150,30);
add(l23);

JLabel l10 = new JLabel("phone");
l10.setBounds(20,390,100,30);
add(l10);

l24 = new JLabel();
l24.setBounds(250,390,150,30);
add(l24);

JLabel l11 = new JLabel("total price");
l11.setBounds(20,430,100,30);
add(l11);

l25 = new JLabel();
l25.setForeground(Color.RED);
l25.setBounds(250,430,150,30);
add(l25);


try{Conn c= new Conn();
    ResultSet rs = c.s.executeQuery("select * from customers where username = '"+username+"'");
    while(rs.next()){
        l21.setText(rs.getString("username"));
        l22.setText(rs.getString("id"));
        l23.setText(rs.getString("number"));
        l24.setText(rs.getString("phone"));
        }
}catch(Exception e) {
}}


public void actionPerformed(ActionEvent ae){ 
    if(ae.getSource() == B1){
try{
Conn c = new Conn();
ResultSet rs = c.s.executeQuery("select * from transport where name = '"+c1.getSelectedItem()+"'");
while(rs.next()){
    int cost = Integer.parseInt(rs.getString("cost_per_day"));
    int service = Integer.parseInt(rs.getString("service_charge"));
    int ac = Integer.parseInt(rs.getString("ac_charge"));

int persons = Integer.parseInt(t1.getText());
int days = Integer.parseInt(t2.getText());

String acprice = c2.getSelectedItem();
String serviceprice = c3.getSelectedItem();

if(persons * days> 0){
    int total = 0;
    total +=acprice.equals("yes")? ac : 0;
    total += serviceprice.equals("yes")? service : 0;
    total += cost;
    total = total * persons * days;
    l25.setText(""+total);
}else{
    l25.setText("Please enter a valid number");
}
}
}catch(Exception e){}
    }else if(ae.getSource() == B2){
        try{ Conn c = new Conn();
            c.s.executeUpdate("insert into bookTransport values('" +l21.getText()+"','" +c1.getSelectedItem()+"','" +t1.getText()+"','" +t2.getText()+"','" +c2.getSelectedItem()+"','" +c3.getSelectedItem()+"','" +l22.getText()+"','" +l23.getText()+"','" +l24.getText()+"','" +l25.getText()+"')");
JOptionPane.showMessageDialog(null, "vehicle booked successfully");
this.setVisible(false);
        }catch(Exception e){

        }}else if(ae.getSource() == B3){
            this.setVisible(false);
        }
    }

public static void main(String[] args) {
    new bookTransport("").setVisible(true);
}}