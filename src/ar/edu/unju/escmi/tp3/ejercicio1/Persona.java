package ar.edu.unju.escmi.tp3.ejercicio1;
import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private String dni;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String domicilio;
    private String provincia;

    // Constructor por defecto
    public Persona() {}

    // Constructor completo
    public Persona(String dni, String nombre, LocalDate fechaNacimiento, String domicilio, String provincia) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.domicilio = domicilio;
        this.provincia = provincia;
    }

    // Constructor parcial (dni, nombre, fechaNacimiento) 
    public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.provincia = "No Asignado";
    }

    // Getters y setters
    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(LocalDate fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public String getDomicilio() { return domicilio; }
    public void setDomicilio(String domicilio) { this.domicilio = domicilio; }

    public String getProvincia() { return provincia; }
    public void setProvincia(String provincia) { this.provincia = provincia; }

    // Método privado para calcular edad
    private int calcularEdad() {
        if (fechaNacimiento == null) return 0;
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    // Método privado para verificar mayoría de edad
    private boolean esMayorDeEdad() {
        return calcularEdad() >= 18;
    }

    // Método público para mostrar todos los datos
    public void mostrarDatos() {
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("Domicilio: " + (domicilio != null ? domicilio : "No asignado"));
        System.out.println("Provincia: " + provincia);
        System.out.println("Edad: " + calcularEdad());
        System.out.println(esMayorDeEdad() ? "La persona es mayor de edad" : "La persona no es mayor de edad");
        System.out.println("----------------------------------------");
    }
}
