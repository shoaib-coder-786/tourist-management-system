package tourist_managment_system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.*;

public class addCustomer extends JFrame implements ActionListener{
    JTextField t1 ,t2,t3,t4,t5,t6,t7;
    JComboBox c1 ;
    JRadioButton r1,r2;
JButton B1 , B2;
String username ;
    addCustomer(String username){
        this.username = username;
    setBounds(350,150 , 850, 550);
  getContentPane().setBackground(Color.WHITE);
  setLayout(null);

 JLabel l1 = new JLabel("username");
 l1.setBounds(30,50,200,25);
 add(l1);

 t1 = new JTextField();
 t1.setBounds(220,50,150,25);
 add(t1);

 JLabel l2 = new JLabel(" id  :");
 l2.setBounds(30,90,150,25);
 add(l2);

c1 = new JComboBox(new String[] {"Passport","Aadhar Card","Pan Card","Ration Card"});
c1.setBounds(220,90,150,25);
add(c1);

JLabel l3 = new JLabel("NUMBER");
 l3.setBounds(30,130,200,25);
 add(l3);

 t2 = new JTextField();
 t2.setBounds(220,130,150,25);
 add(t2);

 JLabel l4 = new JLabel("Name");
 l4.setBounds(30,170,200,25);
 add(l4);

 t3 = new JTextField();
 t3.setBounds(220,170,150,25);
 add(t3);

 JLabel l5 = new JLabel("Gender  : ");
 l5.setBounds(30,210,200,25);
 add(l5);

r1 =new JRadioButton("male");
r1.setBounds(220,210,70,25);
add(r1);

r2 =new JRadioButton("female");
r2.setBounds(300,210,70,25);
add(r2);

JLabel l6 = new JLabel("Country");
 l6.setBounds(30,250,200,25);
 add(l6);

 t4 = new JTextField();
 t4.setBounds(220,250,150,25);
 add(t4);

 JLabel l7= new JLabel(" Address");
 l7.setBounds(30,290,200,25);
 add(l7);

 t5 = new JTextField();
 t5.setBounds(220,290,150,25);
 add(t5);

 JLabel l8 = new JLabel("Phone ");
 l8.setBounds(30,330,200,25);
 add(l8);

 t6 = new JTextField();
 t6.setBounds(220,330,150,25);
 add(t6);

 JLabel l9 = new JLabel("email :");
 l9.setBounds(30,370,200,25);
 add(l9);

 t7 = new JTextField();
 t7.setBounds(220,370,150,25);
 add(t7);

B1 =  new JButton("Add");
B1.setBackground(Color.BLACK);
B1.setForeground(Color.WHITE);
B1.setBounds(70,430,100,25);
B1.addActionListener(this);
add(B1);

B2 =  new JButton("Back");
B2.setBackground(Color.BLACK);
B2.setForeground(Color.WHITE);
B2.setBounds(220,430,100,25);
B2.addActionListener(this);
add(B2);

ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("tourist_managment_system/icons/newcustomer.jpg"));
Image i2 = i1.getImage().getScaledInstance(400, 500, Image.SCALE_DEFAULT);
ImageIcon i3 = new ImageIcon(i2);
JLabel l10 = new JLabel(i3);
l10.setBounds(400,40,450,400);
add(l10);

try{
    Conn c = new Conn();
    ResultSet rs = c.s.executeQuery("select * from account where username = '"+username+"'");
    while(rs.next()){
t1.setText(rs.getString("username"));
t3.setText(rs.getString("name"));

    }
}catch(Exception e){

}
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == B1){
        String username = t1.getText();
        String id = (String)c1.getSelectedItem();
        String number= t2.getText();
        String name = t3.getText();
        String radio = null ;
        if(r1.isSelected()){
            radio = "male";
        }else if (r2.isSelected()){
            radio = "female";
        }
        String country = t4.getText();
        String address = t5.getText();
        String phone = t6.getText();
        String email = t7.getText();


String q = "insert into customers values('"+username+"','"+id+"','"+number+"','"+name+"','"+radio+"','"+country+"','"+address+"','"+phone+"','"+email+"')";
     try{
         Conn c = new Conn();
         c.s.executeUpdate(q);
         JOptionPane.showMessageDialog(null,"Customer detail added successfully");
         this.setVisible(false);

     }catch(Exception e){}

    }else if(ae.getSource()== B2){
        this.setVisible(false);
    } }
    public static void main(String[] args) {
        new addCustomer("").setVisible(true);

    }
}
