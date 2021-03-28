package tourist_managment_system;

import java.awt.*;

import javax.swing.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener {
String s;
JButton b1;

    About()
    {
setBounds(250,150,500,550);
setLayout(null);
getContentPane().setBackground(Color.WHITE);

JLabel l1 = new JLabel("TRAVEL AND TOURSIM MANAGEMNT SYSTEM");
l1.setBounds(50,10,400,80);
l1.setForeground(Color.RED);
l1.setFont(new Font("Tahoma", Font.PLAIN,20));

s = "The objective of the Travel and Tourism Management System :\n"+
     "project is to develop a system that automates the processes \n"+
     " and activities of a travel and tourism agency.\n"+
     " The purpose is to design a system using which one can perform all operations\n"+
     " related to traveling and sight-seeing.\n"+
      "The system allows one to easily access the relevant information and make necessary travel arrangements.\n"+
       "Users can decide about places they want to visit and make bookings online for travel and accommodation. \n"+
       "\tcreator of website\n "+
       "\t SHOAIB \n"+
       "\tROLLNO. 2K20/B11/21\n"+
       "\t BRANCH  'COMPUTER SCIENCE' \n"+
       "\tDELHI TECHNOLOGICAL UNIVERSITY  \n";

TextArea t1 = new TextArea(s,10,40,Scrollbar.VERTICAL);
t1.setEditable(false);
t1.setBounds(20,100,450,300);
add(t1);
add(l1);

b1 =new JButton("BACK");
b1.setBounds(235,420,100,25);
b1.addActionListener(this);
add(b1);

    }
public void actionPerformed(ActionEvent ae){
    this.setVisible(false);
}
public static void main(String[] args) {
    
}}