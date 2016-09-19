package VentaAutomoviles.c4_Persistencia.daoSQLServer;

import VentaAutomoviles.c3_Dominio.Contrato.IAutomovilDAO;
import VentaAutomoviles.c3_Dominio.Entidades.Automovil;
import VentaAutomoviles.c4_Persistencia.GestorJDBC;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
        String sentenciaSQL= "insert into automovil(descripcion,precio) "
                + "values(?,?)";
        PreparedStatement sentencia = gestorJBDC.prepararSentencia(sentenciaSQL);
        sentencia.setString(1, automovil.getDescripcion());
        return sentencia.executeUpdate();
        
    }

    @Override
    public int modificar(Automovil automovil) throws SQLException {
        String sentenciaSQL = "update producto set descripcion = ?, set precio = ? where productoid = ?";
        PreparedStatement sentencia = gestorJBDC.prepararSentencia(sentenciaSQL);
        sentencia.setString(1, automovil.getDescripcion());
        sentencia.setDouble(2, automovil.getPrecio());
        return sentencia.executeUpdate();
    }

    @Override
    public int eliminar(Automovil automovil) throws SQLException {
        String sentenciaSQL = "delete from producto where productoid = ?";
        PreparedStatement sentencia = gestorJBDC.prepararSentencia(sentenciaSQL);
        sentencia.setInt(1, automovil.getAutomovilId());
        return sentencia.executeUpdate();
    }
    
}
