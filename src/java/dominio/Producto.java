/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;
import transversal.ExcepcionRegla;
/**
 *
 * @author Juan
 */
public class Producto {
    private int idproducto;
    private String nombre;
    private double precio;

    public Producto() {
    }

    
    public Producto(int idproducto, String nombre, double precio) {
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public String getNombre() {
        return nombre;
    }
   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }
    
    public void validarPrecio()throws ExcepcionRegla{
        if(precio < 0 || precio > 100)
            throw new ExcepcionRegla("El Precio ingresado es incorrecto");    
    }
    
    
}
