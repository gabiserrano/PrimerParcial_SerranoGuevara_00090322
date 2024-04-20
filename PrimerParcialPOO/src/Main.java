import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static ArrayList<ArticuloElectronico> inventario = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static  void main (String[]args ) {
        boolean salir = false;

        while (!salir){
            mostrarMenu();
            int opcion = leerOpcion();
            switch (opcion){
                case 1:
                    agregarArticulo();
                    break;
                case 2:
                    System.out.println("funcionalidad aun no implementada. ");
                    break;
                case 3:
                    System.out.println("funcionalidad aun no implementada.");
                    break;
                case 4:
                    salir=true;
                    System.out.println("saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida. Intentelo de nuevo.");
                    break;
            }
        }
    }
    private static void mostrarMenu(){
        System.out.println("\n ***Menu***");
        System.out.println ("1. Agregar articulo");
        System.out.println ("2. Modificar articulo");
        System.out.println ("3. Consultar articulo");
        System.out.println ("4. Salir");
        System.out.println ("5. Seleccione una opcion: ");
    }
    private static int leerOpcion(){
        int opcion = 0;
        boolean entradaValida = false;
        while (!entradaValida){
            try {
                opcion = scanner.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e){
                System.out.println("Entrada valida. Porfavor ingrese un numero.");
                scanner.next();
            }
        }
        return opcion;
    }
    private static void agregarArticulo(){
        System.out.println("\n*** Agregar articulo ***");
        System.out.println("Ingrese el nombre del articulo: ");
        String nombre = scanner.next();
        System.out.println("Ingrese el modelo del articulo: ");
        String modelo = scanner.next();
        System.out.println("Ingrese la descripcion del articulo: ");
        String descripcion = scanner.next();
        System.out.println("Ingrese el precio del articulo: ");
        double precio = scanner.nextDouble();



        inventario.add(new Articulo(nombre, modelo, descripcion, precio));
        System.out.println("Articulo agregado correctamente al invetario. ");
    }
}