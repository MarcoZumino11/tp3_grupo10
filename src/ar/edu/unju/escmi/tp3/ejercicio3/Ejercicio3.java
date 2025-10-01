package ar.edu.unju.escmi.tp3.ejercicio3; 
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empleado empleado = null;
        int opcion;

        do {
            System.out.println("\n===== Menú de Opciones =====");
            System.out.println("1 - Crear empleado");
            System.out.println("2 - Aumentar salario");
            System.out.println("3 - Mostrar datos del empleado");
            System.out.println("4 - Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpieza de buffer

            switch (opcion) {
                case 1:
                    // Solicita datos y crea empleado
                    System.out.print("Ingrese nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese legajo: ");
                    int legajo = sc.nextInt();
                    System.out.print("Ingrese salario: ");
                    double salario = sc.nextDouble();
                    empleado = new Empleado(nombre, legajo, salario);
                    System.out.println("Empleado creado correctamente.");
                    break;

                case 2:
                    // Verifica legajo y aplica aumento
                    if (empleado != null) {
                        System.out.print("Ingrese el legajo del empleado: ");
                        int legajoBuscado = sc.nextInt();
                        if (legajoBuscado == empleado.getLegajo()) {
                            empleado.aumentarSalario();
                        } else {
                            System.out.println("El legajo no coincide.");
                        }
                    } else {
                        System.out.println("Primero debe crear un empleado.");
                    }
                    break;

                case 3:
                    // Muestra datos del empleado
                    if (empleado != null) {
                        empleado.mostrarDatos();
                    } else {
                        System.out.println("No hay empleado creado.");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }
        } while (opcion != 4);

        sc.close();
    }
}

