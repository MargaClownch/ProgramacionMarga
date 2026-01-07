package PracticaExamen;
import java.util.Scanner;

public class Examen1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Variable para guardar la opción. Ahora es un char (una letra)
        char opcion = ' ';

        do {
            menu();

            // 1. Leemos lo que escribe el usuario como un String (Texto)
            String entrada = sc.next();

            // 2. TRUCO DEL EXAMEN: Convertimos a minúsculas
            // Así, si escribe "A", se convierte en "a". Si escribe "a", se queda "a".
            entrada = entrada.toLowerCase();

            // 3. Sacamos la primera letra para usarla en el switch
            // (Es más seguro trabajar con char en los switch clásicos)
            opcion = entrada.charAt(0);

            switch (opcion) {
                case 'a': // Fíjate que ahora usamos comillas simples ' ' para char
                    calcularEdades();
                    break;
                case 'b':
                    calcularIngresosYoutube();
                    break;
                case 'c':
                    calcularHusoHorario();
                    break;
                case 'd':
                    System.out.println("¡Hasta luego! 👋");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta con a, b, c o d.");
            }
            // Repetimos mientras la opción NO sea 'd'
        } while (opcion != 'd');
    }

    public static void menu() {
        System.out.println("\n=== EXAMEN PROGRAMACIÓN ===");
        System.out.println("a) Mayores de edad (Arrays)");
        System.out.println("b) Ingresos YouTube");
        System.out.println("c) Cálculo Horario");
        System.out.println("d) Salir");
        System.out.print("Elige una opción (a, b, c, d): ");
    }

    // --- EJERCICIO A: EDADES ---
    public static void calcularEdades() {
        System.out.print("¿Cuántas personas vas a introducir? ");
        int n = sc.nextInt();

        int[] aniosNacimiento = new int[n];
        int mayores = 0;
        int menores = 0;
        int anioActual = 2025;

        for (int i = 0; i < n; i++) {
            System.out.print("Año de nacimiento de la persona " + (i + 1) + ": ");
            aniosNacimiento[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int edad = anioActual - aniosNacimiento[i];
            if (edad >= 18) {
                mayores++;
            } else {
                menores++;
            }
        }
        System.out.println("Resultados: " + mayores + " mayores y " + menores + " menores.");
    }

    // --- EJERCICIO B: YOUTUBE ---
    public static void calcularIngresosYoutube() {
        System.out.print("¿Cuántos vídeos vas a calcular? ");
        int numVideos = sc.nextInt();
        double totalGanado = 0;

        for (int i = 1; i <= numVideos; i++) {
            System.out.println("\n--- Vídeo " + i + " ---");
            System.out.print("Visitas: ");
            double visitas = sc.nextDouble();

            System.out.println("Temática: 1.ASMR | 2.Deportes | 3.Animales | 4.Tecnología | 5.Bebés");
            System.out.print("Elige opción: ");
            int tematica = sc.nextInt();

            double tarifa = 0;
            switch (tematica) {
                case 1: tarifa = 0.1; break;
                case 2: tarifa = 1.0; break;
                case 3: tarifa = 0.2; break;
                case 4:
                case 5: tarifa = 0.5; break;
                default: System.out.println("Temática no válida (0€)");
            }

            double gananciaVideo = (visitas / 1000) * tarifa;
            System.out.println("Este vídeo genera: " + gananciaVideo + "€");
            totalGanado += gananciaVideo;
        }
        System.out.println("\n💰 TOTAL GANADO: " + totalGanado + "€");
    }

    // --- EJERCICIO C: HORARIO ---
    public static void calcularHusoHorario() {
        System.out.print("Introduce la hora (0-23): ");
        int hora = sc.nextInt();
        System.out.print("Introduce los minutos (0-59): ");
        int min = sc.nextInt();

        if (hora < 0 || hora > 23 || min < 0 || min > 59) {
            System.out.println("❌ Hora no válida.");
            return;
        }

        System.out.println("Elige conversión: 1. Zona Este (+12h) | 2. Zona Oeste (-11h)");
        int zona = sc.nextInt();
        int nuevaHora = hora;

        if (zona == 1) {
            nuevaHora = (hora + 12) % 24;
        } else if (zona == 2) {
            nuevaHora = (hora - 11 + 24) % 24;
        } else {
            System.out.println("Opción no válida.");
            return;
        }
        System.out.printf("La nueva hora es: %02d:%02d\n", nuevaHora, min);
    }
}