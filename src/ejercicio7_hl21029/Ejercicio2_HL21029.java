package ejercicio7_hl21029;

import javax.swing.JOptionPane;

public class Ejercicio2_HL21029 {

    
    public static void main(String[] args) {

        int sumaPositivos = 0, sumaNegativos = 0, sumaCeros = 0, cantidadPositivos, cantidadNegativos;
        double mediaPositivos, mediaNegativos;
        int[] numero = new int[5];
        for (int i = 0; i < 5; i++) {
            numero[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite numero # " + (i + 1) + " : "));
            if (numero[i] > 0) {
                sumaPositivos += numero[i];

            } else if (numero[i] < 0) {
                sumaNegativos += numero[i];

            } else {
                sumaCeros++;
            }
        }
        //Aqui contamos los que son positivos y negativos
        cantidadPositivos = 5 - sumaCeros;
        cantidadNegativos = 5 - sumaCeros;

        mediaPositivos = sumaPositivos / cantidadPositivos;
        mediaNegativos = sumaNegativos / cantidadNegativos;

        JOptionPane.showMessageDialog(null, "Media de positivos: " + mediaPositivos + "\n Media de negativos: " + mediaNegativos + "\n Cantidad de ceros: " + sumaCeros);

    }
}
