package VentaAutomoviles.c3_Dominio.Entidades;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author MayerOlivaresSalinas
 */
public class Pedido {
    private int pedidoid;
    private String fechaEntrega;
    private String fechaCompra;
    private String estado;
    private double monto;
    private double igv;
    private List<Lineadepedido> lineasdepedido;

    public Pedido() {
        this.lineasdepedido = new ArrayList<>();
    }
    
    public int getPedidoid() {
        return pedidoid;
    }

    public void setPedidoid(int pedidoid) {
        this.pedidoid = pedidoid;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }
    
    
}
