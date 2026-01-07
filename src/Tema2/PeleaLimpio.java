package Tema2;

import java.util.Scanner;
import java.util.Random;

public class PeleaLimpio {
    static Scanner sc = new Scanner(System.in);
    static Random randy = new Random();

    public static void main(String[] args) {

        // 1. GENERAR ATRIBUTOS IA
        // Guardamos los datos en un array: [0]=Vida, [1]=Ataque, [2]=Velocidad, [3]=Defensa
        int[] statsIA = generarAtributosIA();
        int vidaIA = statsIA[0];
        int ataqueIA = statsIA[1];
        int velocidadIA = statsIA[2];
        int defensaIA = statsIA[3];

        // 2. PEDIR ATRIBUTOS JUGADOR
        int[] statsJugador = pedirAtributosJugador();
        int vidaMax = statsJugador[0];
        int ataque = statsJugador[1];
        int velocidad = statsJugador[2];
        int defensa = statsJugador[3];

        int vidaMaxOriginal = vidaMax;
        int vidaIAOriginal = vidaIA;

        mostrarResumen(vidaMax, ataque, velocidad, defensa, vidaIA, ataqueIA, velocidadIA, defensaIA);

        while (vidaMax > 0 && vidaIA > 0) {

            mostrarInterfazCombate(vidaMax, vidaMaxOriginal, vidaIA, vidaIAOriginal);

            if (velocidad > velocidadIA) {
                vidaIA = realizarAtaque("Tú", "Rival", ataque, defensaIA, vidaIA);

                if (vidaIA > 0) {
                    vidaMax = realizarAtaque("El rival", "Tú", ataqueIA, defensa, vidaMax);
                }
            } else {
                vidaMax = realizarAtaque("El rival", "Tú", ataqueIA, defensa, vidaMax);

                if (vidaMax > 0) {
                    vidaIA = realizarAtaque("Tú", "Rival", ataque, defensaIA, vidaIA);
                }
            }

            System.out.println("Presiona ENTER para continuar...");
            sc.nextLine();
        }
        // Mostramos las barras finales una última vez
        mostrarInterfazCombate(vidaMax, vidaMaxOriginal, vidaIA, vidaIAOriginal);

        if (vidaMax > 0) {
            System.out.println("¡Has ganado la batalla!");
        } else {
            System.out.println("Has sido derrotado...");
        }
    }

    public static int[] generarAtributosIA() {
        int vidaIA, defensaIA, ataqueIA, velocidadIA;
        int total = 500;
        do {
            vidaIA = 50 + randy.nextInt(151);
            defensaIA = 50 + randy.nextInt(151);
            ataqueIA = 50 + randy.nextInt(151);
            velocidadIA = total - (vidaIA + defensaIA + ataqueIA);
        } while (velocidadIA < 50 || velocidadIA > 200);

        return new int[]{vidaIA, ataqueIA, velocidadIA, defensaIA};
    }

    public static int[] pedirAtributosJugador() {
        int vidaMax = 0, ataque = 0, velocidad = 0, defensa = 0;

        boolean datosCorrectos = false;

        while (!datosCorrectos) {
            System.out.println("Tus atributos deben sumar 500.");
            System.out.println("Cada atributo debe estar entre 1 y 200.");

            System.out.print("Vida (1-200): ");
            vidaMax = sc.nextInt();
            System.out.print("Ataque (1-200): ");
            ataque = sc.nextInt();
            System.out.print("Velocidad (1-200): ");
            velocidad = sc.nextInt();
            System.out.print("Defensa (1-200): ");
            defensa = sc.nextInt();

            int suma = vidaMax + ataque + velocidad + defensa;

            // Validacion
            boolean rangoValido = (vidaMax >= 1 && vidaMax <= 200) &&
                    (ataque >= 1 && ataque <= 200) &&
                    (velocidad >= 1 && velocidad <= 200) &&
                    (defensa >= 1 && defensa <= 200);

            if (suma != 500) {
                System.out.println("ERROR: La suma debe ser 500. Tu suma: " + suma);
            } else if (!rangoValido) {
                System.out.println("ERROR: Cada valor debe estar entre 1 y 200.");
            } else {
                datosCorrectos = true; // Salimos del bucle
            }
        }
        sc.nextLine();
        return new int[]{vidaMax, ataque, velocidad, defensa};
    }

    public static void mostrarResumen(int v1, int a1, int vel1, int d1, int v2, int a2, int vel2, int d2) {
        System.out.println("Tu vida es: " + v1 + " La vida de tu rival es: " + v2);
        System.out.println("Tu ataque es: " + a1 + " El ataque de tu rival es: " + a2);
        System.out.println("Tu velocidad es: " + vel1 + " La velocidad de tu rival es: " + vel2);
        System.out.println("Tu defensa es: " + d1 + " La defensa de tu rival es: " + d2);
        System.out.println("Tu total: " + (v1+a1+vel1+d1) + " Total rival: " + (v2+a2+vel2+d2));
        System.out.println("¡COMIENZA EL COMBATE!");
        System.out.println("Presiona ENTER para continuar...");
        sc.nextLine();
    }

    public static void mostrarInterfazCombate(int vidaJ, int maxJ, int vidaIA, int maxIA) {
        System.out.println("\n" + "=".repeat(40));
        System.out.println("Tú:      " + crearBarraString(vidaJ, maxJ) + " " + vidaJ + "/" + maxJ);
        System.out.println("Rival:   " + crearBarraString(vidaIA, maxIA) + " " + vidaIA + "/" + maxIA);
        System.out.println("=".repeat(40));
    }

    public static String crearBarraString(int vidaActual, int vidaMaxima) {
        String barra = "[";
        if (vidaActual < 0) vidaActual = 0;

        int bloquesLlenos = (int) Math.round((double) vidaActual / vidaMaxima * 20);

        for (int i = 0; i < bloquesLlenos; i++) {
            barra += "#";
        }
        for (int i = 0; i < 20 - bloquesLlenos; i++) {
            barra += ".";
        }
        barra += "]";
        return barra;
    }

    public static int realizarAtaque(String nombreAtacante, String nombreDefensor, int ataque, int defensa, int vidaDefensor) {
        int danio = ataque - defensa;
        int danioFinal = 0;

        if (nombreAtacante.equals("Tú")) {
            System.out.println("¡" + nombreAtacante + " atacas al rival!");
        } else {
            System.out.println("¡" + nombreAtacante + " te ataca!");
        }

        if (danio <= 0) {
            danioFinal = 5;
            System.out.println("  Daño infligido mínimo: 5");
        } else {
            danioFinal = danio;
            System.out.println("  Daño infligido: " + danioFinal);
        }

        vidaDefensor = vidaDefensor - danioFinal;
        // Evitar vidas negativas
        if (vidaDefensor < 0) {
            vidaDefensor = 0;
        }
        return vidaDefensor;
    }
}