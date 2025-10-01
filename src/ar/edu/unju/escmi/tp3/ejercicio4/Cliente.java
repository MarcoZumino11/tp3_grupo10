package ar.edu.unju.escmi.tp3.ejercicio4;

public class Cliente {
    private String dni;
    private String nombre;
    private char categoria;

    /**
     * Constructor parametrizado para inicializar los atributos.
     */
    public Cliente(String dni, String nombre, char categoria) {
        this.dni = dni;
        this.nombre = nombre;
        this.categoria = categoria;
    }

    // Getters necesarios para búsquedas
    public String getDni() {
        return dni;
    }

    public char getCategoria() {
        return categoria;
    }

    /**
     * Sobrescribe el método toString para mostrar los datos del cliente.
     */
    @Override
    public String toString() {
        return "DNI: " + dni + "\nNombre: " + nombre + "\nCategoría: " + categoria;
    }
}
