package VentaAutomoviles.c3_Dominio.Entidades;

/**
 *
 * @author MyOS
 */
public class Automovil {
    private int automovilid;
    private String descripcion;
    private double precio;
    
    public int getAutomovilId() {
        return automovilid;
    }

    public void setAutomovilId(int automovilid) {
        this.automovilid = automovilid;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
