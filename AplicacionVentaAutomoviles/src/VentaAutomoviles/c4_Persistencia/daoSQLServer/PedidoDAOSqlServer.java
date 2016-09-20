package VentaAutomoviles.c4_Persistencia.daoSQLServer;

import VentaAutomoviles.c3_Dominio.Contrato.IPedidoDAO;
import VentaAutomoviles.c3_Dominio.Entidades.Pedido;
import java.sql.SQLException;

/**
 *
 * @author MyOS
 */
public class PedidoDAOSqlServer implements IPedidoDAO{

    @Override
    public int ingresar(Pedido pedido) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int modificar(Pedido pedido) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int mostrarTodos() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
