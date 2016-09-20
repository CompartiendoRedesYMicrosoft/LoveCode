/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentaAutomoviles.c2_Aplicacion;

import VentaAutomoviles.c3_Dominio.Contrato.FabricaAbstractaDAO;
import VentaAutomoviles.c3_Dominio.Contrato.IVendedorDAO;
import VentaAutomoviles.c3_Dominio.Entidades.Vendedor;
import VentaAutomoviles.c4_Persistencia.GestorJDBC;

/**
 *
 * @author Erick Sanchez
 */
public class GestionarVendedorServicio {
    private GestorJDBC gestorJDBC;
    private IVendedorDAO vendedorDAO;

    public GestionarVendedorServicio() {
        FabricaAbstractaDAO fabricaAbstractaDAO = FabricaAbstractaDAO.getInstancia();
        gestorJDBC = fabricaAbstractaDAO.crearGestorJDBC();
        vendedorDAO = fabricaAbstractaDAO.crearVendedorDAO(gestorJDBC);
    }
        
        public int crearVendedor(Vendedor vendedor) throws Exception{
            gestorJDBC.abrirConexion();
            try{
                int registros_afectados = vendedorDAO.ingresar(vendedor);
                gestorJDBC.cerrarConexion();
                return registros_afectados;
            }catch(Exception e){
                gestorJDBC.cancelarTransaccion();
                gestorJDBC.cerrarConexion();
                throw e;
            }
        }
 }
