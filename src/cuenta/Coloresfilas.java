/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuenta;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author PC
 */
public class Coloresfilas  extends DefaultTableCellRenderer{
    
    public Component getTableCellRendererComponent(JTable tabla, Object value, Boolean Selected, Boolean hasFocus, int row, int col){
        
        super.getTableCellRendererComponent(tabla, value,Selected, hasFocus,row,col);
        
        if(tabla.getValueAt(row,2).toString().equals("Ingreso")){
        
            setBackground(Color.green);
        
        
        }else if(tabla.getValueAt(row,2).toString().equals("Retirado")){
        
            setBackground(Color.red);
        
        
        }
        
        return this;
    }
    
}
