package tourist_managment_system;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

import java.awt.*;

public class Loading extends JFrame implements Runnable{
    JProgressBar p;
Thread t ;
String username;
public void run(){
    try{
for(int i= 1 ; i <=101;i++){
int m = p.getMaximum();
int n = p.getValue();
if(n<m){
    p.setValue(p.getValue()+1);}
    else{i = 101;
    setVisible(false);
   new dashboard(username).setVisible(true);   //
}
Thread.sleep(50);

      }  }catch(Exception e){}
    }
    Loading(String user) {
         username = user;
        t = new Thread(this);

        setBounds(300, 150, 650, 400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel s1 = new JLabel("TRAVEL AND TOURISM APPLICATION");
        s1.setBounds(50, 40, 600, 40);
        s1.setFont(new Font("Raleway", Font.BOLD, 30));
        s1.setForeground(Color.BLUE);
        add(s1);

        p = new JProgressBar();
        p.setStringPainted(true);
        p.setBounds(150, 100, 300, 25);
        add(p);

        JLabel s2 = new JLabel("Please Wait...");
        s2.setBounds(255, 130, 120, 25);
        s2.setFont(new Font("Tahoma", Font.BOLD, 16));
        s2.setForeground(Color.RED);
        add(s2);

        JLabel s3 = new JLabel("WELCOME " + username);
        s3.setBounds(50, 310, 150, 25);
        s3.setFont(new Font("Tahoma", Font.BOLD, 16));
        s3.setForeground(Color.RED);
        add(s3);

        t.start();
    }

    public static void main(String[] args) {
        new Loading("").setVisible(true);
    }
}
