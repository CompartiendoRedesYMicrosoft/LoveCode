
package VentaAutomoviles.c4_Persistencia.daoPostgreSql;

import VentaAutomoviles.c4_Persistencia.GestorJDBC;
import java.sql.DriverManager;

/**
 *
 * @author MyOS
 */
public class GestorJDBCPostgre extends GestorJDBC {    

    @Override
    public void abrirConexion() throws Exception{        
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:5432/VentaAutomoviles";
        conexion = DriverManager.getConnection(url, "postgres", "123456");   
    }
    
}
