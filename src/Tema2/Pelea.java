package Tema2;

import java.util.Scanner;
import java.util.Random;

public class Pelea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random randy = new Random();
        int total = 500;
        int vidaIA = 0;
        int defensaIA = 0;
        int ataqueIA = 0;
        int velocidadIA = 0;
        int vidaMax = 0;
        int ataque = 0;
        int velocidad = 0;
        int defensa = 0;

        do {
            vidaIA = 50 + randy.nextInt(151);
            defensaIA = 50 + randy.nextInt(151);
            ataqueIA = 50 + randy.nextInt(151);
            velocidadIA = total - (vidaIA + defensaIA + ataqueIA);
        } while (velocidadIA < 50 || velocidadIA > 200);

        while (vidaMax + ataque + velocidad + defensa != 500) {
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
            if (suma != 500) {
                System.out.println("ERROR: La suma debe ser 500. Tu suma: " + suma);
            }
            if (vidaMax < 1 || vidaMax > 200 || ataque < 1 || ataque > 200 ||
                    velocidad < 1 || velocidad > 200 || defensa < 1 || defensa > 200) {
                System.out.println("ERROR: Cada valor debe estar entre 1 y 200.");
            }
        }

        int vidaMaxOriginal = vidaMax;
        int vidaIAOriginal = vidaIA;
        System.out.println("Tu vida es: " + vidaMax + " La vida de tu rival es: " + vidaIA);
        System.out.println("Tu ataque es: " + ataque + " El ataque de tu rival es: " + ataqueIA);
        System.out.println("Tu velocidad es: " + velocidad + " La velocidad de tu rival es: " + velocidadIA);
        System.out.println("Tu defensa es: " + defensa + " La defensa de tu rival es: " + defensaIA);
        System.out.println("Tu total de atributos es: " + (vidaMax + ataque + velocidad + defensa) + " Los atributos de tu rival son: " + (vidaIA + ataqueIA + velocidadIA + defensaIA));
        System.out.println("¡COMIENZA EL COMBATE!");
        System.out.println("Presiona ENTER para continuar...");
        sc.nextLine();
        sc.nextLine();

        while (vidaMax > 0 && vidaIA > 0) {
            int danio = ataque - defensaIA;
            int danioIA = ataqueIA - defensa;

            System.out.println("\n" + "=".repeat(40));

            String barraJugador = "[";
            int bloquesLlenosJ = (int) Math.round((double) vidaMax / vidaMaxOriginal * 20);
            for (int i = 0; i < bloquesLlenosJ; i++) {
                barraJugador = barraJugador + "#";
            }
            for (int i = 0; i < 20 - bloquesLlenosJ; i++) {
                barraJugador = barraJugador + ".";
            }
            barraJugador = barraJugador + "]";
            System.out.println("Tú:      " + barraJugador + " " + vidaMax + "/" + vidaMaxOriginal);

            String barraRival = "[";
            int bloquesLlenosR = (int) Math.round((double) vidaIA / vidaIAOriginal * 20);
            for (int i = 0; i < bloquesLlenosR; i++) {
                barraRival = barraRival + "#";
            }
            for (int i = 0; i < 20 - bloquesLlenosR; i++) {
                barraRival = barraRival + ".";
            }
            barraRival = barraRival + "]";
            System.out.println("Rival:   " + barraRival + " " + vidaIA + "/" + vidaIAOriginal);

            System.out.println("=".repeat(40));

            if (velocidad > velocidadIA) {
                System.out.println("¡Tú atacas al rival!");
                if (danio <= 0) {
                    vidaIA = vidaIA - 5;
                    System.out.println("  Daño infligido mínimo: 5");
                } else {
                    vidaIA = vidaIA - danio;
                    System.out.println("  Daño infligido: " + danio);
                }
                if (vidaIA < 0) vidaIA = 0;

                if (vidaIA > 0) {
                    System.out.println("¡El rival te ataca!");
                    if (danioIA <= 0) {
                        vidaMax = vidaMax - 5;
                        System.out.println("  Daño infligido mínimo: 5");
                    } else {
                        vidaMax = vidaMax - danioIA;
                        System.out.println("  Daño infligido: " + danioIA);
                    }
                    if (vidaMax < 0) vidaMax = 0;
                }
            } else {
                System.out.println("¡El rival te ataca!");
                if (danioIA <= 0) {
                    vidaMax = vidaMax - 5;
                    System.out.println("  Daño infligido mínimo: 5");
                } else {
                    vidaMax = vidaMax - danioIA;
                    System.out.println("  Daño infligido: " + danioIA);
                }
                if (vidaMax < 0) vidaMax = 0;

                if (vidaMax > 0) {
                    System.out.println("¡Tú atacas al rival!");
                    if (danio <= 0) {
                        vidaIA = vidaIA - 5;
                        System.out.println("  Daño infligido mínimo: 5");
                    } else {
                        vidaIA = vidaIA - danio;
                        System.out.println("  Daño infligido: " + danio);
                    }
                    if (vidaIA < 0) vidaIA = 0;
                }
            }

            System.out.println("Presiona ENTER para continuar...");
            sc.nextLine();
        }

        System.out.println("\n" + "=".repeat(40));
        String barraFinalJ = "[";
        int llenosJ = (int) Math.round((double) vidaMax / vidaMaxOriginal * 20);
        for (int i = 0; i < llenosJ; i++) barraFinalJ += "#";
        for (int i = 0; i < 20 - llenosJ; i++) barraFinalJ += ".";
        barraFinalJ += "]";
        System.out.println("Tú:      " + barraFinalJ + " " + vidaMax + "/" + vidaMaxOriginal);

        String barraFinalR = "[";
        int llenosR = (int) Math.round((double) vidaIA / vidaIAOriginal * 20);
        for (int i = 0; i < llenosR; i++) barraFinalR += "#";
        for (int i = 0; i < 20 - llenosR; i++) barraFinalR += ".";
        barraFinalR += "]";
        System.out.println("Rival:   " + barraFinalR + " " + vidaIA + "/" + vidaIAOriginal);
        System.out.println("=".repeat(40));

        if (vidaMax > 0) {
            System.out.println("¡Has ganado la batalla!");
        } else {
            System.out.println("Has sido derrotado...");
        }
    }
}