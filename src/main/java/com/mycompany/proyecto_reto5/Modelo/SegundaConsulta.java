
package com.mycompany.proyecto_reto5.Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class SegundaConsulta {
    public void SegundaConsulta(DefaultTableModel modelo) throws ClassNotFoundException {
        
        CasaCampestre casacampestre = new CasaCampestre();
        
        try {
            
            //Establecer la consulta a la base de datos
            Conexion conexion = new Conexion();
            Connection cn = conexion.conectar();
           
             //Cadena de Consulta
             
             String sql = "  SELECT ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad\n" +
                    "FROM Proyecto p "
                  + "WHERE Ciudad IN('Santa Marta', 'Cartagena', 'Barranquilla')\n" +
                    "AND Clasificacion ='Casa Campestre'"; 
             Statement query = cn.createStatement();
             ResultSet result = query.executeQuery(sql);
             
             while (result.next()) {
                 casacampestre.setId_Proyecto(result.getInt(1));
                 casacampestre.setConstructora(result.getString(2));
                 casacampestre.setNumero_Habitaciones(result.getString(3));
                 casacampestre.setCiudad(result.getString(4));
                
                 //Adicional la minformacion recibida de la base de datos (Tabla CasaCampestre)
                 modelo.addRow(new Object[]{ casacampestre.getId_Proyecto(),casacampestre.getConstructora(), casacampestre.getNumero_Habitaciones(), casacampestre.getCiudad()});
            
             }
             //Cerrar instancias
             result.close();
             query.close();
             

        } catch (SQLException e) {
        System.out.println(e);
    
        }
    
    }
    
    
    
    
}
