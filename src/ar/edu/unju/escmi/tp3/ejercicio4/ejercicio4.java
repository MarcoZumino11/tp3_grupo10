package ar.edu.unju.escmi.tp3.ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente[] clientes = new Cliente[4];
        int contador = 0;
        int opcion;

        do {
            System.out.println("\n--- MENÚ DE CLIENTES ---");
            System.out.println("1 – Crear cliente");
            System.out.println("2 – Mostrar los datos de un cliente");
            System.out.println("3 – Mostrar todos los clientes");
            System.out.println("4 – Mostrar clientes por categoría");
            System.out.println("5 – Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) { // Inicio del switch
                case 1: // Crear cliente
                    if (contador < clientes.length) {
                        System.out.print("Ingrese DNI: ");
                        String dni = scanner.nextLine();
                        System.out.print("Ingrese nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingrese categoría (una letra): ");
                        char categoria = scanner.nextLine().charAt(0); 
                        clientes[contador] = new Cliente(dni, nombre, categoria);
                        contador++;
                        System.out.println("Cliente creado correctamente.");
                    } else {
                        System.out.println("Capacidad máxima alcanzada. No se pueden agregar más clientes.");
                    }
                    break;

                case 2: // Mostrar datos de un cliente por DNI
                    System.out.print("Ingrese el DNI a buscar: ");
                    String dniBuscado = scanner.nextLine();
                    boolean encontrado = false;
                    for (int i = 0; i < contador; i++) {
                        if (clientes[i].getDni().equals(dniBuscado)) {
                            System.out.println("\n--- DATOS DEL CLIENTE ---");
                            System.out.println(clientes[i]);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No se encontró el dni.");
                    }
                    break;

                case 3: // Mostrar todos los clientes
                    if (contador == 0) {
                        System.out.println("No hay clientes registrados.");
                    } else {
                        System.out.println("\n--- TODOS LOS CLIENTES ---");
                        for (int i = 0; i < contador; i++) {
                            System.out.println(clientes[i]);
                            System.out.println("--------------------------");
                        }
                    }
                    break;

                case 4: // Mostrar clientes por categoría
                    System.out.print("Ingrese la categoría a buscar: ");
                    char categoriaBuscada = scanner.nextLine().charAt(0);
                    boolean hayCoincidencias = false;
                    System.out.println("\n--- CLIENTES CON CATEGORÍA '" + categoriaBuscada + "' ---");
                    for (int i = 0; i < contador; i++) {
                        if (clientes[i].getCategoria() == categoriaBuscada) {
                            System.out.println(clientes[i]);
                            System.out.println("--------------------------");
                            hayCoincidencias = true;
                        }
                    }
                    if (!hayCoincidencias) {
                        System.out.println("No se encontraron clientes con esa categoría.");
                    }
                    break;

                case 5: // Salir
                    System.out.println("Fin del programa.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5); // Fin del bucle

        scanner.close();
    }
}
