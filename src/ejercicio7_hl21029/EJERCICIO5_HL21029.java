
package ejercicio5_hl21029;

import javax.swing.JOptionPane;

public class EJERCICIO5_HL21029 {

    public static void main(String[] args) {
        int filas,maximo,minimo;
       filas=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de numeros que quiere ingresar: "));
       int [] numero= new int [filas];
        for (int i=0;i<filas;i++) { 
        numero[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero "+(i+1)+" : "));
        
        }
        maximo=numero[0];
        minimo=numero[0];        
        
        for (int i=1;i<filas;i++){
            if (numero[i]>maximo){
                maximo=numero[i];
            }
            if (numero[i]<minimo){
                minimo=numero[i];
            }
            }
             System.out.println("El valor maximo es: " + maximo);
             System.out.println("El valor minimo es: " + minimo);
        
            
    }
    
}
