/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ind_agroalimentaria;

/**
 *
 * @author vicge
 */
public class P_frescos {
    String f_envasado;
    String pais_origen;
    String fecha_caducidad;
    int no_lote;
    String n_producto;
    
    public P_frescos(String f_envasado, String pais_origen, String fecha_caducidad, int no_lote, String n_producto){
        this.f_envasado = f_envasado;
        this.pais_origen = pais_origen;
        this.fecha_caducidad = fecha_caducidad;
        this.no_lote = no_lote;
        this.n_producto = n_producto;
    }

    public String getF_envasado() {
        return f_envasado;
    }

    public void setF_envasado(String f_envasado) {
        this.f_envasado = f_envasado;
    }

    public String getPais_origen() {
        return pais_origen;
    }

    public void setPais_origen(String pais_origen) {
        this.pais_origen = pais_origen;
    }

    public String getFecha_caducidad() {
        return fecha_caducidad;
    }

    public void setFecha_caducidad(String fecha_caducidad) {
        this.fecha_caducidad = fecha_caducidad;
    }

    public int getNo_lote() {
        return no_lote;
    }

    public void setNo_lote(int no_lote) {
        this.no_lote = no_lote;
    }

    public String getN_producto() {
        return n_producto;
    }

    public void setN_producto(String n_producto) {
        this.n_producto = n_producto;
    }            
}