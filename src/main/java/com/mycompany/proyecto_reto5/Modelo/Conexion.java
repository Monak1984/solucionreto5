
package com.mycompany.proyecto_reto5.Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String UBICACION_BD = "ProyectosConstruccion.db";

    public static Connection conectar() throws SQLException {
        String url = "jdbc:sqlite:" + UBICACION_BD;
        return DriverManager.getConnection(url);
    }
}
