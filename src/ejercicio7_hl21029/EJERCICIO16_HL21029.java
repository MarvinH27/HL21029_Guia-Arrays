
package ejercicio7_hl21029;
public class EJERCICIO16_HL21029 {
    public static void main(String[] args) {
      String[] nombresPokemon = {"Pikachu", "Charizard", "Bulbasaur", "Squirtle"};
        int[] poderesPokemon = {100, 150, 80, 90};

        int indiceMayorPoder = encontrarIndiceMayorPoder(poderesPokemon);

        if (indiceMayorPoder != -1) {
            String nombreMayorPoder = nombresPokemon[indiceMayorPoder];
            int poderMayor = poderesPokemon[indiceMayorPoder];
            System.out.println("El Pokémon con el mayor poder es " + nombreMayorPoder + " con " + poderMayor + " de poder.");
        } else {
            System.out.println("No se encontró ningún Pokémon en la lista.");
        }
    }

    public static int encontrarIndiceMayorPoder(int[] poderes) {
        int mayorPoder = Integer.MIN_VALUE;
        int indiceMayorPoder = -1;

        for (int i = 0; i < poderes.length; i++) {
            if (poderes[i] > mayorPoder) {
                mayorPoder = poderes[i];
                indiceMayorPoder = i;
            }
        }

        return indiceMayorPoder;
    }
}

