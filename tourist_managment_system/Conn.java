package tourist_managment_system;

// import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conn {
    Connection c;
    java.sql.Statement s;
    public Conn(){

try{
    Class.forName("com.mysql.jdbc.Driver");
c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
s =  c.createStatement();
}catch(Exception e){}
        


    }
    
}
