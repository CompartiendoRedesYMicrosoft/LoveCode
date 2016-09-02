/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    private IClienteDAO iClienteDAO;
    
    public GestionarClienteServicio(){
        FabricaAbstractaDAO fabricaAbstractaDAO= FabricaAbstractaDAO.getInstancia();
        gestorJDBC = fabricaAbstractaDAO.crearGestorJDBC();
        iClienteDAO = fabricaAbstractaDAO.crearClienteDAO(gestorJDBC);
    }
    
     public int crearAutomovil(Cliente cliente) throws Exception{
        gestorJDBC.abrirConexion();
        int registros_afecctados = iClienteDAO.ingresar(cliente);
        gestorJDBC.cerrarConexion();
        return registros_afecctados;
    }
    
    public int modificarAutomovil(Cliente cliente) throws Exception{
        gestorJDBC.abrirConexion();
        int registros_afectados = iClienteDAO.modificar(cliente);
        gestorJDBC.cerrarConexion();
        return registros_afectados;
    }
    
    public int eliminarAutomovil(Cliente cliente) throws Exception{
        gestorJDBC.abrirConexion();
        int registros_afectados = iClienteDAO.eliminar(cliente);
        gestorJDBC.cerrarConexion();
        return registros_afectados;
    }
    
}
