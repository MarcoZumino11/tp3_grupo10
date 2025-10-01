package ar.edu.unju.escmi.tp3.ejercicio5;

public class Producto {
    private String codigo;
    private String descripcion;
    private double precio;

    /**
     * Constructor por defecto que inicializa los atributos con valores vacíos o cero.
     */
    public Producto() {
        this.codigo = "";
        this.descripcion = "";
        this.precio = 0.0;
    }

    // Métodos accesores
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    /**
     * Muestra el estado del objeto en formato legible.
     */
    @Override
    public String toString() {
        return "Producto [código='" + codigo + "', descripción='" + descripcion + "', precio=$" + String.format("%,.2f", precio) + "]";
    }
}
