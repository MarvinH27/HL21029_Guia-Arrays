
package ejercicio7_hl21029;
import java.util.Scanner;
public class EJERCICIO7_HL21029 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        boolean esCreciente = true;
        boolean esDecreciente = true;

        for (int i = 0; i < 9; i++) {
            if (numeros[i] < numeros[i + 1]) {
                esDecreciente = false;
            } else if (numeros[i] > numeros[i + 1]) {
                esCreciente = false;
            }
        }

        if (esCreciente && esDecreciente) {
            System.out.println("La serie esta desordenada.");
        } else if (esCreciente) {
            System.out.println("La serie esta ordenada de forma creciente.");
        } else if (esDecreciente) {
            System.out.println("La serie esta ordenada de forma decreciente.");
        } else {
            System.out.println("Todos los números son idénticos.");
        }
    }
}

    
    

