
package VentaAutomoviles.c3_Dominio.Contrato;

import VentaAutomoviles.c5_infraestructura.parametros.LectorDeParametros;
import VentaAutomoviles.c4_Persistencia.GestorJDBC;

/**
 *
 * @author MyOS
 */
public abstract class FabricaAbstractaDAO {
    public static FabricaAbstractaDAO getInstancia(){
        String nombreClaseFabricaDAO;
        FabricaAbstractaDAO FabricaDAO;        
        try {
            LectorDeParametros lectorDeParametros = new LectorDeParametros();
            nombreClaseFabricaDAO = lectorDeParametros.getValorParametro("claseFabricaDAO");
            FabricaDAO = (FabricaAbstractaDAO)Class.forName(nombreClaseFabricaDAO).newInstance();
            return FabricaDAO;
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            return null;
        }
    }
    public abstract  GestorJDBC crearGestorJDBC();
    
    public abstract IAutomovilDAO crearAutomovilDAO(GestorJDBC gestorJDBC);
    
}
