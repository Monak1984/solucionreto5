
package com.mycompany.proyecto_reto5.Modelo;
 //ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad

public class CasaCampestre {
    
    private int Id_Proyecto;
    private String Constructora;
    private String Numero_Habitaciones;
    private String Ciudad;

    public CasaCampestre() {
    }

    public CasaCampestre(int Id_Proyecto, String Constructora, String Numero_Habitaciones, String Ciudad) {
        this.Id_Proyecto = Id_Proyecto;
        this.Constructora = Constructora;
        this.Numero_Habitaciones = Numero_Habitaciones;
        this.Ciudad = Ciudad;
        
    }

    public int getId_Proyecto() {
        return Id_Proyecto;
    }

    public void setId_Proyecto(int Id_Proyecto) {
        this.Id_Proyecto = Id_Proyecto;
    }

    public String getConstructora() {
        return Constructora;
    }

    public void setConstructora(String Constructora) {
        this.Constructora = Constructora;
    }

    public String getNumero_Habitaciones() {
        return Numero_Habitaciones;
    }

    public void setNumero_Habitaciones(String Numero_Habitaciones) {
        this.Numero_Habitaciones = Numero_Habitaciones;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    @Override
    public String toString() {
        return "Casa_Campestre{" + "Id_Proyecto=" + Id_Proyecto + ", Constructora=" + Constructora + ", Numero_Habitaciones=" + Numero_Habitaciones + ", Ciudad=" + Ciudad + '}';
    }
    
    
    
    
}