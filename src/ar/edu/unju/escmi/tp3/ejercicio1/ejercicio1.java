package ar.edu.unju.escmi.tp3.ejercicio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // USAR ARRAY (no ArrayList) como pidió la profe
        Persona[] personas = new Persona[3];

        for (int i = 0; i < personas.length; i++) {
            System.out.println("\n--- Carga persona " + (i + 1) + " ---");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine().trim();
            System.out.print("DNI: ");
            String dni = sc.nextLine().trim();

            LocalDate fn = null;
            while (true) {
                System.out.print("Fecha de nacimiento (dd/MM/yyyy): ");
                String s = sc.nextLine().trim();
                try {
                    fn = LocalDate.parse(s, fmt);
                    break;
                } catch (DateTimeParseException e) {
                    System.out.println("Formato inválido. Ej: 25/12/2000");
                }
            }

            personas[i] = new Persona(nombre, dni, fn);
        }

        System.out.println("\n--- Personas cargadas ---");
        for (Persona p : personas) {
            System.out.println(p);
        }

        sc.close();
    }
}