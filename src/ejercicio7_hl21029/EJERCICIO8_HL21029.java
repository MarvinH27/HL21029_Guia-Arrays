
package ejercicio7_hl21029;
import java.util.Scanner;
public class EJERCICIO8_HL21029 {

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        // Leer 8 números por teclado
        System.out.println("Ingrese 8 números:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Mostrar el array antes de la inserción
        System.out.println("Array antes de la inserción:");
        for (int i = 0; i < 8; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Pedir el número y la posición para la inserción
        System.out.print("Ingrese el número a insertar: ");
        int numero = scanner.nextInt();
        System.out.print("Ingrese la posición de inserción (0-7): ");
        int posicion = scanner.nextInt();

        // Verificar si la posición es válida
        if (posicion < 0 || posicion > 7) {
            System.out.println("Posición no válida. Debe estar entre 0 y 7.");
        } else {
            // Desplazar los elementos detrás de la posición
            for (int i = 7; i > posicion; i--) {
                array[i] = array[i - 1];
            }

            // Insertar el número en la posición indicada
            array[posicion] = numero;

            // Mostrar el array después de la inserción
            System.out.println("Array después de la inserción:");
            for (int i = 0; i < 8; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}
