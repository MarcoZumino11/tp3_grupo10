package ar.edu.unju.escmi.tp3.ejercicio2;

public class GatoSimple {
    // Atributos privados
    private String nombre;
    private String color;
    private double peso;
    private String raza;
    private int edad;
    private String sexo; // "macho" o "hembra"

    // Constructor parametrizado
    public GatoSimple(String nombre, String color, double peso, String raza, int edad, String sexo) {
        this.nombre = nombre;
        this.color = color;
        this.peso = peso;
        this.raza = raza;
        this.edad = edad;
        this.sexo = sexo.toLowerCase(); // Normalizamos el valor
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getColor() { return color; }
    public double getPeso() { return peso; }
    public String getRaza() { return raza; }
    public int getEdad() { return edad; }
    public String getSexo() { return sexo; }

    // Métodos de comportamiento
    public void maullar() {
        System.out.println("Miauu");
    }

    public void ronronear() {
        System.out.println("prrrr");
    }

    public void comer(String comida) {
        if (comida.equalsIgnoreCase("pescado")) {
            System.out.println("¡Qué rico! ¡Gracias!!");
        } else {
            System.out.println("Lo siento, yo solo como pescado");
        }
    }

    public void pelear(GatoSimple gatoContrincante) {
        if (this.sexo.equals("hembra")) {
            System.out.println("No me gusta pelear");
        } else if (this.sexo.equals("macho")) {
            if (gatoContrincante.getSexo().equals("hembra")) {
                System.out.println("No peleo contra gatitas");
            } else {
                System.out.println("¡Ven aquí que te vas a enterar!");
            }
        } else {
            System.out.println("Sexo no reconocido");
        }
    }

    // Método para mostrar todos los datos del gato
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Color: " + color);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Raza: " + raza);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Sexo: " + sexo);
    }
}
