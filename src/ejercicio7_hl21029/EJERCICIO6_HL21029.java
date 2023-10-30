
package ejercicio7_hl21029;

public class EJERCICIO6_HL21029 {

    public static void main(String[] args) {
      
        String pokemonsA[] = {"Pikachu","Charizard","Bulbasaur","Squirtle","Jigglypuff","Eevee","Mewtwo","Snorlax","Gengar","Machamp"}; 
        String pokemonsB[] = {"Venusaur","Blastoise","Dragonite","Gyarados","Alakazam","Arcanine","Lapras","Golem","Gyarados","Rhydon"};
        
        String[] nombresPokemonC = new String[pokemonsA.length + pokemonsB.length];
        
        int indiceC = 0;
        
        for (int i = 0; i < pokemonsA.length; i++) {
            nombresPokemonC[indiceC] = pokemonsA[i];
            indiceC++;
            nombresPokemonC[indiceC] = pokemonsB[i];
            indiceC++;
        }
        
        for (int i = 0; i < nombresPokemonC.length; i++) {
            System.out.println("el " + (i + 1) + " de C: " + nombresPokemonC[i]);
        }
    }
}
    