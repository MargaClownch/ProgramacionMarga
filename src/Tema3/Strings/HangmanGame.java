package Tema3.Strings;
import java.util.Scanner;
public class HangmanGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("JUGADOR 1: Introduce la palabra secreta: ");
        String secreto = sc.next().toUpperCase();

        for (int i = 0; i < 50; i++) {
            System.out.println();
        }

        char[] progreso = new char[secreto.length()];

        for (int i = 0; i < progreso.length; i++) {
            progreso[i] = '_';
        }

        int vidas = 6;
        boolean juegoTerminado = false;

        System.out.println("--- JUEGO DEL AHORCADO ---");
        System.out.println("Adivina la palabra de " + secreto.length() + " letras.");

        while (vidas > 0 && !juegoTerminado) {

            dibujarAhorcado(vidas);
            System.out.println("Palabra: " + String.valueOf(progreso));
            System.out.println("Vidas: " + vidas);

            System.out.print("Introduce una letra: ");
            char letra = sc.next().toUpperCase().charAt(0);

            boolean acierto = false;

            for (int i = 0; i < secreto.length(); i++) {
                if (secreto.charAt(i) == letra) {
                    progreso[i] = letra;
                    acierto = true;
                }
            }

            if (acierto) {
                System.out.println("¡Bien! La letra está.");
            } else {
                vidas--;
                System.out.println("¡Fallo! Esa letra no está.");
            }

            String palabraActual = String.valueOf(progreso);
            if (!palabraActual.contains("_")) {
                juegoTerminado = true;
                System.out.println("\n¡FELICIDADES! Has salvado al muñeco. La palabra era: " + secreto);
            }
        }

        if (vidas == 0) {
            dibujarAhorcado(0);
            System.out.println("\nGAME OVER. La palabra era: " + secreto);
        }
    }

    public static void dibujarAhorcado(int vidas) {
        switch (vidas) {
            case 6:
                System.out.println("   |   ");
                System.out.println("       ");
                break;
            case 5:
                System.out.println("   |   ");
                System.out.println("   O   ");
                break;
            case 4:
                System.out.println("   |   ");
                System.out.println("   O   ");
                System.out.println("   |   ");
                break;
            case 3:
                System.out.println("   |   ");
                System.out.println("   O   ");
                System.out.println("  /|   ");
                break;
            case 2:
                System.out.println("   |   ");
                System.out.println("   O   ");
                System.out.println("  /|\\  ");
                break;
            case 1:
                System.out.println("   |   ");
                System.out.println("   O   ");
                System.out.println("  /|\\  ");
                System.out.println("  /    ");
                break;
            case 0:
                System.out.println("   |   ");
                System.out.println("   O   ");
                System.out.println("  /|\\  ");
                System.out.println("  / \\  ");
                break;
        }
    }
}