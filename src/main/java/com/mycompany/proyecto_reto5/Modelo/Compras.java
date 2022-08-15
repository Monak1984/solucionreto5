
package com.mycompany.proyecto_reto5.Modelo;
 //ID_Proyecto, Constructora, Banco_Vinculado, Ciudad

public class Compras {
    
    private int ID_Compra;
    private String Constructora;
    private String Banco_Vinculado;

    public Compras() {
    }

    public Compras(int ID_Compra, String Constructora, String Banco_Vinculado) {
        this.ID_Compra = ID_Compra;
        this.Constructora = Constructora;
        this.Banco_Vinculado = Banco_Vinculado;
        
    }

    public int getID_Compra() {
        return ID_Compra;
    }

    public void setID_Compra(int ID_Compra) {
        this.ID_Compra = ID_Compra;
    }

    public String getConstructora() {
        return Constructora;
    }

    public void setConstructora(String Constructora) {
        this.Constructora = Constructora;
    }

    public String getBanco_Vinculado() {
        return Banco_Vinculado;
    }

    public void setBanco_Vinculado(String Banco_Vinculado) {
        this.Banco_Vinculado = Banco_Vinculado;
    }

    @Override
    public String toString() {
        return "Casa_Campestre{" + "ID_Compra=" + ID_Compra + ", Constructora=" + Constructora + ", Banco_Vinculado=" + Banco_Vinculado + '}';
    }
    
    
    
    
}