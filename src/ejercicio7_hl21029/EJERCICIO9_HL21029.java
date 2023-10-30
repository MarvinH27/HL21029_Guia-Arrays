package ejercicio7_hl21029;
import java.util.Scanner;
public class EJERCICIO9_HL21029 {

    public static void main(String[] args) {
     
 
   Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        // Leer 10 números por teclado
        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Realizar el desplazamiento
        int ultimoElemento = array[9];
        for (int i = 9; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = ultimoElemento;

        // Mostrar el array después del desplazamiento
        System.out.println("Array después del desplazamiento:");
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}