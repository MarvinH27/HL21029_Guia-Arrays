
package ejercicio7_hl21029;

import java.util.Scanner;

public class EJERCICIO28_HL21029 {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int numEstudiantes = obtenerNumero("Ingrese la cantidad de estudiantes (entre 1 y 10): ", 1, 10);
        int numPeriodos = obtenerNumero("Ingrese la cantidad de períodos académicos (entre 3 y 5): ", 3, 5);

        Double[][] calificaciones = new Double[numEstudiantes][numPeriodos];

        boolean salir = false;

        while (!salir) {
            System.out.println("\nMenú de Opciones:");
            System.out.println("1. Ingresar calificaciones por período.");
            System.out.println("2. Ingresar calificaciones por estudiante.");
            System.out.println("3. Ver calificaciones.");
            System.out.println("4. Salir.");
            int opcion = obtenerNumero("Seleccione una opción: ", 1, 4);

            switch (opcion) {
                case 1:
                    ingresarCalificacionesPorPeriodo(calificaciones, numPeriodos);
                    break;
                case 2:
                    ingresarCalificacionesPorEstudiante(calificaciones, numEstudiantes, numPeriodos);
                    break;
                case 3:
                    verCalificaciones(calificaciones);
                    break;
                case 4:
                    salir = true;
                    break;
            }
        }
    }

    public static int obtenerNumero(String mensaje, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.print(mensaje);
            while (!scanner.hasNextInt()) {
                System.out.print("Entrada no válida. Introduce un número: ");
                scanner.next();
            }
            numero = scanner.nextInt();
        } while (numero < min || numero > max);
        return numero;
    }

    public static void ingresarCalificacionesPorPeriodo(Double[][] calificaciones, int numPeriodos) {
        int periodo = obtenerNumero("Ingrese el número de período (entre 1 y " + numPeriodos + "): ", 1, numPeriodos);
        for (int i = 0; i < calificaciones.length; i++) {
            double calificacion = obtenerNumero("Ingrese la calificación del estudiante " + (i + 1) + " para el período " + periodo + ": ", 0, 10);
            calificaciones[i][periodo - 1] = calificacion;
        }
        System.out.println("Calificaciones ingresadas con éxito.");
    }

    public static void ingresarCalificacionesPorEstudiante(Double[][] calificaciones, int numEstudiantes, int numPeriodos) {
        int estudiante = obtenerNumero("Ingrese el número de estudiante (entre 1 y " + numEstudiantes + "): ", 1, numEstudiantes);
        int periodo = obtenerNumero("Ingrese el número de período (entre 1 y " + numPeriodos + "): ", 1, numPeriodos);
        double calificacion = obtenerNumero("Ingrese la calificación del estudiante " + estudiante + " para el período " + periodo + ": ", 0, 10);
        calificaciones[estudiante - 1][periodo - 1] = calificacion;
        System.out.println("Calificación ingresada con éxito.");
    }

    public static void verCalificaciones(Double[][] calificaciones) {
        System.out.println("\nCalificaciones de Estudiantes por Período:");
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Estudiante " + (i + 1) + ": ");
            for (int j = 0; j < calificaciones[i].length; j++) {
                if (calificaciones[i][j] != null) {
                    System.out.print("Periodo " + (j + 1) + ": " + calificaciones[i][j] + "  ");
                } else {
                    System.out.print("Periodo " + (j + 1) + ": Sin calificación  ");
                }
            }
            System.out.println();
        }
    }
}
