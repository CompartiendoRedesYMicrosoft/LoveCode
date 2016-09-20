/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentaAutomoviles.c3_Dominio.Contrato;

import VentaAutomoviles.c3_Dominio.Entidades.Pedido;
import java.sql.SQLException;

/**
 *
 * @author Practicas-Tesis
 */
public interface IPedidoDAO {
    public int ingresar(Pedido pedido) throws SQLException;
    public int modificar(Pedido pedido) throws SQLException;
    public int mostrarTodos() throws SQLException;    
}
