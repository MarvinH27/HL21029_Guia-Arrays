package ejercicio7_hl21029;
import javax.swing.JOptionPane;
public class Ejercicio1_HL21029 {

    public static void main(String[] args) {

int[]numero = new int[5];
    
for(int i=0; i<5; i++){
    numero[i]=Integer.parseInt(JOptionPane.showInputDialog("Numero # "+ (i+1)));
 
}
for(int i=0;i<5;i++){
    JOptionPane.showMessageDialog(null, "numero # "+(i+1)+" ingresado : "+ numero[i]);
    System.out.println("numero # "+(i+1)+" ingresado : "+ numero[i]);
    
}    
    }
}