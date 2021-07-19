/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.crudventas.model;

/**
 *
 * @author benja
 */
public class Venta {

    private int idventa;
    private String nombres;
    private String apellidos;
    private String telefono;

    public Venta() {
    }

    public Venta(String nombres, String apellidos, String telefono) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
