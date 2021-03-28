package tourist_managment_system;

import java.awt.Image;

import javax.swing.*;

public class splash {
    public static void main(String[] args) {
    splashFrame frame =     new splashFrame();
    frame.setVisible(true);
    int x = 1  ;
    for(int i = 1 ; i <= 700; i += 4 , x += 5){
   frame.setLocation(750 - (x+i)/2, 450-(i/2) );   //set  location of image and size 
   frame.setSize(x+i,i);  
    try{Thread.sleep(10); }
    catch(Exception o){} 
 }

frame.setVisible(true);
    }
}

 class splashFrame extends JFrame implements Runnable
 {Thread t1 ;
    
     private static final long serialVersionUID = 1L;

    
splashFrame(){
   ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("tourist_managment_system/icons/intro.jpg"));
Image i2 = i1.getImage().getScaledInstance(1600, 700, Image.SCALE_DEFAULT);
ImageIcon i3 = new ImageIcon(i2);
   JLabel l1 = new JLabel(i3);
add(l1);
 
setUndecorated(true);
t1 = new Thread(this);
t1.start();

}
public void run(){
     try{ Thread.sleep(3000);  //it tkaes mili second so 7sec = 7000mili sec
       this.setVisible(false);
       new Login().setVisible(true);
    }catch(Exception o){}
}
}

