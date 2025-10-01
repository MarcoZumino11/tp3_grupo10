package ar.edu.unju.escmi.tp3.ejercicio2;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GatoSimple gatoSimple = null;
        GatoSimple gatoContrincante = null;
        int opcion;

        do {
            System.out.println("\n--- MENÚ DE GATOS ---");
            System.out.println("1 – Crear gato simple");
            System.out.println("2 – Dar de comer a un gato simple");
            System.out.println("3 – Mostrar todos los datos");
            System.out.println("4 – Crear gato contrincante y pelear");
            System.out.println("5 – Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1: // Gato Simple
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Color: ");
                    String color = scanner.nextLine();
                    System.out.print("Peso (kg): ");
                    double peso = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Raza: ");
                    String raza = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Sexo (macho/hembra): ");
                    String sexo = scanner.nextLine();
                    gatoSimple = new GatoSimple(nombre, color, peso, raza, edad, sexo);
                    break;

                case 2: // Dar de comer
                    if (gatoSimple != null) {
                        System.out.print("Ingrese comida para el gato: ");
                        String comida = scanner.nextLine();
                        gatoSimple.comer(comida);
                    } else {
                        System.out.println("Primero debe crear un gato simple.");
                    }
                    break;

                case 3: // Mostrar datos
                    if (gatoSimple != null) {
                        System.out.println("\n--- GATO SIMPLE ---");
                        gatoSimple.mostrarDatos();
                        System.out.print("Maullido: ");
                        gatoSimple.maullar();
                        System.out.print("Ronroneo: ");
                        gatoSimple.ronronear();
                    } else {
                        System.out.println("No hay gato simple creado.");
                    }
                    break;

                case 4: // Pelear
                    if (gatoSimple != null) {
                        System.out.print("Nombre del contrincante: ");
                        String nombreC = scanner.nextLine();
                        System.out.print("Color: ");
                        String colorC = scanner.nextLine();
                        System.out.print("Peso (kg): ");
                        double pesoC = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("Raza: ");
                        String razaC = scanner.nextLine();
                        System.out.print("Edad: ");
                        int edadC = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Sexo (macho/hembra): ");
                        String sexoC = scanner.nextLine();
                        gatoContrincante = new GatoSimple(nombreC, colorC, pesoC, razaC, edadC, sexoC);

                        System.out.println("\n--- PELEA ---");
                        gatoSimple.pelear(gatoContrincante);
                    } else {
                        System.out.println("Primero debe crear un gato simple.");
                    }
                    break;

                case 5: // Salir
                    System.out.println("Fin del programa.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
