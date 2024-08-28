/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ind_agroalimentaria;

/**
 *
 * @author vicge
 */
public class P_refrigerados {
    String f_caducidad;
    String n_lote;
    int codigo;
    int no_lote;
    String n_producto;
    
    public P_refrigerados(String f_caducidad, String n_lote, int codigo, int no_lote, String n_producto){
        this.f_caducidad = f_caducidad;
        this.n_lote = n_lote;
        this.codigo = codigo;
        this.no_lote = no_lote;
        this.n_producto = n_producto;
    }

    public String getF_caducidad() {
        return f_caducidad;
    }

    public void setF_caducidad(String f_caducidad) {
        this.f_caducidad = f_caducidad;
    }

    public String getN_lote() {
        return n_lote;
    }

    public void setN_lote(String n_lote) {
        this.n_lote = n_lote;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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