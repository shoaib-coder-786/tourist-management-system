package tourist_managment_system;
import javax.swing.*;
import java.awt.event.*;
public class Paytm extends JFrame implements ActionListener{
    Paytm(){
JEditorPane j = new JEditorPane();
j.setEditable(false);
try{ j.setPage("https://paytm.com/credit-card-bill-payment");

}catch(Exception e){
    j.setContentType("text/html");
    j.setText("<html> could not load, error 420 >");

}
JScrollPane js= new JScrollPane(j);
getContentPane().add(js);
JButton b1 =new JButton("BACK");
b1.setBounds(250,20,80,40);
b1.addActionListener(this);
j.add(b1);

setBounds(250,150,800,600);

    }
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
        new Payment().setVisible(true);
    }
    

public static void main(String[] args) {
    
}}