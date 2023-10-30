package ejercicio7_hl21029;

public class EJERCICIO21_HL21029 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Array original:");
        mostrarArray(array);

        invertirArray(array);

        System.out.println("Array invertido:");
        mostrarArray(array);
    }

    public static void invertirArray(int[] arr) {
        int inicio = 0;
        int fin = arr.length - 1;

        while (inicio < fin) {
            int temp = arr[inicio];
            arr[inicio] = arr[fin];
            arr[fin] = temp;
            inicio++;
            fin--;
        }
    }

    public static void mostrarArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
