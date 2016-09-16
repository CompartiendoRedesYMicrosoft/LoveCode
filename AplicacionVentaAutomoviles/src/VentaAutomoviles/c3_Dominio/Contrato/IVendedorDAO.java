/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentaAutomoviles.c3_Dominio.Contrato;

import VentaAutomoviles.c3_Dominio.Entidades.Vendedor;
import java.sql.SQLException;

/**
 *
 * @author Practicas-Tesis
 */
public interface IVendedorDAO {
    public int ingresar(Vendedor vendedor) throws SQLException;
    public int modificar(Vendedor vendedor) throws SQLException;
    public int eliminar(Vendedor vendedor) throws SQLException;
    public int mostrarTodos() throws SQLException;
    public int buscar(int id) throws SQLException;
    
}
