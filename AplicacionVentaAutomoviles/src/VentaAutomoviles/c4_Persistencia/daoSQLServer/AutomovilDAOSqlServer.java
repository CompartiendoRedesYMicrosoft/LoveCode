package VentaAutomoviles.c4_Persistencia.daoSQLServer;

import VentaAutomoviles.c3_Dominio.Contrato.IAutomovilDAO;
import VentaAutomoviles.c3_Dominio.Entidades.Automovil;
import VentaAutomoviles.c4_Persistencia.GestorJDBC;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MyOS
 */
public class AutomovilDAOSqlServer implements IAutomovilDAO{
    
    GestorJDBC gestorJBDC;

    public AutomovilDAOSqlServer(GestorJDBC gestorJBDC) {
        this.gestorJBDC = gestorJBDC;
    }
       
    @Override
    public int ingresar(Automovil automovil) throws SQLException {
        String sentenciaSQL= "insert into automovil(modelo, color, precio, motor, anio_fabricacion, descripcion, imagen) "
                + "values(?,?,?,?,?,?,?)";
        PreparedStatement sentencia = gestorJBDC.prepararSentencia(sentenciaSQL);
        sentencia.setString(1, automovil.getModelo());
        sentencia.setString(2, automovil.getColor());
        sentencia.setDouble(3, automovil.getPrecio());
        sentencia.setString(4, automovil.getMotor());
        sentencia.setString(5, automovil.getAnioFabricacion());
        sentencia.setString(6, automovil.getDescripcion());
        sentencia.setString(7, automovil.getImagen());
        return sentencia.executeUpdate();
    }

    @Override
    public int modificar(Automovil automovil) throws SQLException {
        String sentenciaSQL = "update producto set modelo=?, color=?, precio=?, motor=?, anio_fabricacion=?, descripcion=?, imagen=? where automovil_id = ?";
        PreparedStatement sentencia = gestorJBDC.prepararSentencia(sentenciaSQL);
        sentencia.setString(1, automovil.getModelo());
        sentencia.setString(2, automovil.getColor());
        sentencia.setDouble(3, automovil.getPrecio());
        sentencia.setString(4, automovil.getAnioFabricacion());
        sentencia.setString(5, automovil.getImagen());
        return sentencia.executeUpdate();
    }

    @Override
    public int eliminar(Automovil automovil) throws SQLException {
        //Metodo para mostrar como se hace el 
        String sentenciaSQL = "delete from automovil where automovil_id = ?";
        PreparedStatement sentencia = gestorJBDC.prepararSentencia(sentenciaSQL);
        sentencia.setInt(1, automovil.getAutomovilId());
        return sentencia.executeUpdate();
    }

    @Override
    public List<Automovil> buscar(String modelo) throws SQLException {
        ArrayList<Automovil> listaAutomoviles= new ArrayList();
        Automovil automovil;
        ResultSet resultado;
        String sentenciaSQL;
        sentenciaSQL="select automovil_id, modelo, color, precio, motor, anio_fabricacion, descripcion, imagen from automovil where modelo=?";
        resultado= gestorJBDC.ejecutarConsulta(sentenciaSQL);
        while (resultado.next()) {
            automovil= new Automovil();
            automovil.setAutomovilId(resultado.getInt("automovil_id"));
            automovil.setModelo(resultado.getString("modelo"));
            automovil.setColor(resultado.getString("color"));
            automovil.setPrecio(resultado.getDouble("precio"));
            automovil.setMotor(resultado.getString("motor"));
            automovil.setAnioFabricacion(resultado.getString("anio_fabricacion"));
            automovil.setDescripcion(resultado.getString("descripcion"));
            automovil.setImagen(resultado.getString("imagen"));
            listaAutomoviles.add(automovil);
        }
        resultado.close();
        return listaAutomoviles;
    }
    
}
