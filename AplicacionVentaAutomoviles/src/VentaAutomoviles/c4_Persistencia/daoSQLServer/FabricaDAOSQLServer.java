
package VentaAutomoviles.c4_Persistencia.daoSQLServer;

import VentaAutomoviles.c3_Dominio.Contrato.FabricaAbstractaDAO;
import VentaAutomoviles.c3_Dominio.Contrato.IAutomovilDAO;
import VentaAutomoviles.c3_Dominio.Contrato.IClienteDAO;
import VentaAutomoviles.c4_Persistencia.GestorJDBC;

public class FabricaDAOSQLServer extends FabricaAbstractaDAO{

    @Override
    public GestorJDBC crearGestorJDBC() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IAutomovilDAO crearAutomovilDAO(GestorJDBC gestorJDBC) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IClienteDAO crearClienteDAO(GestorJDBC gestorJDBC) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
