import java.sql.*;
public class Conn  {

  Connection c;
  java.sql.Statement s;

Conn() {
  
  Connection c;
 
  // java.sql.Statement s;
    try{
    //Driver Register 
   // Class.forName("com.mysql.jdbc.Driver");  
  
     //Create Connection
    c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem", "root", "Shashi@2742");
  
    //create Statement
    s = c.createStatement();
    
    }
    catch(Exception e){
       System.out.println(e);
    }
  }




}
