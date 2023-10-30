package ejercicio7_hl21029;

import java.util.Scanner;

public class EJERCICIO26_HL21029 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de filas para el microbus (entre 6 y 10 filas): ");
        int filas = scanner.nextInt();

        if (filas < 6 || filas > 10) {
            System.out.println("Cantidad de filas no valida. Debe estar entre 6 y 10 filas.");
            return;
        }

        int[] asientosIzquierdos = new int[filas];
        int[] asientosDerechos = new int[filas];
        double totalVentas = 0.0;

        while (true) {
            System.out.println("\nMenu de Opciones:");
            System.out.println("1. Ver Distribucion");
            System.out.println("2. Vender Asientos");
            System.out.println("3. Devolver Asientos");
            System.out.println("4. Mostrar la Caja");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarDistribucion(asientosIzquierdos, asientosDerechos);
                    break;
                case 2:
                    venderAsientos(asientosIzquierdos, asientosDerechos, scanner, totalVentas);
                    break;
                case 3:
                    devolverAsientos(asientosIzquierdos, asientosDerechos, scanner, totalVentas);
                    break;
                case 4:
                    mostrarCaja(totalVentas);
                    break;
                case 5:
                    System.out.println("Gracias por utilizar el programa.");
                    return;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }
        }
    }

    public static void mostrarDistribucion(int[] izquierdos, int[] derechos) {
        System.out.println("Distribucion actual de asientos:");
        System.out.println("Lado Izquierdo: " + arrayToString(izquierdos));
        System.out.println("Lado Derecho: " + arrayToString(derechos));
    }

    public static String arrayToString(int[] array) {
        StringBuilder result = new StringBuilder();
        for (int asiento : array) {
            result.append(asiento == 0 ? "O" : "X").append(" ");
        }
        return result.toString();
    }

    public static void venderAsientos(int[] izquierdos, int[] derechos, Scanner scanner, double totalVentas) {
        mostrarDistribucion(izquierdos, derechos);

        System.out.print("Seleccione el lado (1: Izquierdo, 2: Derecho): ");
        int lado = scanner.nextInt();
        if (lado != 1 && lado != 2) {
            System.out.println("Lado no valido. Seleccione 1 o 2.");
            return;
        }

        int[] ladoSeleccionado = (lado == 1) ? izquierdos : derechos;

        System.out.print("Cantidad de asientos a vender (1 o 2): ");
        int cantidad = scanner.nextInt();
        if (cantidad != 1 && cantidad != 2) {
            System.out.println("Cantidad no valida. Seleccione 1 o 2.");
            return;
        }

        System.out.print("Ingrese el numero de asiento: ");
        int numeroAsiento = scanner.nextInt();

        if (numeroAsiento < 1 || numeroAsiento > ladoSeleccionado.length) {
            System.out.println("Numero de asiento no valido.");
            return;
        }

        if (ladoSeleccionado[numeroAsiento - 1] == 0) {
            for (int i = numeroAsiento - 1; i < numeroAsiento - 1 + cantidad; i++) {
                ladoSeleccionado[i] = 1;
            }
            double precioAsiento = cantidad * 10.0; // Precio por asiento
            totalVentas += precioAsiento;
            System.out.println("Asientos vendidos con exito. Precio: $" + precioAsiento);
        } else {
            System.out.println("Los asientos seleccionados ya estan ocupados.");
        }
    }

    public static void devolverAsientos(int[] izquierdos, int[] derechos, Scanner scanner, double totalVentas) {
        mostrarDistribucion(izquierdos, derechos);

        System.out.print("Seleccione el lado (1: Izquierdo, 2: Derecho): ");
        int lado = scanner.nextInt();
        if (lado != 1 && lado != 2) {
            System.out.println("Lado no valido. Seleccione 1 o 2.");
            return;
        }

        int[] ladoSeleccionado = (lado == 1) ? izquierdos : derechos;

        System.out.print("Numero de asiento a devolver: ");
        int numeroAsiento = scanner.nextInt();

        if (numeroAsiento < 1 || numeroAsiento > ladoSeleccionado.length) {
            System.out.println("Numero de asiento no valido.");
            return;
        }

        if (ladoSeleccionado[numeroAsiento - 1] == 1) {
            ladoSeleccionado[numeroAsiento - 1] = 0;
            double precioAsiento = 10.0; // Precio por asiento
            totalVentas -= precioAsiento;
            System.out.println("Asiento devuelto con exito. Reembolso: $" + precioAsiento);
        } else {
            System.out.println("El asiento seleccionado ya esta disponible.");
        }
    }

    public static void mostrarCaja(double totalVentas) {
        System.out.println("Total de ventas acumulado hasta el momento: $" + totalVentas);
    }
}
