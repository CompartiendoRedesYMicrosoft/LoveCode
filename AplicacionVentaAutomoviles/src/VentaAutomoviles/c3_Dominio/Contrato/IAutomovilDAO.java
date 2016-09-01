package VentaAutomoviles.c3_Dominio.Contrato;

import VentaAutomoviles.c3_Dominio.Entidades.Automovil;
import java.sql.SQLException;

/**
 *
 * @author MyOS
 */
public interface IAutomovilDAO {
    public int ingresar(Automovil automovil) throws SQLException;
    public int modificar(Automovil automovil) throws SQLException;
    public int eliminar(Automovil automovil) throws SQLException;
}
