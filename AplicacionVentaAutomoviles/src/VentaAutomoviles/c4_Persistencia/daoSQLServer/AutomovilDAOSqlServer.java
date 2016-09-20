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
        String sentenciaSQL= "insert into Automovil(AutomovilModelo, AutomovilColor, AutomovilPrecio, AutomovilMotor, AutomovilAfabricacion, AutomovilDescripcion, AutomovilImagen) "
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
        String sentenciaSQL = "update producto set modelo = ?, color= ?, precio = ?, anioFabricacion= ?, imagen= ? where productoid = ?";
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
        String sentenciaSQL = "delete from producto where productoid = ?";
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
        sentenciaSQL="";
        resultado= gestorJBDC.ejecutarConsulta(sentenciaSQL);
        while (resultado.next()) {
            automovil= new Automovil();
            automovil.setAutomovilId(resultado.getInt("NOMBREDECOLUMNAENLABD"));
            automovil.setModelo(resultado.getString(""));
            automovil.setColor(resultado.getString(""));
            automovil.setPrecio(resultado.getDouble(""));
            automovil.setMotor(resultado.getString(""));
            automovil.setAnioFabricacion(resultado.getString(""));
            automovil.setDescripcion(resultado.getString(""));
            automovil.setImagen(resultado.getString(""));
            listaAutomoviles.add(automovil);
        }
        resultado.close();
        return listaAutomoviles;
    }

    @Override
    public Automovil buscar(int id) throws SQLException {
        Automovil automovil=null;
        ResultSet resultado;
        String sentenciaSQL;
        sentenciaSQL="";
        resultado= gestorJBDC.ejecutarConsulta(sentenciaSQL);
        if(resultado.next()){
            automovil= new Automovil();
            automovil.setAutomovilId(resultado.getInt("NOMBREDECOLUMNAENLABD"));
            automovil.setModelo(resultado.getString(""));
            automovil.setColor(resultado.getString(""));
            automovil.setPrecio(resultado.getDouble(""));
            automovil.setMotor(resultado.getString(""));
            automovil.setAnioFabricacion(resultado.getString(""));
            automovil.setDescripcion(resultado.getString(""));
            automovil.setImagen(resultado.getString(""));
        }
        resultado.close();
        return automovil;
    }
    
}
