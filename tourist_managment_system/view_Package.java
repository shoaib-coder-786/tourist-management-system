package tourist_managment_system;

import java.awt.Color;
import java.sql.ResultSet;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class view_Package extends JFrame implements ActionListener {
    view_Package(String username){
        setBounds(350,200,900,420);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        ImageIcon i12 = new ImageIcon(ClassLoader.getSystemResource("tourist_managment_system/icons/bookedDetails.jpg"));
        Image i13 = i12.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);
        ImageIcon i14 = new ImageIcon(i13);
        JLabel l9 = new JLabel(i14);
        l9.setBounds(450,20,500,400);
        add(l9);

        JLabel heading = new JLabel("View Package Details");
        heading.setBounds(60,0,300,30);
        heading.setFont(new Font("Tahoma",Font.PLAIN,20));
add(heading);

JLabel l1 = new JLabel("USERNAME");
l1.setBounds(30,50,100,30);
add(l1);

JLabel l11 = new JLabel();
l11.setBounds(250,50,200,30);
add(l11);

JLabel l2 = new JLabel("PACKAGE");
l2.setBounds(30,90,100,30);
add(l2);

JLabel l12 = new JLabel();
l12.setBounds(250,90,200,30);
add(l12);

JLabel l3 = new JLabel("TOTAL PERSONS");
l3.setBounds(30,130,100,30);
add(l3);

JLabel l13 = new JLabel();
l13.setBounds(250,130,200,30);
add(l13);

JLabel l4 = new JLabel("ID: ");
l4.setBounds(30,170,100,30);
add(l4);

JLabel l14 = new JLabel();
l14.setBounds(250,170,200,30);
add(l14);

JLabel l5 = new JLabel("number");
l5.setBounds(30,210,100,30);
add(l5);

JLabel l15 = new JLabel();
l15.setBounds(250,210,200,30);
add(l15);

JLabel l6 = new JLabel("PHONE");
l6.setBounds(30,250,100,30);
add(l6);

JLabel l16 = new JLabel();
l16.setBounds(250,250,200,30);
add(l16);

JLabel l7 = new JLabel("PRICE ");
l7.setBounds(30,290,100,30);
add(l7);

JLabel l17 = new JLabel();
l17.setBounds(250,290,200,30);
add(l17);
try{
Conn c = new Conn();
ResultSet rs = c.s.executeQuery(" select * from bookpackage where username = 'username'");
while(rs.next()){
    l11.setText(rs.getString(1));
    l12.setText(rs.getString(2));
    l13.setText(rs.getString(3));
    l14.setText(rs.getString(4));
    l15.setText(rs.getString(5));
    l16.setText(rs.getString(6));
    l17.setText(rs.getString(7));
    
}
}catch(Exception e){

}

JButton B1 = new JButton("BACK");
B1.setBackground(Color.BLACK);
B1.setForeground(Color.WHITE);
B1.setBounds(130,340,100,25);
B1.addActionListener(this);
add(B1);
    }

public void actionPerformed(ActionEvent ae){
    this.setVisible(false);
}

    public static void main(String[] args) {
        new view_Package("").setVisible(true);
    }
}
