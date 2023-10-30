
package ejercicio7_hl21029;

import java.util.Scanner;

public class EJERCICIO20_HL21029 {

    public static void main(String[] args) {
    int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int[][] suma = new int[3][3];

        Scanner scanner = new Scanner(System.in);

        // Cargar la primera matriz
        System.out.println("Ingrese los elementos de la primera matriz 3x3:");
        cargarMatriz(matriz1, scanner);

        // Cargar la segunda matriz
        System.out.println("Ingrese los elementos de la segunda matriz 3x3:");
        cargarMatriz(matriz2, scanner);

        // Sumar las dos matrices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        // Mostrar la suma de las matrices
        System.out.println("La suma de las dos matrices es:");
        mostrarMatriz(suma);
    }

    public static void cargarMatriz(int[][] matriz, Scanner scanner) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento en la fila " + (i + 1) + " y columna " + (j + 1) + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}