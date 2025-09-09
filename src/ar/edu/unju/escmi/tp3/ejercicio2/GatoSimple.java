package ar.edu.unju.escmi.tp3.ejercicio2;

public class GatoSimple {
    // Atributos privados
    private String nombre;
    private String color;
    private String raza;
    private int edad;
    private double peso;
    private String sexo; // "macho" o "hembra"

    // Constructor parametrizado
    public GatoSimple(String nombre, String color, String raza, int edad, double peso, String sexo) {
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.sexo = sexo.toLowerCase();
    }

    // Métodos de acción
    public void maullar() {
        System.out.println("Miauu");
    }

    public void ronronear() {
        System.out.println("prrrr");
    }

    public void comer(String comida) {
        if (comida.equalsIgnoreCase("pescado")) {
            System.out.println("¡Qué rico, gracias!");
        } else {
            System.out.println("Lo siento, yo solo como pescado");
        }
    }

    public void pelear(GatoSimple gatoContrincante) {
        if (this.sexo.equals("hembra")) {
            System.out.println("No me gusta pelear");
        } else if (this.sexo.equals("macho")) {
            if (gatoContrincante.sexo.equals("hembra")) {
                System.out.println("No peleo contra gatitas");
            } else {
                System.out.println("¡Ven aquí que te vas a enterar!");
            }
        }
    }

    // Método para mostrar datos
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Color: " + color);
        System.out.println("Raza: " + raza);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Sexo: " + sexo);
    }
}
