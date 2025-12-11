package Tema3.Array;
import java.util.Scanner;
public class Buscaminas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamano = 20;
        int numeroMinas = 6;
        int[] ubicacionMinas = new int[tamano];
        String[] tableroVisual = new String[tamano];

        for(int i=0; i<tamano; i++) {
            tableroVisual[i] = "?";
        }

        int minasColocadas = 0;
        while (minasColocadas < numeroMinas) {
            int pos = (int)(Math.random() * tamano);

            if (ubicacionMinas[pos] == 0) {
                ubicacionMinas[pos] = 1;
                minasColocadas++;
            }
        }
        String[] solucion = new String[tamano];

        for (int i = 0; i < tamano; i++) {

            if (ubicacionMinas[i] == 1) {
                solucion[i] = "*";
            }
            else {
                int contadorMinas = 0;

                if (i > 0 && ubicacionMinas[i - 1] == 1) {
                    contadorMinas++;
                }

                if (i < tamano - 1 && ubicacionMinas[i + 1] == 1) {
                    contadorMinas++;
                }
                solucion[i] = String.valueOf(contadorMinas);
            }
        }
        boolean explotado = false;
        int casillasDescubiertas = 0;
        int objetivo = tamano - numeroMinas;

        System.out.println("---  BUSCAMINAS  ---");

        while (!explotado && casillasDescubiertas < objetivo) {

            for(int i=0; i<tamano; i++) {
                System.out.print(tableroVisual[i] + " ");
            }
            System.out.println();

            System.out.println("Elige una casilla para destapar (1-20): ");
            int eleccion = sc.nextInt() - 1;

            if (eleccion < 0 || eleccion >= tamano || !tableroVisual[eleccion].equals("?")) {
                System.out.println("Posición no válida o ya destapada.");
                continue;
            }

            if (solucion[eleccion].equals("*")) {
                System.out.println("Has pisado una mina.");
                explotado = true;
                tableroVisual[eleccion] = "*";
            } else {
                System.out.println("¡Salvado!");
                tableroVisual[eleccion] = solucion[eleccion];
                casillasDescubiertas++;
            }
        }
        if (explotado) {
            System.out.println("GAME OVER. Así era el tablero:");
        } else {
            System.out.println("Has esquivado todas las minas.");
        }
        for(int i=0; i<tamano; i++) {
            System.out.print(solucion[i] + " ");
        }
    }
}