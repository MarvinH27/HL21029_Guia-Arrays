
package ejercicio7_hl21029;

public class EJERCICIO22_HL21029 {

    public static void main(String[] args) {
   
        
 int filas = 8;
        int columnas = 6;
        int[][] matriz = new int[filas][columnas];

        // Rellenar la matriz con 1 en los bordes
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == 0 || i == filas - 1 || j == 0 || j == columnas - 1) {
                    matriz[i][j] = 1;
                }
            }
        }

        // Mostrar la matriz
        mostrarMatriz(matriz);
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