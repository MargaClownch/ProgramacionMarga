package Tema3.Array;
import java.util.Scanner;

public class AtrapaLaMosca {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tablero = new int[15];
        int posicionMosca = (int)(Math.random() * 15);
        boolean juegoTerminado = false;

        System.out.println("---  ATRAPA A LA MOSCA  ---");
        System.out.println("La mosca está escondida en una casilla del 1 al 15.");

        while (!juegoTerminado) {
            System.out.print("¿Dónde crees que está? (Introduce un número del 1 al 15): ");
            int intentoUsuario = sc.nextInt();
            int posicionUsuario = intentoUsuario - 1;

            if (posicionUsuario == posicionMosca) {
                System.out.println("¡Has atrapado a la mosca!");
                juegoTerminado = true;

            } else if (posicionUsuario == posicionMosca - 1 || posicionUsuario == posicionMosca + 1) {
                System.out.println("La mosca se ha asustado y se ha movido a otro sitio.");
                posicionMosca = (int)(Math.random() * 15);

            } else {
                System.out.println("Aquí no hay nada...");
            }
        }
    }
}