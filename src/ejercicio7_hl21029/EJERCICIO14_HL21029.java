package ejercicio7_hl21029;

public class EJERCICIO14_HL21029 {

    public static void main(String[] args) {

        int[] numerosDesordenados = {64, 25, 12, 22, 11, 1, 77, 36, 98, 45};

        bubbleSortAscendente(numerosDesordenados);
        imprimirArray("Orden Ascendente:", numerosDesordenados);

        selectionSortDescendente(numerosDesordenados);
        imprimirArray("Orden Descendente:", numerosDesordenados);
    }

    public static void bubbleSortAscendente(int[] arr) {
        int n = arr.length;
        boolean intercambiado;
        do {
            intercambiado = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    intercambiado = true;
                }
            }
        } while (intercambiado);
    }

    public static void selectionSortDescendente(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                int temp = arr[i];
                arr[i] = arr[maxIndex];
                arr[maxIndex] = temp;
            }
        }
    }

    public static void imprimirArray(String mensaje, int[] arr) {
        System.out.println(mensaje);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
