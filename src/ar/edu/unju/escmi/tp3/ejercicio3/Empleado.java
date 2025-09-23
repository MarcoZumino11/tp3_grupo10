package ar.edu.unju.escmi.tp3.ejercicio3;

public class Empleado {
    
    private String nombre;
    private int legajo;
    private double salario;

    private static final double SALARIO_MINIMO = 600000.00;
    private static final double AUMENTO_MERITOS = 90000.00;

    public Empleado(String nombre, int legajo, double salario) {
        this.nombre = nombre;
        this.legajo = legajo;

        if (salario >= SALARIO_MINIMO) {
            this.salario = salario;
        } else {
            this.salario = SALARIO_MINIMO;
        }
    }

    public void mostrarDatos() {
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Legajo: " + legajo);
        System.out.println("Salario $: " + String.format("%,.2f", salario));
    }

    public void aumentarSalario() {
        salario += AUMENTO_MERITOS;
        System.out.println("El salario ha sido incrementado.");
    }

    public int getLegajo() {
        return legajo;
    }

}
