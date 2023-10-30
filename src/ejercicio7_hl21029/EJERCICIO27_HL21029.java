package ejercicio7_hl21029;

import java.util.Scanner;

public class EJERCICIO27_HL21029 {

    public static void main(String[] args) {

        char[][] tablero = new char[3][3];
        char jugadorActual = 'X';
        boolean juegoTerminado = false;

        inicializarTablero(tablero);
        mostrarTablero(tablero);

        while (!juegoTerminado) {
            int fila, columna;

            do {
                System.out.println("Jugador " + jugadorActual + ", ingresa las coordenadas (fila y columna): ");
                fila = obtenerEntrada("Fila: ") - 1;
                columna = obtenerEntrada("Columna: ") - 1;
            } while (!movimientoValido(tablero, fila, columna));

            tablero[fila][columna] = jugadorActual;
            mostrarTablero(tablero);

            if (hayGanador(tablero, jugadorActual)) {
                System.out.println("¡Jugador " + jugadorActual + " ha ganado!");
                juegoTerminado = true;
            } else if (empate(tablero)) {
                System.out.println("¡Empate!");
                juegoTerminado = true;
            }

            jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
        }
    }

    public static void inicializarTablero(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    public static void mostrarTablero(char[][] tablero) {
        System.out.println("Tablero actual:");
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j]);
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("---------");
            }
        }
        System.out.println();
    }

    public static int obtenerEntrada(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.print("Entrada no válida. Introduce un número: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static boolean movimientoValido(char[][] tablero, int fila, int columna) {
        if (fila < 0 || fila >= 3 || columna < 0 || columna >= 3 || tablero[fila][columna] != ' ') {
            System.out.println("Movimiento no válido. Inténtalo de nuevo.");
            return false;
        }
        return true;
    }

    public static boolean hayGanador(char[][] tablero, char jugador) {
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) {
                return true; // Verificar filas
            }
            if (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador) {
                return true; // Verificar columnas
            }
        }
        if (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) {
            return true; // Verificar diagonal principal
        }
        if (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador) {
            return true; // Verificar diagonal secundaria
        }
        return false;
    }

    public static boolean empate(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false; // Todavía hay casillas vacías
                }
            }
        }
        return true; // No hay casillas vacías
    }
}
