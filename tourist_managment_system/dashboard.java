package tourist_managment_system;
import javax.swing.*;
import javax.swing.text.AttributeSet.ColorAttribute;

import java.awt.*;
import java.awt.event.*;


public class dashboard extends JFrame implements ActionListener{
    JButton B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15;
    String username ;
    dashboard(String username){
        this.username = username;
setExtendedState(JFrame.MAXIMIZED_BOTH);
setLayout(null);


JPanel p1 = new  JPanel();
p1.setLayout(null);
p1.setBounds(0,0,1600,60);
p1.setBackground(new Color(0,0,102));
add(p1);

JLabel l3 = new JLabel("Dashboard");
l3.setFont(new Font("Tahoma", Font.BOLD,30));
l3.setForeground(Color.WHITE);
l3.setBounds(80,10,300,40);
p1.add(l3);

JPanel p2 = new  JPanel();
p2.setLayout(null);
p2.setBounds(0,60,300,1000);
p2.setBackground(new Color(0,0,102));
add(p2);

 B1 = new JButton("ADD personal details");
B1.setBackground(new Color(0,0,102));
B1.setFont(new Font("Tahoma",Font.PLAIN,20));
B1.setBackground(Color.WHITE);
B1.setMargin(new Insets(0,0,0,60));
B1.setBounds(0,0,300,40);
B1.addActionListener(this);
p2.add(B1);

B2 = new JButton("update personal details");
B2.setBackground(new Color(0,0,102));
B2.setFont(new Font("Tahoma",Font.PLAIN,20));
B2.setBackground(Color.WHITE);
B2.setMargin(new Insets(0,0,0,30));
B2.setBounds(0,40,300,40);
B2.addActionListener(this);
p2.add(B2);

B3 = new JButton("view details");
B3.setBackground(new Color(0,0,102));
B3.setFont(new Font("Tahoma",Font.PLAIN,20));
B3.setBackground(Color.WHITE);
B3.setMargin(new Insets(0,0,0,100));
B3.setBounds(0,80,300,40);
B3.addActionListener(this);
p2.add(B3);

 B4 = new JButton("Delete personal details");
B4.setBackground(new Color(0,0,102));
B4.setFont(new Font("Tahoma",Font.PLAIN,20));
B4.setBackground(Color.WHITE);
B4.setMargin(new Insets(0,0,0,30));
B4.setBounds(0,120,300,40);
B4.addActionListener(this);
p2.add(B4);

 B5 = new JButton("check Package");
B5.setBackground(new Color(0,0,102));
B5.setFont(new Font("Tahoma",Font.PLAIN,20));
B5.setBackground(Color.WHITE);
B5.setMargin(new Insets(0,0,0,100));
B5.setBounds(0,160,300,40);
B5.addActionListener(this);
p2.add(B5);

 B6 = new JButton("book package");
B6.setBackground(new Color(0,0,102));
B6.setFont(new Font("Tahoma",Font.PLAIN,20));
B6.setBackground(Color.WHITE);
B6.setMargin(new Insets(0,0,0,100));
B6.setBounds(0,200,300,40);
B6.addActionListener(this);
p2.add(B6);

 B7 = new JButton("VIEW BOOKED PACKAGE");
B7.setBackground(new Color(0,0,102));
B7.setFont(new Font("Tahoma",Font.PLAIN,20));
B7.setBackground(Color.WHITE);
B7.setMargin(new Insets(0,0,0,10));
B7.setBounds(0,240,300,40);
B7.addActionListener(this);
p2.add(B7);

 B8 = new JButton("SELECT Transport");
B8.setBackground(new Color(0,0,102));
B8.setFont(new Font("Tahoma",Font.PLAIN,20));
B8.setBackground(Color.WHITE);
B8.setMargin(new Insets(0,0,0,80));
B8.setBounds(0,280,300,40);
B8.addActionListener(this);
p2.add(B8);

 B9 = new JButton(" BOOK TRANSPORT");
B9.setBackground(new Color(0,0,102));
B9.setFont(new Font("Tahoma",Font.PLAIN,20));
B9.setBackground(Color.WHITE);
B9.setMargin(new Insets(0,0,0,50));
B9.setBounds(0,320,300,40);
B9.addActionListener(this);
p2.add(B9);

 B10 = new JButton("View Booked vehicles ");
B10.setBackground(new Color(0,0,102));
B10.setFont(new Font("Tahoma",Font.PLAIN,20));
B10.setBackground(Color.WHITE);
B10.setMargin(new Insets(0,0,0,50));
B10.setBounds(0,360,300,40);
B10.addActionListener(this);
p2.add(B10);

 B11 = new JButton("DESTINATION sites");
B11.setBackground(new Color(0,0,102));
B11.setFont(new Font("Tahoma",Font.PLAIN,20));
B11.setBackground(Color.WHITE);
B11.setMargin(new Insets(0,0,0,60));
B11.setBounds(0,400,300,40);
B11.addActionListener(this);
p2.add(B11);

 B12 = new JButton("PAYMENT");
B12.setBackground(new Color(0,0,102));
B12.setFont(new Font("Tahoma",Font.PLAIN,20));
B12.setBackground(Color.WHITE);
B12.setMargin(new Insets(0,0,0,155));
B12.setBounds(0,440,300,40);
B12.addActionListener(this);
p2.add(B12);

 B13 = new JButton("Calculator");
B13.setBackground(new Color(0,0,102));
B13.setFont(new Font("Tahoma",Font.PLAIN,20));
B13.setBackground(Color.WHITE);
B13.setMargin(new Insets(0,0,0,145));
B13.setBounds(0,480,300,40);
B13.addActionListener(this);
p2.add(B13);


 B14 = new JButton("Notepad");
B14.setBackground(new Color(0,0,102));
B14.setFont(new Font("Tahoma",Font.PLAIN,20));
B14.setBackground(Color.WHITE);
B14.setMargin(new Insets(0,0,0,155));
B14.setBounds(0,520,300,40);
B14.addActionListener(this);
p2.add(B14);

 B15 = new JButton("About");
B15.setBackground(new Color(0,0,102));
B15.setFont(new Font("Tahoma",Font.PLAIN,20));
B15.setBackground(Color.WHITE);
B15.setMargin(new Insets(0,0,0,155));
B15.setBounds(0,560,300,40);
B15.addActionListener(this);
p2.add(B15);



ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("tourist_managment_system/icons/home.jpg"));
Image i2 = i1.getImage().getScaledInstance(1600, 700, Image.SCALE_DEFAULT);
ImageIcon i3 = new ImageIcon(i2);
JLabel l1 = new JLabel(i3);
l1.setBounds(0,0,1600,700);
add(l1);

JLabel l4 = new JLabel("Travel AND Tourism management system");
l4.setBounds(350,80,1050,70);
l4.setForeground(Color.WHITE);
l4.setFont(new Font("Tahoma",Font.PLAIN,50));
l1.add(l4);

//  ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("tourist_managment_system/icons/dashboard.png"));
// Image i5 = i4.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
// ImageIcon i6 = new ImageIcon(i5);
// JLabel l2 = new JLabel(i6);
// l2.setBounds(5,0,70,70);
// p1.add(l2);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==B13){try{
            Runtime.getRuntime().exec("calc.exe");
        }catch(Exception e){}

        }else if (ae.getSource() == B14){
try{
    Runtime.getRuntime().exec("notepad.exe");

}catch(Exception e){}

}else if (ae.getSource()== B1){
     new addCustomer(username).setVisible(true);   }
     else if (ae.getSource()== B2){
        new update(username).setVisible(true);   }
    else if(ae.getSource()==B5){
        new CheckPackage().setVisible(true);
    }else if(ae.getSource() == B6){
        new bookPackage(username).setVisible(true);
    }else if(ae.getSource()== B7){
        new view_Package(username).setVisible(true);
    }else if(ae.getSource()== B8){
        new select_Transport().setVisible(true);
    }else if(ae.getSource()== B11){
        new destination().setVisible(true);
    }else if(ae.getSource()== B9){
        new bookTransport(username).setVisible(true);
    }else if(ae.getSource()== B10){
        new ViewBookedTransport(username).setVisible(true);
    }else if(ae.getSource()== B12){
        new Payment().setVisible(true);
    }else if(ae.getSource()== B15){
        new About().setVisible(true);
    }else if(ae.getSource()== B4){
        new  delete_details(username).setVisible(true);
    }else if(ae.getSource()== B3){
        new  ViewDetails(username).setVisible(true);
    }



}
    public static void main(String[] args) {
        new dashboard("").setVisible(true);
    }
}
