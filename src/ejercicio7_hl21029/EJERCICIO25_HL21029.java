
package ejercicio7_hl21029;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EJERCICIO25_HL21029 {
    public static void main(String[] args) {
        
String contraseña = "Ax5@abcdefg";
        boolean cumpleRequisitos = verificarContraseña(contraseña);

        if (cumpleRequisitos) {
            System.out.println("La contraseña cumple con los requisitos.");
        } else {
            System.out.println("La contraseña no cumple con los requisitos.");
        }
    }

    public static boolean verificarContraseña(String contraseña) {
        String expresionRegular = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
        Pattern pattern = Pattern.compile(expresionRegular);
        Matcher matcher = pattern.matcher(contraseña);
        return matcher.matches();
    }
}
