package ejercicio7_hl21029;

import java.util.Scanner;

public class EJERCICIO12_HL21029 {

    public static void main(String[] args) {

        String[] nombresPokemonB = {"Venusaur", "Blastoise", "Dragonite", "Gyarados", "Alakazam", "Arcanine", "Lapras", "Golem", "Gyarados", "Rhydon"};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de un Pokemon: ");
        String nombreABuscar = scanner.nextLine();

        int indiceEncontrado = -1;

        for (int i = 0; i < nombresPokemonB.length; i++) {
            if (nombreABuscar.equalsIgnoreCase(nombresPokemonB[i])) {
                indiceEncontrado = i;
                break;
            }
        }

        if (indiceEncontrado != -1) {
            System.out.println("El Pokemon '" + nombreABuscar + "' se encuentra en el indice " + indiceEncontrado + ".");
        } else {
            System.out.println("El Pokemon '" + nombreABuscar + "' no se encontro en la lista.");
        }
    }
}
