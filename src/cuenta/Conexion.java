
package cuenta;
import java.sql.*;
public class Conexion {
    
    
     Connection  conectar = null;
     
     public Connection conectar (){
         
         try {
             Class.forName("org.sqlite.JDBC");
             conectar = DriverManager.getConnection("jdbc:sqlite:Cuenta.db");
             System.out.println("conexion establecida");
         } catch (Exception e) {
             System.out.println(e.getMessage() + "Error");
         }
         
         
         return conectar;
     }
    
    
}
