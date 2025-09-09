package ar.edu.unju.escmi.tp3.ejercicio2;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GatoSimple gato = null;
        GatoSimple gatoContrincante = null;
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1 - Crear gato simple");
            System.out.println("2 - Dar de comer a un gato simple");
            System.out.println("3 - Mostrar gato simple");
            System.out.println("4 - Crear gato contrincante y pelear");
            System.out.println("5 - salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Color: ");
                    String color = sc.nextLine();
                    System.out.print("Raza: ");
                    String raza = sc.nextLine();
                    System.out.print("Edad: ");
                    int edad = sc.nextInt();
                    System.out.print("Peso: ");
                    double peso = sc.nextDouble();
                    sc.nextLine(); // limpiar buffer
                    System.out.print("Sexo (macho/hembra): ");
                    String sexo = sc.nextLine();
                    gato = new GatoSimple(nombre, color, raza, edad, peso, sexo);
                    System.out.println("¡Gato creado con éxito!");
                    break;

                case 2:
                    if (gato != null) {
                        System.out.print("¿Qué comida le das al gato?: ");
                        String comida = sc.nextLine();
                        gato.comer(comida);
                    } else {
                        System.out.println("Primero debes crear un gato.");
                    }
                    break;

                case 3:
                    if (gato != null) {
                        gato.mostrarInfo();
                        gato.maullar();
                        gato.ronronear();
                    } else {
                        System.out.println("Primero debes crear un gato.");
                    }
                    break;

                case 4:
                    if (gato != null) {
                        System.out.println("Creando gato contrincante...");
                        System.out.print("Nombre: ");
                        String nombre2 = sc.nextLine();
                        System.out.print("Color: ");
                        String color2 = sc.nextLine();
                        System.out.print("Raza: ");
                        String raza2 = sc.nextLine();
                        System.out.print("Edad: ");
                        int edad2 = sc.nextInt();
                        System.out.print("Peso: ");
                        double peso2 = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Sexo (macho/hembra): ");
                        String sexo2 = sc.nextLine();
                        gatoContrincante = new GatoSimple(nombre2, color2, raza2, edad2, peso2, sexo2);

                        gato.pelear(gatoContrincante);
                    } else {
                        System.out.println("Primero debes crear un gato simple.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 5);

        sc.close();
    }
}
