/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuenta;

import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Enlaces {
    Coloresfilas colorf = new Coloresfilas();
    public void Ingresar(String dinero,String descripcion ,String fecha, JLabel label, String mes){
     String result = "";
     String resultado = "";
     String tipo = "Ingreso";
     int suma = 0;
         try {
        
    
           Conexion cc = new Conexion();
           Connection cn = cc.conectar();
            
        
          
            PreparedStatement ps = cn.prepareStatement("INSERT INTO Ingresos VALUES(null,?,?,?);");
            
            ps.setString(1,dinero);
            ps.setString(2,descripcion);
            ps.setString(3,fecha);
          

            ps.executeUpdate();
              PreparedStatement ps3 = cn.prepareStatement("INSERT INTO Historial VALUES(null,?,?,?,?,?);");
            
            ps3.setString(1,fecha);
            ps3.setString(2,tipo);
            ps3.setString(3,dinero);
            ps3.setString(4,descripcion);
            ps3.setString(5,mes);
          

            ps3.executeUpdate();
              Statement st;
            st = cn.createStatement();
            
           
            String sql = "SELECT dinero FROM  Dinerico  WHERE ID = 1; ";
            ResultSet rs = st.executeQuery(sql);
            String [] fila = new String[1];
            while(rs.next()){
               
           result = rs.getString(1);
                System.out.println("result: "+result);
                System.out.println("dinero"+dinero);
      }
            
           suma =  Integer.parseInt(result) + Integer.parseInt(dinero);
            resultado =Integer.toString(suma);
             System.out.println(resultado);
             PreparedStatement ps2 = cn.prepareStatement("UPDATE Dinerico SET dinero = '"+resultado+"' WHERE ID = 1 ;");
             
            
            


            ps2.executeUpdate();
            JOptionPane.showMessageDialog(null, "Guardado exitosamente");
            
          
         
          
       
            label.setText(resultado + " $");
            
        } catch (SQLException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error en el registro");
        }
 


}
    
        public void Ingresar2(String dinero,String descripcion ,String fecha, JLabel label,String mes){
     String result = "";
     String resultado = "";
     String tipo = "Retirado";
     int suma = 0;
         try {
        
    
           Conexion cc = new Conexion();
           Connection cn = cc.conectar();
            
        
          
            PreparedStatement ps = cn.prepareStatement("INSERT INTO Retiros VALUES(null,?,?,?);");
            
            ps.setString(1,dinero);
            ps.setString(2,descripcion);
            ps.setString(3,fecha);
          

            ps.executeUpdate();
                PreparedStatement ps3 = cn.prepareStatement("INSERT INTO Historial VALUES(null,?,?,?,?,?);");
            
            ps3.setString(1,fecha);
            ps3.setString(2,tipo);
            ps3.setString(3,dinero);
            ps3.setString(4,descripcion);
            ps3.setString(5,mes);
          

            ps3.executeUpdate();
          

           
              Statement st;
            st = cn.createStatement();
            
           
            String sql = "SELECT dinero FROM  Dinerico  WHERE ID = 1; ";
            ResultSet rs = st.executeQuery(sql);
            String [] fila = new String[1];
            while(rs.next()){
               
           result = rs.getString(1);
             
      }
            
           suma =  Integer.parseInt(result) - Integer.parseInt(dinero);
            resultado =Integer.toString(suma);
             System.out.println(resultado);
             PreparedStatement ps2 = cn.prepareStatement("UPDATE Dinerico SET dinero = '"+resultado+"' WHERE ID = 1 ;");
             
            
            


            ps2.executeUpdate();
            JOptionPane.showMessageDialog(null, "Guardado exitosamente");
            
          
         
          
       
            label.setText(resultado + " $");
            
        } catch (SQLException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error en el registro");
        }
 


}
    
    
    public void inicio(JLabel label){
        
        String result = "";
        try {
        
    
           Conexion cc = new Conexion();
           Connection cn = cc.conectar();
            
          Statement st;
           st = cn.createStatement();
            
           
            String sql = "SELECT dinero FROM  Dinerico  WHERE ID = 1; ";
            ResultSet rs = st.executeQuery(sql);
            String [] fila = new String[1];
            while(rs.next()){
               
           result = rs.getString(1);
             
      }
            label.setText(result + "$");
     } catch (SQLException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error en el titulo");
        }
    }

    
  
   public void cargartablaingresos(JTable tabla){
   
       try {
        
             DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("Dinero");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Fecha");
         
           Conexion cc = new Conexion();
           Connection cn = cc.conectar();
            
             Statement st;
            st = cn.createStatement();
            
           
            String sql = "SELECT * FROM  Ingresos  ORDER BY ID DESC";
            ResultSet rs = st.executeQuery(sql);
            String [] fila = new String[9];
            while(rs.next()){
               
          fila[0] = rs.getString(1);
          fila[1] = rs.getString(2);
          fila[2] = rs.getString(3);
          fila[3] = rs.getString(4);
       
          
          modelo.addRow(fila);
          
      }
          tabla.setModel(modelo);
          
       
            
          
         
          
       
            
        } catch (SQLException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error en el registro");
        }
 

   
   } 
       
    public void cargartablaretiros(JTable tabla){
   
       try {
        
             DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("Dinero");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Fecha");
         
           Conexion cc = new Conexion();
           Connection cn = cc.conectar();
            
             Statement st;
            st = cn.createStatement();
            
           
            String sql = "SELECT * FROM  Retiros  ORDER BY ID DESC";
            ResultSet rs = st.executeQuery(sql);
            String [] fila = new String[9];
            while(rs.next()){
               
          fila[0] = rs.getString(1);
          fila[1] = rs.getString(2);
          fila[2] = rs.getString(3);
          fila[3] = rs.getString(4);
       
          
          modelo.addRow(fila);
          
      }
          tabla.setModel(modelo);
          
       
            
          
         
          
       
            
        } catch (SQLException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error en el registro");
        }
 

   
   } 
      public void cargartablahistorial(JTable tabla){
   
       try {
        
             DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("Fecha");
            modelo.addColumn("Tipo");
            modelo.addColumn("Dinero");
            modelo.addColumn("Descripcion");
           
            
         
           Conexion cc = new Conexion();
           Connection cn = cc.conectar();
            
             Statement st;
            st = cn.createStatement();
            
           
            String sql = "SELECT * FROM  Historial  ORDER BY ID DESC";
            ResultSet rs = st.executeQuery(sql);
            String [] fila = new String[9];
            String [] fila2 = new String[9];
            while(rs.next()){
               
          fila[0] = rs.getString(1);
          fila[1] = rs.getString(2);
          fila[2] = rs.getString(3);
          fila[3] = rs.getString(4);
          fila[4] = rs.getString(5);
          fila2[0] = rs.getString(6);
       
          
          modelo.addRow(fila);
        
          
      }
          tabla.setModel(modelo);
        
          
       
            
          
         
          
       
            
        } catch (SQLException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error en el registro");
        }
 

   
   } 
        public void cargartablahistorialcombo(JTable tabla,String mes){
          
       try {
        
             DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("Fecha");
            modelo.addColumn("Tipo");
            modelo.addColumn("Dinero");
            modelo.addColumn("Descripcion");
           
            
         
           Conexion cc = new Conexion();
           Connection cn = cc.conectar();
            
             Statement st;
            st = cn.createStatement();
            
           
            String sql = "SELECT * FROM  Historial WHERE mes ='"+mes+"';";
            ResultSet rs = st.executeQuery(sql);
            String [] fila = new String[9];
            String [] fila2 = new String[9];
            while(rs.next()){
               
          fila[0] = rs.getString(1);
          fila[1] = rs.getString(2);
          fila[2] = rs.getString(3);
          fila[3] = rs.getString(4);
          fila[4] = rs.getString(5);
          fila2[0] = rs.getString(6);
       
          
          modelo.addRow(fila);
        
          
      }
          tabla.setModel(modelo);
        
          
       
            
          
         
          
       
            
        } catch (SQLException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error en el registro");
        }
 

   
   } 
      
      
      public Component prepareRender(){
      
      
        return null;
      
       
      }
      
      public void cargarcombo(JComboBox combobox){
             try {
      
        
           Conexion cc = new Conexion();
           Connection cn = cc.conectar();
            
           
            Statement st;
            st = cn.createStatement();
            
            String sql = "SELECT DISTINCT  mes FROM Historial ORDER BY ID DESC" ;
           
           
          
               
                
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
               
           combobox.addItem("Seleccione un mes");
           while(rs.next()){
               combobox.addItem(rs.getString("mes"));
               
           
            
          
           
           }
      
           
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
    
    
    }
      
      
      }
        
        
        
    
    }
    
    
    

