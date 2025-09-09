package ar.edu.unju.escmi.tp3.ejercicio4;

import java.util.Scanner;

public class ejercicio4 {
    // Clase Cliente
    static class Cliente {
        private int dni;
        private String nombre;
        private char categoria;

        public Cliente(int dni, String nombre, char categoria) {
            this.dni = dni;
            this.nombre = nombre;
            this.categoria = categoria;
        }

        public int getDni() {
            return dni;
        }

        public char getCategoria() {
            return categoria;
        }

        @Override
        public String toString() {
            return "DNI: " + dni + ", Nombre: " + nombre + ", Categoría: " + categoria;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente[] clientes = new Cliente[4];
        int cantidadClientes = 0;
        int opcion;

        do {
            System.out.println("\n------ Menú de Opciones ------");
            System.out.println("1 - Crear cliente");
            System.out.println("2 - Mostrar los datos de un cliente");
            System.out.println("3 - Mostrar todos los clientes");
            System.out.println("4 - Mostrar clientes por categoría");
            System.out.println("5 - Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    if (cantidadClientes >= 4) {
                        System.out.println("Capacidad máxima de clientes alcanzada.");
                    } else {
                        System.out.print("Ingrese el DNI del cliente: ");
                        int dni = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Ingrese el nombre del cliente: ");
                        String nombre = scanner.nextLine();

                        System.out.print("Ingrese la categoría del cliente (una letra): ");
                        char categoria = scanner.next().charAt(0);

                        clientes[cantidadClientes] = new Cliente(dni, nombre, categoria);
                        cantidadClientes++;
                        System.out.println("Cliente creado con éxito.");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese el DNI a buscar: ");
                    int dniBuscado = scanner.nextInt();
                    boolean encontrado = false;

                    for (int i = 0; i < cantidadClientes; i++) {
                        if (clientes[i].getDni() == dniBuscado) {
                            System.out.println("Cliente encontrado:");
                            System.out.println(clientes[i]);
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("No se encontró el DNI.");
                    }
                    break;

                case 3:
                    if (cantidadClientes == 0) {
                        System.out.println("No hay clientes registrados.");
                    } else {
                        System.out.println("Lista de todos los clientes:");
                        for (int i = 0; i < cantidadClientes; i++) {
                            System.out.println(clientes[i]);
                        }
                    }
                    break;

                case 4:
                    System.out.print("Ingrese la categoría a buscar: ");
                    char categoriaBuscada = scanner.next().charAt(0);
                    boolean hayCoincidencias = false;

                    for (int i = 0; i < cantidadClientes; i++) {
                        if (clientes[i].getCategoria() == categoriaBuscada) {
                            System.out.println(clientes[i]);
                            hayCoincidencias = true;
                        }
                    }

                    if (!hayCoincidencias) {
                        System.out.println("No se encontraron clientes con esa categoría.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}
