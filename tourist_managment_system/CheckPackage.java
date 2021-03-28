package tourist_managment_system;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.*;
public class CheckPackage extends JFrame {

CheckPackage(){
    setBounds(250,150 , 900, 600);
String[] package1 = new String[]{"GOLD PACKAGE", "2 Days and 3 Nights","AAGRA ,MATHURA , VIRANDHAVAN","1ST DAY latth mar(Holi)+city tour","+BREAKFAST,LUNCH , DINNER+ ","2ND DAY TAJMAHAL VISIT "," NIGHT PARTY ","LOCAL GUIDE ","BOOK NOW ","HOLI SPCIAL TOUR ","RS. 2000/--","holi.png"};
String[] package2 = new String[]{"Silver PACKAGE", "45 Days and 46 Nights","All India Tour","1ST DAY DELHI-INDIA-GATE,RED FORT","+BREAKFAST,LUNCH , DINNER+ ","2ND DAY TAJMAHAL VISIT ","WEEKEND SPECIAL PARTY ","SPECIAL GUIDE ","BOOK NOW ","INDIA SPCIAL TOUR ","RS.100,000/--","one.jpg"};
String[] package3 = new String[]{"BRONZE  PACKAGE", "10 Days and 11 Nights","DELHI ,KASHMIR , EAST INDIA","3 DAYS EXPLORE TO DELHI ","+BREAKFAST,LUNCH , DINNER+ ","3 DAYs IN KASHMIR VISIT "," NIGHT SPECIAL TOUR ","SPECIAL GUIDE ","BOOK NOW ","Phn. xyz77141714","RS. 45000/--","package2.jpg"}; 
String[] package4 = new String[]{"CHOOCE YOUR OWN PACKAGE ", "ANY NUMBER OF DAYS AND NIGHT","ALL OVER INDIA","BUS , CAR ,BIKE AVAILABLE ","+BREAKFAST,LUNCH , DINNER+ ","FREE GUIDE ","  DEAL SHOULD BE NEGOTIABLE ","MAKE YOUR TRIP EASY ","BOOK NOW ","Phn. xyz77141714","RS. 000/--","package3.jpg"};    
String[] GUIDE_1 = new String[]{"Special guide", "ENGLISH SPEAKING GUIDE","KNOWLEDGE OF INDIAN CULTURE ","10 YEARS EXPERIANCED ","+ENTATAINER+ ","HUMBLE AND POLITE NATURE  ","MAKE YOUR TRIP ENJOYFUL","SMART GUIDE ","BOOK NOW ","Phn. xyz77141714","RS. 5000/--","dest2.jpg"};    
String[] GUIDE_2 = new String[]{"Local guide ", "SPEAK HINDI AND LOCAL LANGUAGE","KNOW THE INDIAN TRADITION","3 YEARS EXPERIANCED ","HUMBLE AND POLITE NATURE  ","+ENTATAINER+ "," MAKE YOUR TRIP ENJOYFUL ","CLAVER GUIDE ","BOOK NOW ","Phn. xyz77141714","RS. 4000/--","dest3.jpg"};    



JTabbedPane pane = new JTabbedPane();
JPanel p1 = createPackage( package1);
JLabel l1 = new JLabel("HOLI SPECIAL");
p1.add(l1);
    pane.addTab("Package 1", null,p1);

JPanel p2 = createPackage( package2);
JLabel l2 = new JLabel("HOLI SPECIAL");
p2.add(l2);
    pane.addTab("Package 2", null,p2);

    JPanel p3 = createPackage( package3);
    JLabel l3 = new JLabel("HOLI SPECIAL");
    p2.add(l3);
    pane.addTab("Package 3", null,p3);

    JPanel p4 = createPackage( package4);
    JLabel l4 = new JLabel("HOLI SPECIAL");
    p2.add(l4);
    pane.addTab("Package 4", null,p4);

    JPanel p5 = createPackage( GUIDE_1);
    JLabel l5 = new JLabel("HOLI SPECIAL");
    p2.add(l5);
    pane.addTab("GUIDE_1", null,p5);

    JPanel p6 = createPackage( GUIDE_2);
    JLabel l6 = new JLabel("HOLI SPECIAL");
    p2.add(l6);
    pane.addTab("GUIDE_2", null,p6);

add(pane,BorderLayout.CENTER);
}

public JPanel createPackage(String[] pack) {
    JPanel p1 = new JPanel();
    p1.setLayout(null);
    p1.setBackground(Color.WHITE);

JLabel l1 = new JLabel(pack[0]);
l1.setBounds(50 , 5 ,500, 30);
l1.setFont(new Font("Tahoma",Font.PLAIN,30));
p1.add(l1);

JLabel l2 = new JLabel(pack[1]);
l2.setBounds(30 , 60 ,300, 30);
l2.setForeground(Color.RED);
l2.setFont(new Font("Tahoma",Font.PLAIN,30));
p1.add(l2);

JLabel l3 = new JLabel(pack[2]);
l3.setBounds(30 , 110 ,330, 30);
l3.setForeground(Color.BLUE);
l3.setFont(new Font("Tahoma",Font.PLAIN,20));
p1.add(l3);

JLabel l4 = new JLabel(pack[3]);
l4.setBounds(30 , 160 ,310, 30);
l4.setForeground(Color.BLUE);
l4.setFont(new Font("Tahoma",Font.PLAIN,20));
p1.add(l4);

JLabel l5 = new JLabel(pack[4]);
l5.setBounds(30 , 210 ,300, 30);
l5.setForeground(Color.RED);
l5.setFont(new Font("Tahoma",Font.PLAIN,20));
p1.add(l5);

JLabel l6 = new JLabel(pack[5]);
l6.setBounds(30 , 260 ,300, 30);
l6.setForeground(Color.ORANGE);
l6.setFont(new Font("Tahoma",Font.PLAIN,20));
p1.add(l6);

JLabel l7 = new JLabel(pack[6]);
l7.setBounds(30 , 310 ,300, 30);
l7.setForeground(Color.RED);
l7.setFont(new Font("Tahoma",Font.PLAIN,20));
p1.add(l7);

JLabel l8 = new JLabel(pack[7]);
l8.setBounds(30 , 360 ,300, 30);
l8.setForeground(Color.BLUE);
l8.setFont(new Font("Tahoma",Font.PLAIN,20));
p1.add(l8);

JLabel l9 = new JLabel(pack[8]);
l9.setBounds(30 , 430 ,300, 30);
l9.setForeground(Color.ORANGE);
l9.setFont(new Font("Tahoma",Font.PLAIN,30));
p1.add(l9);

JLabel l10 = new JLabel(pack[9]);
l10.setBounds(300 , 450 ,300, 30);
l10.setForeground(Color.RED);
l10.setFont(new Font("Tahoma",Font.PLAIN,30));
p1.add(l10);

JLabel l11 = new JLabel(pack[10]);
l11.setBounds(700 , 470 ,300, 30);
l11.setForeground(Color.RED);
l11.setFont(new Font("Tahoma",Font.PLAIN,30));
p1.add(l11);

ImageIcon i12 = new ImageIcon(ClassLoader.getSystemResource("tourist_managment_system/icons/"+pack[11]));
Image i13 = i12.getImage().getScaledInstance(400, 500, Image.SCALE_DEFAULT);
ImageIcon i14 = new ImageIcon(i13);
JLabel l12 = new JLabel(i14);
l12.setBounds(300,40,550,350);
p1.add(l12);


    return p1;
}


public static void main(String[] args) {
    new CheckPackage().setVisible(true);
}
}
