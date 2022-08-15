
package com.mycompany.proyecto_reto5.Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class PrimeraConsulta {
    public void PrimerConsulta(DefaultTableModel modelo) throws ClassNotFoundException {
        
        Lider lider = new Lider();
        
        try {
            
            //Establecer la consulta a la base de datos
            Conexion conexion = new Conexion();
            Connection cn = conexion.conectar();
           
             //Cadena de Consulta
             
             String sql = "SELECT ID_Lider, Nombre, Primer_Apellido, Ciudad_Residencia  \n" +
                           "FROM Lider l \n" + "ORDER BY Ciudad_Residencia ASC;"; 
             Statement query = cn.createStatement();
             ResultSet result = query.executeQuery(sql);
             
             while (result.next()) {
                 lider.setId_lider(result.getInt(1));
                 lider.setNombre(result.getString(2));
                 lider.setPrimer_apellido(result.getString(3));
                 lider.setCiudad_residencia(result.getString(4));
                
                 //Adicional la minformacion recibida de la base de datos (Tabla lider)
                 modelo.addRow(new Object[]{ lider.getId_lider(),lider.getNombre(), lider.getPrimer_apellido(), lider.getCiudad_residencia()});
            
             }
             //Cerrar instancias
             result.close();
             query.close();
             

        } catch (SQLException e) {
        System.out.println(e);
    
        }
    
    }
    
    
    
    
}
