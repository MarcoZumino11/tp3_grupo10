package ar.edu.unju.escmi.tp3.ejercicio1;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Persona> personas = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1- Crear objeto con Constructor por defecto");
            System.out.println("2- Crear objeto con Constructor parametrizado");
            System.out.println("3- Crear objeto con Constructor (dni, nombre, fecha de nacimiento)");
            System.out.println("4- Mostrar personas");
            System.out.println("5- Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    Persona p1 = new Persona();
                    System.out.print("Ingrese DNI: ");
                    p1.setDni(scanner.nextInt());
                    scanner.nextLine();
                    System.out.print("Ingrese nombre: ");
                    p1.setNombre(scanner.nextLine());
                    System.out.print("Ingrese fecha de nacimiento (YYYY-MM-DD): ");
                    p1.setFecNac(LocalDate.parse(scanner.nextLine()));
                    System.out.print("Ingrese domicilio: ");
                    p1.setDomicilio(scanner.nextLine());
                    System.out.print("Ingrese provincia: ");
                    p1.setProvincia(scanner.nextLine());
                    personas.add(p1);
                    break;

                case 2:
                    System.out.print("Ingrese DNI: ");
                    int dni = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese fecha de nacimiento (YYYY-MM-DD): ");
                    LocalDate fechaNac = LocalDate.parse(scanner.nextLine());
                    System.out.print("Ingrese domicilio: ");
                    String domicilio = scanner.nextLine();
                    System.out.print("Ingrese provincia: ");
                    String provincia = scanner.nextLine();
                    Persona p2 = new Persona(dni, nombre, fechaNac, domicilio, provincia);
                    personas.add(p2);
                    break;

                case 3:
                    System.out.print("Ingrese DNI: ");
                    int dni3 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese nombre: ");
                    String nombre3 = scanner.nextLine();
                    System.out.print("Ingrese fecha de nacimiento (YYYY-MM-DD): ");
                    LocalDate fecha3 = LocalDate.parse(scanner.nextLine());
                    Persona p3 = new Persona(dni3, nombre3, fecha3);
                    personas.add(p3);
                    break;

                case 4:
                    if (personas.isEmpty()) {
                        System.out.println("No hay personas registradas.");
                    } else {
                        for (Persona p : personas) {
                            p.mostrarMensaje();
                        }
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
