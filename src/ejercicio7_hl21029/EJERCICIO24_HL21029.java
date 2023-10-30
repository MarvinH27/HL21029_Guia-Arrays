
package ejercicio7_hl21029;

import java.util.Arrays;
import java.util.HashSet;


public class EJERCICIO24_HL21029 {

 
    public static void main(String[] args) {
int[] arrayOriginal = {1, 2, 2, 3, 4, 4, 5};

        int[] arraySinDuplicados = eliminarDuplicados(arrayOriginal);

        System.out.println("Array original: " + Arrays.toString(arrayOriginal));
        System.out.println("Array sin duplicados: " + Arrays.toString(arraySinDuplicados));
    }

    public static int[] eliminarDuplicados(int[] array) {
        HashSet<Integer> conjunto = new HashSet<>();

        for (int numero : array) {
            conjunto.add(numero);
        }

        int[] arraySinDuplicados = new int[conjunto.size()];
        int indice = 0;

        for (int numero : conjunto) {
            arraySinDuplicados[indice] = numero;
            indice++;
        }

        return arraySinDuplicados;
    }
}