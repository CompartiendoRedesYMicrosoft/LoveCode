
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
        String url = "jdbc:sqlserver://localhost:1433;databaseName=demoJava";
        conexion = DriverManager.getConnection(url, "sa", "123456");
    }
    
}
