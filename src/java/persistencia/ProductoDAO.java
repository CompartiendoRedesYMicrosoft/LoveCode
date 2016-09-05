/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import dominio.Producto;
import transversal.ExcepcionSQL;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Juan
 */
public class ProductoDAO {
    private Connection obtenerConexion() throws ClassNotFoundException, SQLException{
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:5432/BDProducto";
        Connection conexion = DriverManager.getConnection(url, "postgres", "1234");
        return conexion;
    }
    
    public void ingresar(Producto producto) throws ExcepcionSQL{
        String sql = "insert into producto(nombre,precio) values(?,?)";
        Connection conexion = null;
        try {
            conexion = obtenerConexion();
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            sentencia.setString(1, producto.getNombre());
            sentencia.setDouble(2, producto.getPrecio());
            sentencia.executeUpdate();            
        } catch (Exception e) {            
            throw new ExcepcionSQL("No se pudo registrar a "
                    + producto.getNombre() + ". Intente de nuevo o consulte con el administrador.");
        } finally{
            try {
                if(conexion != null && !conexion.isClosed())
                    conexion.close();
            } catch (Exception e) {
            }
        }
    }
    
    public List<Producto> consultar() throws ExcepcionSQL{        
        List <Producto> listaproductos = new ArrayList(); //Objeto List= Interfaz que puede ser utilizado por un arrayList/ Guarda una coleccion de objetos
        Producto producto;
        int idproducto;
        String nombre;
        double precio;
        String sql = "select * from producto order by idproducto";
        Connection conexion = null;
        try {
            conexion = obtenerConexion();
            Statement sentencia = conexion.createStatement();
            ResultSet resultado = sentencia.executeQuery(sql);//Objeto que guarda todo lo que viene de una consulta SQL.
            while(resultado.next()){
                idproducto = resultado.getInt("idproducto");
                nombre = resultado.getString("nombre");
                precio = resultado.getDouble("precio");
                producto = new Producto(idproducto, nombre, precio);
                listaproductos.add(producto);
            }
        } catch (Exception e) {
            throw new ExcepcionSQL("No se pudo consultar los productos. Intente de nuevo o consulte con el administrador.");
        } finally{
            try {
                if(conexion != null && !conexion.isClosed())
                    conexion.close();
            } catch (Exception e) {
            }
        }    
        return listaproductos;
    }
}
