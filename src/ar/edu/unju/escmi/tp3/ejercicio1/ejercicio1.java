package ar.edu.unju.escmi.tp3.ejercicio1;
import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Persona persona1 = null;
        Persona persona2 = null;
        Persona persona3 = null;
        int opcion;

        do {
            System.out.println("\n--- MENÚ DE OPCIONES ---");
            System.out.println("1 – Crear persona con Constructor por defecto");
            System.out.println("2 – Crear persona con Constructor parametrizado");
            System.out.println("3 – Crear persona con Constructor (dni, nombre, fecha de nacimiento)");
            System.out.println("4 – Mostrar personas");
            System.out.println("5 – Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    persona1 = new Persona();
                    System.out.print("Ingrese DNI: ");
                    persona1.setDni(scanner.nextLine());
                    System.out.print("Ingrese nombre: ");
                    persona1.setNombre(scanner.nextLine());
                    System.out.print("Ingrese fecha de nacimiento (YYYY-MM-DD): ");
                    persona1.setFechaNacimiento(LocalDate.parse(scanner.nextLine()));
                    System.out.print("Ingrese domicilio: ");
                    persona1.setDomicilio(scanner.nextLine());
                    System.out.print("Ingrese provincia: ");
                    persona1.setProvincia(scanner.nextLine());
                    break;

                case 2:
                    System.out.print("Ingrese DNI: ");
                    String dni2 = scanner.nextLine();
                    System.out.print("Ingrese nombre: ");
                    String nombre2 = scanner.nextLine();
                    System.out.print("Ingrese fecha de nacimiento (YYYY-MM-DD): ");
                    LocalDate fecha2 = LocalDate.parse(scanner.nextLine());
                    System.out.print("Ingrese domicilio: ");
                    String domicilio2 = scanner.nextLine();
                    System.out.print("Ingrese provincia: ");
                    String provincia2 = scanner.nextLine();
                    persona2 = new Persona(dni2, nombre2, fecha2, domicilio2, provincia2);
                    break;

                case 3:
                    System.out.print("Ingrese DNI: ");
                    String dni3 = scanner.nextLine();
                    System.out.print("Ingrese nombre: ");
                    String nombre3 = scanner.nextLine();
                    System.out.print("Ingrese fecha de nacimiento (YYYY-MM-DD): ");
                    LocalDate fecha3 = LocalDate.parse(scanner.nextLine());
                    persona3 = new Persona(dni3, nombre3, fecha3);
                    break;

                case 4:
                    System.out.println("\n--- DATOS DE LAS PERSONAS ---");
                    if (persona1 != null) {
                        System.out.println("Persona creada con constructor por defecto:");
                        persona1.mostrarDatos();
                    }
                    if (persona2 != null) {
                        System.out.println("Persona creada con constructor parametrizado:");
                        persona2.mostrarDatos();
                    }
                    if (persona3 != null) {
                        System.out.println("Persona creada con constructor parcial:");
                        persona3.mostrarDatos();
                    }
                    if (persona1 == null && persona2 == null && persona3 == null) {
                        System.out.println("No hay personas registradas.");
                    }
                    break;

                case 5:
                    System.out.println("Fin del programa.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
