
package ejercicio7_hl21029;

import java.util.Scanner;

public class EJERCICIO19_HL21029 {
    
    public static void main(String[] args) {
        
        int[][] matriz = new int[4][4];
        Scanner scanner = new Scanner(System.in);

        // Cargar la matriz
        System.out.println("Ingrese los elementos de la matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento en la fila " + (i + 1) + " y columna " + (j + 1) + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Mostrar la matriz original
        System.out.println("Matriz original:");
        mostrarMatriz(matriz);

        // Verificar si la matriz es simétrica
        boolean esSimetrica = verificarSimetria(matriz);
        if (esSimetrica) {
            System.out.println("La matriz es simétrica.");
        } else {
            System.out.println("La matriz no es simétrica.");
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean verificarSimetria(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        if (filas != columnas) {
            return false; // Si no es cuadrada, no puede ser simétrica.
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false; // Si un elemento no coincide con su correspondiente en la traspuesta, no es simétrica.
                }
            }
        }

        return true; // La matriz es simétrica.
  
    }
    
}
