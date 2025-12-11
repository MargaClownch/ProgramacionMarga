package Tema3.Array;
import java.util.Scanner;
public class JuegoParejas {
    public static void imprimirTablero(String[] t) {
        for (int i = 0; i < t.length; i++) {
            System.out.print("[" + i + "]" + t[i] + "  ");
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }
    }
    public static void limpiarPantalla() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
    public static void esperarUnPoco() {
        long tiempoInicio = System.currentTimeMillis();
        while(System.currentTimeMillis() < tiempoInicio + 2000) {
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] animales = {
                "León", "Mandril", "Suricata", "Pumba", "Timón",
                "Simba", "Nala", "Mufasa", "Scar", "Zazú"
        };
        String[] solucion = new String[20];
        int contador = 0;
        for (int i = 0; i < 10; i++) {
            solucion[contador] = animales[i];
            contador++;
            solucion[contador] = animales[i];
            contador++;
        }
        for (int i = 0; i < solucion.length; i++) {
            int posAleatoria = (int) (Math.random() * 20);

            String temporal = solucion[i];
            solucion[i] = solucion[posAleatoria];
            solucion[posAleatoria] = temporal;
        }
        String[] tablero = new String[20];
        for (int i = 0; i < tablero.length; i++) {
            tablero[i] = "?";
        }
        int parejasEncontradas = 0;
        while (parejasEncontradas < 10) {
            System.out.println("\n---  BUSCA LAS PAREJAS  ---");
            imprimirTablero(tablero);
            System.out.println("\nElige dos cartas (introduce números del 0 al 19):");
            System.out.print("Carta 1: ");
            int carta1 = sc.nextInt();
            System.out.print("Carta 2: ");
            int carta2 = sc.nextInt();
            if (carta1 == carta2 || carta1 < 0 || carta1 > 19 || carta2 < 0 || carta2 > 19 || !tablero[carta1].equals("?")) {
                System.out.println("¡Movimiento no válido! Elige posiciones distintas, dentro del rango y que no estén ya resueltas.");
              continue;
            }
            System.out.println("Has levantado: " + solucion[carta1] + " y " + solucion[carta2]);
            if (solucion[carta1].equals(solucion[carta2])) {
                System.out.println("Has encontrado una pareja.");
                tablero[carta1] = solucion[carta1];
                tablero[carta2] = solucion[carta2];
                parejasEncontradas++;
            } else {
                System.out.println("Fallaste... memoriza las posiciones.");
            }
        }
        System.out.println("\n¡FELICIDADES! ¡Has encontrado todos los animales! ");
        imprimirTablero(tablero);
    }
}