package VentaAutomoviles.c2_Aplicacion;

import VentaAutomoviles.c3_Dominio.Contrato.FabricaAbstractaDAO;
import VentaAutomoviles.c3_Dominio.Contrato.IClienteDAO;
import VentaAutomoviles.c3_Dominio.Entidades.Cliente;
import VentaAutomoviles.c4_Persistencia.GestorJDBC;

/**
 *
 * @author Hernan
 */
public class GestionarClienteServicio {
    private GestorJDBC gestorJDBC;
    private IClienteDAO ClienteDAO;
    
    public GestionarClienteServicio(){
        FabricaAbstractaDAO fabricaAbstractaDAO= FabricaAbstractaDAO.getInstancia();
        gestorJDBC = fabricaAbstractaDAO.crearGestorJDBC();
        ClienteDAO = fabricaAbstractaDAO.crearClienteDAO(gestorJDBC);
    }
    
     public int crearAutomovil(Cliente cliente) throws Exception{
        gestorJDBC.abrirConexion();
        int registros_afecctados = ClienteDAO.ingresar(cliente);
        gestorJDBC.cerrarConexion();
        return registros_afecctados;
    }
    
    public int modificarAutomovil(Cliente cliente) throws Exception{
        gestorJDBC.abrirConexion();
        int registros_afectados = ClienteDAO.modificar(cliente);
        gestorJDBC.cerrarConexion();
        return registros_afectados;
    }
    
    public int eliminarAutomovil(Cliente cliente) throws Exception{
        gestorJDBC.abrirConexion();
        int registros_afectados = ClienteDAO.eliminar(cliente);
        gestorJDBC.cerrarConexion();
        return registros_afectados;
    }
    
}
