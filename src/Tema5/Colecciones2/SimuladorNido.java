package Tema5.Colecciones2;
import java.util.ArrayList;
import java.util.Random;

public class SimuladorNido {
    public static void main(String[] args) {
        ArrayList<SerpienteAnillas> nido = new ArrayList<>();
        Random rand = new Random();

        System.out.println("COMIENZA LA SIMULACIÓN DEL NIDO");

        // Bucle de 5 minutos (300 segundos/años)
        for (int segundo = 1; segundo <= 300; segundo++) {
            System.out.println("\n--- SEGUNDO " + segundo + " ---");

            // 1. Envejecer a todas las serpientes 1 año
            // Le pasamos 'true' porque en el nido no sufren ataques individuales
            for (SerpienteAnillas serpienteAnillas : nido) {
                serpienteAnillas.vivirUnAnio(true);
            }

            // 2. Limpiar serpientes que hayan muerto de viejas (se quedaron sin anillas)
            // IMPORTANTE: Recorremos el bucle al revés para borrar sin fallos [IDEA DE GEMINI]
            for (int i = nido.size() - 1; i >= 0; i--) {
                if (!nido.get(i).isViva()) {
                    System.out.println("Una serpiente ha muerto de vieja.");
                    nido.remove(i);
                }
            }

            // 3. Nacimientos: Cada 5 segundos nacen entre 1 y 3 serpientes
            if (segundo % 5 == 0) {
                int nacimientos = rand.nextInt(3) + 1;
                int nacidasRealmente = 0;

                for (int i = 0; i < nacimientos; i++) {
                    if (nido.size() < 20) {
                        nido.add(new SerpienteAnillas());
                        nacidasRealmente++;
                    }
                }
                if (nacidasRealmente > 0) {
                    System.out.println("Han nacido " + nacidasRealmente + " serpientes.");
                }
            }

            // 4. Mangosta: Cada 10 segundos aparece
            if (segundo % 10 == 0) {
                if (rand.nextInt(100) < 20) {
                    int devoradas = rand.nextInt(5);
                    int bajas = 0;

                    for (int i = 0; i < devoradas; i++) {
                        if (!nido.isEmpty()) {
                            // Borramos a la primera que pille
                            nido.remove(0);
                            bajas++;
                        }
                    }
                    System.out.println("La mangosta se comio a " + bajas + " serpientes.");
                } else {
                    System.out.println("La mangosta pasó de largo este turno.");
                }
            }

            // 5. Mostrar estado del nido
            System.out.println("Población del nido: " + nido.size() + "/20");
            for (int i = 0; i < nido.size(); i++) {
                System.out.println("  -> " + nido.get(i).toString());
            }

            // 6. Pausa de 1 segundo real
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error en el simulador de tiempo.");
            }
        }

        System.out.println("FIN DE LA SIMULACIÓN");
    }
}