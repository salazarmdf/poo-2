import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Local tienda = new Local();
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1 - Registrar productos nacionales");
            System.out.println("2 - Registrar productos importados");
            System.out.println("3 - Listar productos nacionales");
            System.out.println("4 - Listar productos importados");
            System.out.println("5 - Buscar producto nacional");
            System.out.println("6 - Buscar producto importado");
            System.out.println("0 - Salir");

            System.out.print("¿Que desea hacer?: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre del producto nacional: ");
                    String nombreNacional = scanner.nextLine();
                    System.out.print("Ingrese precio del producto nacional: ");
                    double precioNacional = scanner.nextDouble();
                    System.out.print("Ingrese registro DIAN del producto nacional: ");
                    String registroDIANNacional = scanner.next();

                    Nacional productoNacional = new Nacional(nombreNacional, precioNacional, registroDIANNacional);
                    tienda.registrarProductoNacional(productoNacional);
                    System.out.println("Producto nacional registrado correctamente.");
                    break;

                case 2:
                    System.out.print("Ingrese nombre del producto importado: ");
                    String nombreImportado = scanner.nextLine();
                    System.out.print("Ingrese precio del producto importado: ");
                    double precioImportado = scanner.nextDouble();
                    System.out.print("Ingrese licencia de importación del producto importado: ");
                    String licenciaImportacionImportado = scanner.next();

                    Importado productoImportado = new Importado(nombreImportado, precioImportado, licenciaImportacionImportado);
                    tienda.registrarProductoImportado(productoImportado);
                    System.out.println("Producto importado registrado correctamente.");
                    break;

                case 3:
                    System.out.println("Listado de productos nacionales:");
                    tienda.listarProductosNacionales();
                    break;

                case 4:
                    System.out.println("Listado de productos importados:");
                    tienda.listarProductosImportados();
                    break;

                case 5:
                    System.out.print("Ingrese nombre del producto nacional a buscar: ");
                    String nombreBuscarNacional = scanner.nextLine();
                    Nacional encontradoNacional = tienda.buscarProductoNacional(nombreBuscarNacional);

                    if (encontradoNacional != null) {
                        System.out.println("Producto encontrado: " + encontradoNacional);
                    } else {
                        System.out.println("Producto nacional no encontrado.");
                    }
                    break;

                case 6:
                    System.out.print("Ingrese nombre del producto importado a buscar: ");
                    String nombreBuscarImportado = scanner.nextLine();
                    Importado encontradoImportado = tienda.buscarProductoImportado(nombreBuscarImportado);

                    if (encontradoImportado != null) {
                        System.out.println("Producto encontrado: " + encontradoImportado);
                    } else {
                        System.out.println("Producto importado no encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
        } while (opcion != 0);
        scanner.close();
    }
}