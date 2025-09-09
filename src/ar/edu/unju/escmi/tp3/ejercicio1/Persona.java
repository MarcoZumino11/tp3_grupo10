package ar.edu.unju.escmi.tp3.ejercicio1;
import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private int dni;
    private String nombre;
    private LocalDate fecNac;
    private String provincia;
    private String domicilio;

public Persona() {
    // Constructor por defecto
}

public Persona(int dni, String nombre, LocalDate fecNac, String domicilio, String provincia) {
        this.dni = dni;
        this.nombre = nombre;
        this.fecNac = fecNac;
        this.domicilio = domicilio;
        this.provincia = provincia;
    }

public Persona(int dni, String nombre, LocalDate fecNac) {
        this.dni = dni;
        this.nombre = nombre;
        this.fecNac = fecNac;
        this.provincia = "Jujuy";
        // domicilio queda null
    }
    public int getDni() { return dni; }
    public void setDni(int dni) { this.dni = dni; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public LocalDate getFecNac() { return fecNac; }
    public void setFecNac(LocalDate fecNac) { this.fecNac = fecNac; }

    public String getDomicilio() { return domicilio; }
    public void setDomicilio(String domicilio) { this.domicilio = domicilio; }

    public String getProvincia() { return provincia; }
    public void setProvincia(String provincia) { this.provincia = provincia; }
     public int calcularEdad() {
        if (fecNac == null) return -1;
        return Period.between(fecNac, LocalDate.now()).getYears();
    }

    public boolean esMayorDeEdad() {
        return calcularEdad() >= 18;
    }
    public void mostrarMensaje() {
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de nacimiento: " + fecNac);
        System.out.println("Domicilio: " + domicilio);
        System.out.println("Provincia: " + provincia);
        int edad = calcularEdad();
        System.out.println("Edad: " + (edad != -1 ? edad : "No disponible"));
        System.out.println(esMayorDeEdad() ? "La persona es mayor de edad" : "La persona no es mayor de edad");
    }
}
