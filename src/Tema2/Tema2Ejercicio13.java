package Tema2;

import java.util.Scanner;
public class Tema2Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce las horas (0-23): ");
        int horas = sc.nextInt();

        System.out.print("Introduce los minutos (0-59): ");
        int minutos = sc.nextInt();

        System.out.print("Introduce los segundos (0-59): ");
        int segundos = sc.nextInt();

        if (horas < 0 || horas > 23 || minutos < 0 || minutos > 59 || segundos < 0 || segundos > 59) {
            System.out.println("Hora inválida.");

        }else segundos++;

        if (segundos == 60) {
            segundos = 0;
            minutos++;

            if (minutos == 60) {
                minutos = 0;
                horas++;

                if (horas == 24) {
                    horas = 0;
                }
            }
        }
        System.out.printf("%02d:%02d:%02d%n",horas,minutos,segundos);
    }
}
