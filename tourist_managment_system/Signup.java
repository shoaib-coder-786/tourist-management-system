package tourist_managment_system;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
//
public class Signup extends JFrame implements ActionListener {
    JButton b1 , b2 ;
    JTextField t1 ,t2,t3,t5;
    Choice c1;
    Signup() {
        setBounds(300, 150, 900, 400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(133, 193, 233));
        p1.setBounds(0, 0, 500, 400);
        p1.setLayout(null);
        add(p1);

        JLabel l1 = new JLabel("username");
        l1.setFont(new Font("Railway", Font.BOLD, 14));
        l1.setBounds(50, 20, 155, 25);
        p1.add(l1);

         t1 = new JTextField();
        t1.setBounds(200, 20, 180, 25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        add(t1);

        JLabel l2 = new JLabel("Name");
        l2.setFont(new Font("Railway", Font.BOLD, 14));
        l2.setBounds(50, 60, 160, 25);
        p1.add(l2);

         t2 = new JTextField();
        t2.setBounds(200, 60, 180, 25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        add(t2);

        JLabel l3 = new JLabel("Password");
        l3.setFont(new Font("Railway", Font.BOLD, 14));
        l3.setBounds(50, 100, 160, 25);
        p1.add(l3);

        t3 = new JTextField();
        t3.setBounds(200, 100, 180, 25);
        t3.setBorder(BorderFactory.createEmptyBorder());
        add(t3);

        JLabel l4 = new JLabel("SECURITY QUESTION");
        l4.setFont(new Font("Railway", Font.BOLD, 14));
        l4.setBounds(50, 140, 160, 25);
        p1.add(l4);

  c1 = new Choice();
c1.add(" Your first school?");
c1.add(" DTU STUDENT ROLLNO?");
c1.add(" your lucky number?");
c1.add(" Your favourite destination?");
c1.add(" Your city name?");
c1.add(" Your fatheer name?");
c1.add(" Your mother name?");
c1.setBounds(200 , 140,200,25);
p1.add(c1);

JLabel l5 = new JLabel("ANSWER");
l5.setFont(new Font("Railway", Font.BOLD, 14));
l5.setBounds(50, 180, 160, 25);
p1.add(l5);

 t5 = new JTextField();
t5.setBounds(200, 180, 180, 25);
t5.setBorder(BorderFactory.createEmptyBorder());
add(t5);

ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("tourist_managment_system/icons/signup.png"));
JLabel l6 = new JLabel(i1);
l6.setBounds(500 , 50, 200, 200);
add(l6);

 b1= new JButton("create");
b1.setFont(new Font("Tahoma",Font.BOLD,14));
b1.setBounds(80,250,100,25);
b1.addActionListener(this);
p1.add(b1);

b2= new JButton("back");
b1.setFont(new Font("Tahoma",Font.BOLD,14));
b2.setBounds(250,250,100,25);
b2.addActionListener(this);
p1.add(b2);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() ==  b1){
          String username =  t1.getText();
          String name = t2.getText();
          String password  = t3.getText();
         String security   = c1.getSelectedItem();
         String answer = t5.getText();
String query = "insert into account values('"+username+"','"+name+"','"+password+"','"+security+"','"+answer+"')";
try{
    Conn c = new Conn();
     c.s.executeUpdate(query);
 JOptionPane.showMessageDialog(null,"Account created successfully");
 this.setVisible(false);
new Login().setVisible(true);
}catch(Exception e){
    
        }}
        else if (ae.getSource() == b2){
            new Login().setVisible(true);
            this.setVisible(false);
        }
    }
    public static void main(String[] args) {
        new Signup().setVisible(true);
    }
}
