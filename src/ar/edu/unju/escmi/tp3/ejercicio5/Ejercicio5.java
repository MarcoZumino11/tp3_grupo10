package ar.edu.unju.escmi.tp3.ejercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       sc.useLocale(Locale.US);


         Producto [] productos = new Producto[3];
         boolean salir = false;


         while (!salir) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. - Crear Productos");
            System.out.println("2. - Mostrar Productos");
            System.out.println("3. - Modificar precio de producto");
            System.out.println("4. - Mostrar productos con precio mayor a un valor");
            System.out.println("5. - Salir");
            System.out.print("Seleccione una opcion: ");
            String opcion = sc.nextLine(). trim();

            switch (opcion) {
                case "1": crearProducto(sc, productos); break;
                case "2": mostrarProductos(productos); break;
                case "3": modificarPrecio(sc, productos); break;
                case "4": mostrarPorPrecio(sc, productos); break;
                case "5": salir = true; System.out.println("Saliendo..."); break;
                default: System.out.println("Opción inválida.");

        }
    }

    sc.close();
   }

     private static void crearProducto(Scanner sc, Producto[] productos) {
        int idx = -1;
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] == null) { idx = i; break; }
        }
        if (idx == -1) {
            System.out.println("Ya hay 3 productos cargados.");
            return;
        }
        Producto p = new Producto();
        System.out.print("Ingrese código: ");
        p.setCodigo(sc.nextLine().trim());
        System.out.print("Ingrese descripción: ");
        p.setDescripcion(sc.nextLine().trim());
        p.setPrecio(leerDouble(sc, "Ingrese precio: "));


        productos[idx] = p;
        System.out.println("Producto creado: " + p);
    }

    private static void mostrarProductos(Producto[] productos) {
        boolean hay = false;
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null) {
                System.out.println((i+1) + " -> " + productos[i]);
                hay = true;
            }
        }
        if (!hay) System.out.println("No hay productos cargados.");
    }
    private static void modificarPrecio(Scanner sc, Producto[] productos) {
        System.out.print("Ingrese el código del producto a modificar: ");
        String codigo = sc.nextLine().trim();
        Producto p = buscarPorCodigo(productos, codigo);
        if (p == null) {
            System.out.println("Producto no encontrado.");
            return;
        }
        double nuevoPrecio = leerDouble(sc, "Ingrese el nuevo precio: ");
        p.setPrecio(nuevoPrecio);
        System.out.println("Precio actualizado: " + p); 
    }
         private static void mostrarPorPrecio(Scanner sc, Producto[] productos) {
        double referencia = leerDouble(sc, "Ingrese precio de referencia: ");
        boolean hay = false;
        for (Producto p : productos) {
            if (p != null && p.getPrecio() > referencia) {
                System.out.println(p);
                hay = true;
            }
        }
        if (!hay) System.out.println("Ningún producto supera ese precio.");
    }

    private static Producto buscarPorCodigo(Producto[] productos, String codigo) {
        for (Producto p : productos) {
            if (p != null && p.getCodigo().equalsIgnoreCase(codigo)) {
                return p;
            }
        }
        return null;
    }

    private static double leerDouble(Scanner sc, String msg) {
        while (true) {
            System.out.print(msg);
            String entrada = sc.nextLine().trim().replace(',', '.');
            try {
                return Double.parseDouble(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Número inválido. Intente de nuevo.");
            }
        }
    }
}

