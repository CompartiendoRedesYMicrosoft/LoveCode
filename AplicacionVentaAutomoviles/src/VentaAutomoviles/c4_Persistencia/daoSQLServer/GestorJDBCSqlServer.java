
package VentaAutomoviles.c4_Persistencia.daoSQLServer;

import VentaAutomoviles.c4_Persistencia.GestorJDBC;
import java.sql.DriverManager;

/**
 *
 * @author user
 */
public class GestorJDBCSqlServer extends GestorJDBC{

    @Override
    public void abrirConexion() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://vifh2irxzj.database.windows.net:1433;databaseName=beta";
        conexion = DriverManager.getConnection(url, "Administrador", "password*123");
    }
    
}
