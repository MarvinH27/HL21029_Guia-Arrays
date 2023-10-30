package ejercicio7_hl21029;

import javax.swing.JOptionPane;

public class EJERCICIO4_HL21029 {

    public static void main(String[] args) {
       
        /* String pokemons [] = new String [5];  //ESTE CODIGO ESTA PENSADO POR SI SE QUIERE INGRESAR LOS DATOS POR TECLADO.
        for(int i=0; i<5;i++){
       pokemons[i]=JOptionPane.showInputDialog("Ingrese el nombre del pokemon # "+(i+1)+" : "); 
       } */

        String pokemons[] = {"Charizard", "Gengar", "Arcanine", "Bulbasaur", "Blaziken"}; 
        for (int i = 0; i < 5; i++) {
            System.out.println(pokemons[4 - i]);

        }
    }
}
