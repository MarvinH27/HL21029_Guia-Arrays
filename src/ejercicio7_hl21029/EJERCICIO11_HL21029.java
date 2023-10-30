package ejercicio7_hl21029;

import java.util.Scanner;

public class EJERCICIO11_HL21029 {

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        // Leer 10 elementos numéricos
        System.out.println("Ingrese 10 elementos numéricos:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Leer la posición del elemento a eliminar
        System.out.print("Ingrese la posición del elemento a eliminar (entre 0 y 9): ");
        int posicion = scanner.nextInt();

        // Verificar si la posición es válida
        if (posicion < 0 || posicion >= 10) {
            System.out.println("Posición no válida. Debe estar entre 0 y 9.");
        } else {
            // Crear un nuevo array temporal con un elemento menos
            int[] nuevoArray = new int[9];

            // Copiar los elementos del array original al nuevo array, excepto el elemento a eliminar
            for (int i = 0, j = 0; i < 10; i++) {
                if (i != posicion) {
                    nuevoArray[j] = array[i];
                    j++;
                }
            }

            // Asignar el nuevo array a la variable array para reemplazar el original
            array = nuevoArray;

            // Mostrar el array después de eliminar el elemento
            System.out.println("Array después de eliminar el elemento en la posición " + posicion + ":");
            for (int i = 0; i < 9; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}