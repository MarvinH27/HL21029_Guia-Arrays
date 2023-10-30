package ejercicio7_hl21029;

import java.util.Scanner;

public class EJERCICIO15_HL21029 {

    public static void main(String[] args) {

       

        String[] nombresPokemonB = {"pikachu", "charizard", "bulbasaur", "squirtle", "jigglypuff"};
        int[] poderesPokemon = {100, 150, 80, 90, 120};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de un Pokémon: ");
        String nombrePokemon = scanner.nextLine();
        System.out.print("Ingrese la cantidad de poder para " + nombrePokemon + ": ");
        int cantidadPoder = scanner.nextInt();

        int indicePokemon = -1;

        for (int i = 0; i < nombresPokemonB.length; i++) {
            if (nombrePokemon.equalsIgnoreCase(nombresPokemonB[i])) {
                indicePokemon = i;
                break;
            }
        }

        if (indicePokemon != -1) {
            poderesPokemon[indicePokemon] = cantidadPoder;
            System.out.println("El poder de " + nombrePokemon + " ha sido actualizado a " + cantidadPoder);
        } else {
            System.out.println("El Pokémon '" + nombrePokemon + "' no se encontró en la lista.");
        }
    }
}
