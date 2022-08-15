
package com.mycompany.proyecto_reto5.Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

//ID_Compra, Constructora, Banco_Vinculado

public class TerceraConsulta {
    public void TerceraConsulta(DefaultTableModel modelo) throws ClassNotFoundException {
        
        Compras compras = new Compras();
        
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
                 compras.setID_Compra(result.getInt(1));
                 compras.setConstructora(result.getString(2));
                 compras.setBanco_Vinculado(result.getString(3));
                 
                 //Adicional la minformacion recibida de la base de datos (Tabla Compras)
                 modelo.addRow(new Object[]{ compras.getID_Compra(),compras.getConstructora(), compras.getBanco_Vinculado()});
            
             }
             //Cerrar instancias
             result.close();
             query.close();
             

        } catch (SQLException e) {
        System.out.println(e);
    
        }
    
    } 
}
