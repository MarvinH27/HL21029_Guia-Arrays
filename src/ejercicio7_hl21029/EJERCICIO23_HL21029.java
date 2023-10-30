package ejercicio7_hl21029;

import java.util.Scanner;

public class EJERCICIO23_HL21029 {

    public static void main(String[] args) {
       
        String[][] estadisticasPokemon = {
            {"Pikachu", "90", "55", "40", "35"},
            {"Charizard", "100", "84", "78", "78"},
            {"Bulbasaur", "45", "49", "49", "45"},
            {"Squirtle", "43", "48", "65", "44"},
            {"Mewtwo", "130", "110", "90", "106"},
            {"Gengar", "110", "65", "60", "60"},
            {"Dragonite", "80", "134", "95", "91"},
            {"Snorlax", "30", "110", "65", "160"},
            {"Vaporeon", "65", "60", "95", "130"},
            {"Machamp", "55", "130", "80", "90"},
            {"Eevee", "55", "55", "50", "55"},
            {"Alakazam", "120", "50", "45", "55"},
            {"Lapras", "60", "85", "80", "130"},
            {"Gyarados", "81", "125", "79", "95"},
            {"Jigglypuff", "20", "45", "20", "115"}};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de un Pokémon: ");
        String nombrePokemon = scanner.nextLine();

        boolean encontrado = false;

        for (String[] stats : estadisticasPokemon) {
            if (nombrePokemon.equalsIgnoreCase(stats[0])) {
                System.out.println("Estadísticas de " + stats[0] + ":");
                System.out.println("Salud (HP): " + stats[1]);
                System.out.println("Ataque: " + stats[2]);
                System.out.println("Defensa: " + stats[3]);
                System.out.println("Velocidad: " + stats[4]);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron estadísticas para el Pokémon " + nombrePokemon);
        }
    }
}