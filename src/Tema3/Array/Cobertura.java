package Tema3.Array;

import java.util.Scanner;

public class Cobertura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] habitacion = new int[20];
        System.out.println("En qué habitación quieres probar?(1-20): ");
        int numHabitacion = sc.nextInt();
        System.out.println("Cuánta potencia tiene tu router?(1-6): ");
        int numPotencia = sc.nextInt();
        int indiceRouter = numHabitacion - 1;

        for (int i = 0; i < habitacion.length; i++) {
            int distancia = Math.abs(indiceRouter - i);
            int senal = numPotencia - distancia;
            if (senal < 0) {
                habitacion[i] = 0;
            } else {
                habitacion[i] = senal;
            }
        }
        System.out.println("\n--- COBERTURA WIFI ---");
        for (int i = 0; i < habitacion.length; i++) {
            System.out.print(habitacion[i] + " ");
        }
    }
}
