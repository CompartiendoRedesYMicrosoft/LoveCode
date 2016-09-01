
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
        String url = "jdbc:sqlservser:ow8ckwsbcx.database.windows.net;DatabaseName=proyectoI";
        conexion = DriverManager.getConnection(url, "VentaAutomoviles", "Code*Love");
    }
    
}
