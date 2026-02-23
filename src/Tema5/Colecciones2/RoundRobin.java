package Tema5.Colecciones2;

import java.util.ArrayList;

public class RoundRobin {
    public static void main(String[] args) {
        ArrayList<Proceso> colaProcesos = new ArrayList<>();
        int numeroProceso = 1;
        double tiempoTotal = 0.0;

        System.out.println("INICIANDO SIMULADOR ROUND-ROBIN");

        // Vamos a simular 30 segundos (150 vueltas de 0.2s)
        for (int tic = 0; tic <= 150; tic++) {

            // 1. Llegada de nuevos procesos (Cada 2 segundos)
            // Si el tic es múltiplo de 10 (10 * 0.2 = 2.0 segundos)
            if (tic % 10 == 0) {
                Proceso nuevo = new Proceso("p" + numeroProceso);
                colaProcesos.add(nuevo);
                System.out.println("\n LLEGA NUEVO PROCESO: " + nuevo.getId() + " (Necesita " + nuevo.getTiempoRestante() + "s)");
                numeroProceso++;
            }

            // El sout es así para que no enseñe números largos como 1.99999998
            System.out.print("[Tiempo " + String.format("%.1f", tiempoTotal) + "s] -> ");

            if (!colaProcesos.isEmpty()) {
                Proceso actual = colaProcesos.get(0);

                // Lo sacamos momentáneamente de la lista
                colaProcesos.remove(0);

                // Trabaja durante 0.2 segundos
                actual.restarTiempo(0.2);

                // evita numeros negativos
                double tiempoImprimir = Math.max(0, actual.getTiempoRestante());

                System.out.println("CPU procesando " + actual.getId() + " | Le quedan: " + String.format("%.1f", tiempoImprimir) + "s");

                // 3. Comprobamos si ha terminado
                if (actual.getTiempoRestante() <= 0.01) {
                    System.out.println(" PROCESO " + actual.getId() + " TERMINADO Y ELIMINADO.");
                } else {
                    // Si no ha terminado, se va al final de la cola
                    colaProcesos.add(actual);
                }
            } else {
                System.out.println("CPU inactiva, esperando procesos...");
            }

            // Avanzamos el reloj
            tiempoTotal = tiempoTotal + 0.2;

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("Error en la pausa");
            }
        }

        System.out.println("\n SIMULACIÓN COMPLETADA.");
    }
}