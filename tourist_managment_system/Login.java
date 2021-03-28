package tourist_managment_system;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public  class Login extends JFrame implements ActionListener{
    JButton b1, b2,b3,b4 ;
    JTextField t1 ;
    JPasswordField t2;

    Login(){
        
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setBounds(300,150 , 900, 400);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(131,193,233));
        p1.setBounds(0, 0,400,400);
        p1.setLayout(null);
        add(p1);

   ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("tourist_managment_system/icons/login.png"));
   Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT); 
   ImageIcon i3 = new ImageIcon(i2);
   JLabel l1= new JLabel(i3);
     l1.setBounds(100 ,100 , 200 , 200);
     p1.add(l1); 

     JPanel p2 = new JPanel();
     p2.setLayout(null);
     p2.setBounds(400,30,450,300);
     add(p2);

     JLabel l2 = new JLabel("username ");
     l2.setBounds(60,20,100,25);
     l2.setFont(new Font(" SAN_SERIF", Font.ROMAN_BASELINE,20));
     p2.add(l2);

     t1 = new JTextField();
     t1.setBounds(60,60,300,30);
     t1.setBorder(BorderFactory.createEmptyBorder() );
     p2.add(t1);

     JLabel l3 = new JLabel("password ");
     l3.setBounds(60,110,100,25);
     l3.setFont(new Font(" SAN_SERIF", Font.ROMAN_BASELINE,20));
     p2.add(l3);

     t2 = new JPasswordField();
     t2.setBounds(60,150,300,30);
     t2.setBorder(BorderFactory.createEmptyBorder() );
     p2.add(t2);

      b1 = new JButton("Login");
     b1.setBounds(60,200,130,30);
     b1.addActionListener(this);
     p2.add(b1);

     b2 = new JButton("Sign up");
     b2.setBounds(230,200,130,30);
     b2.addActionListener(this);
     p2.add(b2);
     
     b3 = new JButton("Forget Password");
     b3.setBounds(130,250,160,30);
     b3.addActionListener(this);
     p2.add(b3);

     b4 = new JButton("shoaib_2k20/b11/21");
     b4.setBounds(300,250,180,30);
     b4.addActionListener(this);
     p2.add(b4);


    //  JLabel l4 = new JLabel(" made by SHOAIB__2K20/B11/21");
    //  l4.setBounds(300,250,100,20);
    //  p2.add(l4);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
if(ae.getSource() == b1){
    try{
        String username = t1.getText();
        String password = t2.getText();
String sql = "select * from account where username = '"+username+"' AND password = '"+password+"'";
Conn c = new Conn();
ResultSet rs = c.s.executeQuery(sql);
if(rs.next()){
this.setVisible(false);
new Loading(username).setVisible(true);
} else{
    JOptionPane.showMessageDialog(null,"Invalid Login...");
}  
}catch(Exception e){}
}
else if(ae.getSource() == b2){
    this.setVisible(false);
    new Signup().setVisible(true);
    
    
}
else if(ae.getSource() == b3){
    this.setVisible(false);
    new forget_password().setVisible(true);
}else if(ae.getSource() == b4){
    this.setVisible(false);
    new About().setVisible(true); }
    }
    public static void main(String[] args){
        new Login();
    }
}
