/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentaAutomoviles.c3_Dominio.Contrato;

import VentaAutomoviles.c3_Dominio.Entidades.Cliente;
import java.sql.SQLException;

/**
 *
 * @author Hernan
 */
public interface IClienteDAO {

    public int ingresar(Cliente automovil) throws SQLException;

    public int modificar(Cliente automovil) throws SQLException;

    public int eliminar(Cliente automovil) throws SQLException;

}
