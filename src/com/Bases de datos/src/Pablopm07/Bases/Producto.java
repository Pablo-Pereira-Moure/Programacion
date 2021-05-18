package Pablopm07.Bases;

public class Producto {

    private String nombre;
    private float precio;
    private int cantidad;
    private int codigo;

    public Producto(String nombre, float precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Producto(String nombre, float precio, int cantidad, int codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.codigo = codigo;
    }

    Producto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

}
