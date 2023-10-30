
package ejercicio7_hl21029;
import java.util.Scanner;
public class EJERCICIO10_HL21029 {

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        // Leer 5 elementos ordenados
        System.out.println("Ingrese 5 elementos numéricos ordenados de forma creciente:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Leer el número N a insertar
        System.out.print("Ingrese el número N a insertar: ");
        int numeroN = scanner.nextInt();

        // Encontrar la posición adecuada para insertar N
        int posicion = 0;
        while (posicion < 5 && array[posicion] < numeroN) {
            posicion++;
        }

        // Desplazar los elementos para hacer espacio para N
        for (int i = 5; i > posicion; i--) {
            array[i] = array[i - 1];
        }

        // Insertar N en la posición adecuada
        array[posicion] = numeroN;

        // Mostrar el array después de la inserción
        System.out.println("Array después de la inserción:");
        for (int i = 0; i < 6; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
    