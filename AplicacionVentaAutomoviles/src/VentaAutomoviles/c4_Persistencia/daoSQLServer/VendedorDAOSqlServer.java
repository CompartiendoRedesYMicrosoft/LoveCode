/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentaAutomoviles.c4_Persistencia.daoSQLServer;
import VentaAutomoviles.c3_Dominio.Contrato.IVendedorDAO;
import VentaAutomoviles.c3_Dominio.Entidades.Vendedor;
import VentaAutomoviles.c4_Persistencia.GestorJDBC;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Erick Sanchez
 */
public class VendedorDAOSqlServer implements IVendedorDAO{
    GestorJDBC gestorJDBC;      

    public VendedorDAOSqlServer(GestorJDBC gestorJDBC) {
        this.gestorJDBC = gestorJDBC;
    }
    
    @Override
     public int ingresar(Vendedor vendedor) throws SQLException{
        String sentenciaSQL="insert into vendedor(nombre, apellidos, fecha_nacimiento, dni, direccion, correo, telefono, sexo, sueldo) "
                +"values(',?,?,?,?,?,?,?,?)";
        PreparedStatement sentencia= gestorJDBC.prepararSentencia(sentenciaSQL);
        sentencia.setString(1, vendedor.getNombre());
        sentencia.setString(2, vendedor.getApellidos());
        sentencia.setDate(3, vendedor.getFecha_nacimiento());
        sentencia.setString(4, vendedor.getDni());
        sentencia.setString(5, vendedor.getDireccion());
        sentencia.setString(6, vendedor.getCorreo());
        sentencia.setString(7, vendedor.getTelefono());
        sentencia.setString(8, vendedor.getSexo());
        sentencia.setDouble(9, vendedor.getSueldo());
        return sentencia.executeUpdate();
    }

    @Override
    public int modificar(Vendedor vendedor) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int eliminar(Vendedor vendedor) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int mostrarTodos() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int buscar(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
