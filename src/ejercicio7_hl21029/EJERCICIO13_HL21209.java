package ejercicio7_hl21029;

import java.util.Scanner;

public class EJERCICIO13_HL21209 {

    public static void main(String[] args) {

        String[] nombresPokemonB = {"Venusaur", "Blastoise", "Dragonite", "Gyarados", "Alakazam", "Arcanine", "Lapras", "Golem", "Gyarados", "Rhydon"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero entero (indice): ");
        int indice = scanner.nextInt();

        if (indice >= 0 && indice < nombresPokemonB.length) {
            String nombrePokemon = nombresPokemonB[indice];
            System.out.println("El Pokemon en el indice " + indice + " es: " + nombrePokemon);
        } else {
            System.out.println("El indice esta fuera del rango del array.");
        }
    }
}
