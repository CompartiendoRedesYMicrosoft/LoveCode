/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentaAutomoviles.c3_Dominio.Entidades;

import java.util.List;


/**
 *
 * @author Practicas-Tesis
 */
public class Pedido {
    private int pedidoid;
    private String fechaCompra;
    private String fechaEntrega;
    private String estado;
    private List<Lineadepedido> lineasdepedido;
    private double monto;
    
}
