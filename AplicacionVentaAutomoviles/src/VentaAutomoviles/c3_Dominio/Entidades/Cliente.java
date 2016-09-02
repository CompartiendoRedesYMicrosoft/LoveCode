/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentaAutomoviles.c3_Dominio.Entidades;

import VentaAutomoviles.c6_transversal.excepciones.ExcepcionRegla;

/**
 *
 * @author Hernan
 */
public class Cliente {
    private int idcliente;
    private String nombreCliente;
    private String apellidosCliente;
    private String dni;
    private String direccionCliente;
    private String emailCliente;
    private int telefonoCliente;

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidosCliente() {
        return apellidosCliente;
    }

    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public int getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(int telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }
    
    //Metodos
    
    public void validarDNI() throws ExcepcionRegla{
        if(dni.length()>8){
            throw new ExcepcionRegla(" Error: El DNI no debe superar los 8 Caracteres");
        }
    }
    
}
