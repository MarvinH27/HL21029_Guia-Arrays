package ejercicio3_hl21029;
import javax.swing.JOptionPane;
public class EJERCICIO3_HL21029 {
    public static void main(String[] args) {
      
        int [] numero= new int [10];
    
        for (int i=0;i<10;i++) { 
        numero[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero "+(i+1)+" : "));
       
        }
       for (int i = 0; i < 5; i++) {
            System.out.println(numero[i]);                // PRIMER NUMERO.
            System.out.println(numero[9 - i]);           // ULTIMO NUMERO.
        
       }    
    }
    
}
