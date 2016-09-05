/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorweb;

import dominio.Producto;
import javax.inject.Named;
import aplicacion.GestionarProductoServicio;
import java.awt.event.ActionEvent;
import java.util.List;
import transversal.ExcepcionRegla;
import transversal.ExcepcionSQL;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Juan
 */
@Named(value = "gestionaProductoMBean")
@RequestScoped
public class GestionaProductoMBean {

    private int idproducto;
    private String nombre;
    private double precio;
    private List<Producto> listaProductos;
    private String mensaje_error;

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
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

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public String getMensaje_error() {
        return mensaje_error;
    }

    public void setMensaje_error(String mensaje_error) {
        this.mensaje_error = mensaje_error;
    }
    
    

    /*@PostConstruct
    public void iniciar() {
        GestionarProductoServicio gestionarProductoServicio = new GestionarProductoServicio();
        try {
            listaProductos = gestionarProductoServicio.consultarProductos();
        } catch (ExcepcionSQL e) {
            listaProductos = new ArrayList();//Si hubiera un error en la consulta, creo una lista vacia.
        }
    }*/
    
    public String consultarProductos(){
        String url_retorno = "vistaConsultarProductos";
        try{
            GestionarProductoServicio gestionarProductoServicio = new GestionarProductoServicio();
            listaProductos=gestionarProductoServicio.consultarProductos();
        }catch(ExcepcionSQL error){
            mensaje_error = "<b style=\"color: red\">Advertencia (error de acceso a datos):</b><br>";
            mensaje_error = mensaje_error + error.getMessage();
        }
       return url_retorno;
    }

    public String guardarProducto() {
        String url_retorno = "vistaGuardarProducto";
        Producto producto;
        try {
            producto = new Producto(nombre, precio);
            GestionarProductoServicio gestionarProductoServicio = new GestionarProductoServicio();
            gestionarProductoServicio.ingresarProducto(producto);
            consultarProductos();// Llamamos al evento de consultarProducto
        } catch (ExcepcionRegla error) {
            mensaje_error = "<b style=\"color: red\">Advertencia (incumplimiento de regla): </b><br>";
            mensaje_error = mensaje_error + error.getMessage();
            url_retorno = "vistaRegistrarProducto";
        } catch (ExcepcionSQL error) {
            mensaje_error = "<b style=\"color: red\">Advertencia (error de acceso a datos):</b><br>";
            mensaje_error = mensaje_error + error.getMessage();
            url_retorno = "vistaRegistrarProducto";
        } catch (Exception e) {
            mensaje_error = "<b style=\"color: red\">Advertencia (error de datos):</b><br>Verifique los datos de entrada.";
            url_retorno = "vistaRegistrarProducto";
        }
       return url_retorno;
    }

    /**
     * Creates a new instance of GestionaProductoMBean
     */
    public GestionaProductoMBean() {

    }

}
