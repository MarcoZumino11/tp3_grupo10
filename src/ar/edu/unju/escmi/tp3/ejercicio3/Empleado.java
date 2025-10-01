package ar.edu.unju.escmi.tp3.ejercicio3;

public class Empleado {
    // Atributos privados
    private String nombre;
    private int legajo;
    private double salario;

    // Constantes de negocio
    private static final double SALARIO_MINIMO = 600000.00;
    private static final double AUMENTO_MERITOS = 90000.00;

    /**
     * Constructor que inicializa los atributos y ajusta el salario según el mínimo.
     */
    public Empleado(String nombre, int legajo, double salario) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.salario = (salario >= SALARIO_MINIMO) ? salario : SALARIO_MINIMO;
    }

    /**
     * Muestra los datos del empleado en formato legible.
     */
    public void mostrarDatos() {
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Legajo: " + legajo);
        System.out.println("Salario $: " + String.format("%,.2f", salario));
    }

    /**
     * Aplica aumento por méritos al salario actual.
     */
    public void aumentarSalario() {
        salario += AUMENTO_MERITOS;
        System.out.println("El salario ha sido incrementado.");
    }

    // Getter necesario para validar legajo
    public int getLegajo() {
        return legajo;
    }
}
