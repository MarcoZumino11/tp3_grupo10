package ar.edu.unju.escmi.tp3.ejercicio1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persona {
    private String nombre;
    private String dni;
    private LocalDate fechaNacimiento;

    // Constructores
    public Persona() {
        this.nombre = "";
        this.dni = "";
        this.fechaNacimiento = null;
    }

    public Persona(String nombre, String dni, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(LocalDate fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    // Métodos públicos que usan internamente los privados
    public int getEdad() {
        return calcularEdad(); // llamar a método privado
    }

    public boolean isMayorDeEdad() {
        return esMayorDeEdad(); // wrapper público
    }

    // Metodos privados
    private int calcularEdad() {
        if (fechaNacimiento == null) return 0;
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    private boolean esMayorDeEdad() {
        return calcularEdad() >= 18;
    }

    @Override
    public String toString() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fn = fechaNacimiento == null ? "N/D" : fechaNacimiento.format(f);
        return "Persona{nombre='" + nombre + "', dni='" + dni + "', fechaNacimiento=" + fn +
               ", edad=" + getEdad() + ", mayor=" + esMayorDeEdad() + "}";
    }
} 
