
package ejercicio7_hl21029;

import java.util.Scanner;

public class EJERCICIO17_HL21029 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        // Cargar la matriz
        System.out.println("Ingrese los elementos de la matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento en la fila " + (i + 1) + " y columna " + (j + 1) + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Mostrar la matriz original
        System.out.println("Matriz original:");
        mostrarMatriz(matriz);

        // Calcular y mostrar la matriz transpuesta
        int[][] matrizTranspuesta = calcularMatrizTranspuesta(matriz);
        System.out.println("Matriz transpuesta:");
        mostrarMatriz(matrizTranspuesta);
    }

    public static int[][] calcularMatrizTranspuesta(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] matrizTranspuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }

        return matrizTranspuesta;
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
    