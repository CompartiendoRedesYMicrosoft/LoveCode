package VentaAutomoviles.c2_Aplicacion;

import VentaAutomoviles.c3_Dominio.Contrato.FabricaAbstractaDAO;
import VentaAutomoviles.c3_Dominio.Contrato.IAutomovilDAO;
import VentaAutomoviles.c3_Dominio.Entidades.Automovil;
import VentaAutomoviles.c4_Persistencia.GestorJDBC;

/**
 *
 * @author MyOS
 */
public class GestionarAutomovilServicio {

    private GestorJDBC gestorJDBC;
    private IAutomovilDAO automovilDAO;

    public GestionarAutomovilServicio() {
        FabricaAbstractaDAO fabricaAbstractaDAO = FabricaAbstractaDAO.getInstancia();
        gestorJDBC = fabricaAbstractaDAO.crearGestorJDBC();
        automovilDAO = fabricaAbstractaDAO.crearAutomovilDAO(gestorJDBC);
    }

    public int crearAutomovil(Automovil automovil) throws Exception {
        gestorJDBC.abrirConexion();
        try {
            //VALIDAR REGLAS NEGOCIO
            if (automovil.validarPrecio()) {
                int registros_afecctados = automovilDAO.ingresar(automovil);
                gestorJDBC.cerrarConexion();
                return registros_afecctados;
            }else{
                throw new Exception("El precio es incorrecto, debe ser positivo");
            }
        } catch (Exception e) {
            gestorJDBC.cancelarTransaccion();
            gestorJDBC.cerrarConexion();
            throw e;
        }
    }

    public int modificarAutomovil(Automovil automovil) throws Exception {
        gestorJDBC.abrirConexion();
        int registros_afectados = automovilDAO.modificar(automovil);
        gestorJDBC.cerrarConexion();
        return registros_afectados;
    }

    public int eliminarAutomovil(Automovil automovil) throws Exception {
        gestorJDBC.abrirConexion();
        int registros_afectados = automovilDAO.eliminar(automovil);
        gestorJDBC.cerrarConexion();
        return registros_afectados;
    }

}
