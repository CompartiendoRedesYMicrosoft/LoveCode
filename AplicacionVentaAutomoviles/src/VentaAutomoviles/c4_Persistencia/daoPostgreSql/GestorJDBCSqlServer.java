
package VentaAutomoviles.c4_Persistencia.daoPostgreSql;

import VentaAutomoviles.c4_Persistencia.GestorJDBC;
import java.sql.DriverManager;

/**
 *
 * @author user
 */
public class GestorJDBCSqlServer extends GestorJDBC{

    @Override
    public void abrirConexion() throws Exception {
        Class.forName("org.sqlserver.Driver");
        String url = "jdbc:sqlserver://localhost:5432/VentaAutomoviles";
        conexion = DriverManager.getConnection(url, "postgres", "123456");
    }
    
}
