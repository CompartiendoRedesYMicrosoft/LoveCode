/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import dominio.Producto;
import persistencia.ProductoDAO;
import java.util.List;
import transversal.ExcepcionRegla;
import transversal.ExcepcionSQL;

/**
 *
 * @author Juan
 */
public class GestionarProductoServicio {    
      public void ingresarProducto(Producto producto) throws ExcepcionRegla, ExcepcionSQL{
        try {
            producto.validarPrecio();
            ProductoDAO productoDAO = new ProductoDAO();
            productoDAO.ingresar(producto);
        } catch (ExcepcionRegla | ExcepcionSQL e) { //habilitado para la version 8, de colocar 2 expcepciones dentro de un catch.
            throw e;
        }        
    }
      
      public List<Producto> consultarProductos() throws ExcepcionSQL{
        try {
            ProductoDAO productoDAO = new ProductoDAO();
            List<Producto> listaproductos = productoDAO.consultar();
            return listaproductos;
        } catch (ExcepcionSQL e) {
            throw e;
        }
    }
      
      
  }
