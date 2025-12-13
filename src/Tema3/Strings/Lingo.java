package Tema3.Strings;
import java.util.Scanner;
public class Lingo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String secreto = "PERRO";
        int intentos = 5;
        boolean ganado = false;

        System.out.println("--- JUEGO LINGO ---");
        System.out.println("Adivina la palabra de 5 letras. Tienes 5 intentos.");
        System.out.println("Pistas: (*) Correcto, (-) Existe pero mal colocada, (_) No existe");

        for (int k = 1; k <= intentos; k++) {

            System.out.print("\nIntento " + k + ": ");
            String intento = sc.next().toUpperCase();

            if (intento.length() != 5) {
                System.out.println("⚠️ La palabra debe tener 5 letras.");
                k--;
                continue;
            }

            if (intento.equals(secreto)) {
                System.out.println("¡CORRECTO! 🎉 Has adivinado la palabra: " + secreto);
                ganado = true;
                break;
            }

            String pista = "";

            for (int i = 0; i < 5; i++) {
                char letraIntento = intento.charAt(i);
                char letraSecreto = secreto.charAt(i);

                if (letraIntento == letraSecreto) {
                    pista += "*";
                } else if (secreto.indexOf(letraIntento) != -1) {
                    pista += "-";
                } else {
                    pista += "_";
                }
            }
            System.out.println("Hint:      " + pista);
        }
        if (!ganado) {
            System.out.println("\nLo siento, te has quedado sin intentos. La palabra era: " + secreto);
        }
    }
}