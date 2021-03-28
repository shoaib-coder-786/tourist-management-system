package tourist_managment_system;
import javax.swing.*;
// import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class forget_password extends JFrame implements ActionListener{
    JTextField  TEXT_FIELD1,TEXT_FIELD2,TEXT_FIELD3,TEXT_FIELD4,TEXT_FIELD5;
    JButton B1,B2,B3;
    forget_password(){
        setBounds(300,150 , 900, 400);
getContentPane().setBackground(Color.WHITE);
setLayout(null);

ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("tourist_managment_system/icons/forgotpassword.jpg"));
Image i2 =i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
ImageIcon i3 = new ImageIcon(i2);
JLabel s6 = new JLabel(i3);
s6.setBounds(600,70,200,200);
add(s6);


JPanel p =new JPanel();
p.setLayout(null);
p.setBounds(30,30,500,300);
add(p);

JLabel s1 =  new JLabel("username");
s1.setBounds(40,20,100,25);
s1.setFont(new Font("Tahoma",Font.BOLD,14) );
p.add(s1);
TEXT_FIELD1 = new JTextField();
TEXT_FIELD1.setBounds(200, 20 ,150,25);
TEXT_FIELD1.setBorder(BorderFactory.createEmptyBorder());
p.add(TEXT_FIELD1);

B1 =new JButton("search");
B1.addActionListener(this);
B1.setBounds(380,20,100,25);
B1.setFont(new Font("Tahoma",Font.BOLD,14) );
p.add(B1);

JLabel s2 =  new JLabel("NAME");
s2.setBounds(40,60,100,25);
s2.setFont(new Font("Tahoma",Font.BOLD,14) );
p.add(s2);
TEXT_FIELD2 = new JTextField();
TEXT_FIELD2.setBounds(200, 60 ,150,25);
TEXT_FIELD2.setBorder(BorderFactory.createEmptyBorder());
p.add(TEXT_FIELD2);

JLabel s3 =  new JLabel("SECURITY QUESTION");
s3.setBounds(40,100,170,25);
s3.setFont(new Font("Tahoma",Font.BOLD,14) );
p.add(s3);
TEXT_FIELD3 = new JTextField();
TEXT_FIELD3.setBounds(200, 100 ,150,25);
TEXT_FIELD3.setBorder(BorderFactory.createEmptyBorder());
p.add(TEXT_FIELD3);

JLabel s4 =  new JLabel("ANSWER");
s4.setBounds(40,140,170,25);
s4.setFont(new Font("Tahoma",Font.BOLD,14) );
p.add(s4);
TEXT_FIELD4 = new JTextField();
TEXT_FIELD4.setBounds(200, 140 ,150,25);
TEXT_FIELD4.setBorder(BorderFactory.createEmptyBorder());
p.add(TEXT_FIELD4);

B2 =new JButton("RETRIVE");
B2.setBounds(380,140,100,25);
B2.setFont(new Font("Tahoma",Font.BOLD,14) );
B2.addActionListener(this);
p.add(B2);


JLabel s5 =  new JLabel("PASSWORD");
s5.setBounds(40,180,100,25);
s5.setFont(new Font("Tahoma",Font.BOLD,14) );
p.add(s5);
TEXT_FIELD5 = new JTextField();
TEXT_FIELD5.setBounds(200, 180 ,150,25);
TEXT_FIELD5.setBorder(BorderFactory.createEmptyBorder());
p.add(TEXT_FIELD5);

B3 =new JButton("BACK(<--)");
B3.setBounds(150,230,140,25);
B3.setFont(new Font("Tahoma",Font.BOLD,14) );
B3.addActionListener(this);
p.add(B3);
    }
public void actionPerformed(ActionEvent ae)  {
Conn c = new Conn();
    if(ae.getSource()==B1){
        try{
String sql = "select * from account where username ='"+TEXT_FIELD1.getText()+"'";
 ResultSet rs = c.s.executeQuery(sql);
while(rs.next()){
    TEXT_FIELD2.setText(rs.getString("name"));
    TEXT_FIELD3.setText(rs.getString("security"));
}}catch(Exception e){}
    }else if(ae.getSource()==B2){
        try{
            String sql = "select * from account where answer ='"+TEXT_FIELD4.getText()+"' AND username = '"+TEXT_FIELD1.getText()+"'";
             ResultSet rs = c.s.executeQuery(sql);
            while(rs.next()){
                
                TEXT_FIELD5.setText(rs.getString("password"));
            }}catch(Exception e){}

    }else if(ae.getSource()==B3){
        this.setVisible(false);
        new Login().setVisible(true);
    }
}
  public static void main(String[] args){
new forget_password().setVisible(true);
    }
}
