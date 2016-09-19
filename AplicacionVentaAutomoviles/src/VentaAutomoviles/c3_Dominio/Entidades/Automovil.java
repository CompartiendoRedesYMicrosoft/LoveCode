package VentaAutomoviles.c3_Dominio.Entidades;

/**
 *
 * @author MyOS
 */
public class Automovil {
    private int automovilId;
    private String modelo ;
    private String color;
    private double  precio ;
    private String motor;
    private String  anioFabricacion;
    private String descripcion;
    private String imagen ;

    public int getAutomovilId() {
        return automovilId;
    }

    public void setAutomovilId(int automovilId) {
        this.automovilId = automovilId;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(String anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Automovil(int automovilId, String modelo, String color, double precio, String motor, String anioFabricacion, String descripcion, String imagen) {
        this.automovilId = automovilId;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.motor = motor;
        this.anioFabricacion = anioFabricacion;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }




    
}