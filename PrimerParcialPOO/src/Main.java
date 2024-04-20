import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static ArrayList<Articulo> inventario = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;

        while (!salir) {
            mostrarMenu();
            int opcion = leerOpcion();

            switch (opcion) {
                case 1:
                    agregarArticulo();
                    break;
                case 2:
                    // Implementar modificar artículo
                    System.out.println("Funcionalidad aún no implementada.");
                    break;
                case 3:
                    // Implementar consultar artículo
                    System.out.println("Funcionalidad aún no implementada.");
                    break;
                case 4:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    break;
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("\n*** Menú ***");
        System.out.println("1. Agregar artículo");
        System.out.println("2. Modificar artículo");
        System.out.println("3. Consultar artículo");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static int leerOpcion() {
        int opcion = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                opcion = scanner.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                scanner.next(); 
            }
        }

        return opcion;
    }

    private static void agregarArticulo() {
        System.out.println("\n*** Agregar artículo ***");
        System.out.print("Ingrese el nombre del artículo: ");
        String nombre = scanner.next();
        System.out.print("Ingrese el modelo del artículo: ");
        String modelo = scanner.next();
        System.out.print("Ingrese la descripción del artículo: ");
        scanner.nextLine(); 
        String descripcion = scanner.nextLine(); 
        System.out.print("Ingrese el precio del artículo: ");
        double precio = scanner.nextDouble();

       
        System.out.print("Ingrese la marca del artículo: ");
        String marca = scanner.next();
        System.out.print("Ingrese la memoria RAM del artículo (en GB para teléfonos móviles): ");
        int memoriaRAM = scanner.nextInt();

        
        inventario.add(new TelefonoMovil(nombre, modelo, descripcion, precio, marca, memoriaRAM));
        System.out.println("Teléfono móvil agregado correctamente al inventario.");
    }
}
