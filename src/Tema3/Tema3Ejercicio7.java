//Escribe un programa que pida números enteros positivos hasta que se
//introduzca el 0, para cada número nos dirá si es primo o no
package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio7 {
    public static void primo(int p){
        boolean esPrimo = true;
        if (p <= 1) {
            esPrimo = false;
        } else
            for (int i = 2; i < p; i++) {
                if (p % i == 0) {
                    esPrimo = false;
                }

            }
        if (esPrimo) {
            System.out.println(p + " es un número primo.");
        } else
            System.out.println(p + " no es un número primo.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cerrar = 1;
        int numero = 0;
        while (cerrar != 0) {
            System.out.println("Digite un numero: ");
            primo(sc.nextInt());
            System.out.println("Pulse 1 para continuar o 0 para salir: ");
            cerrar = sc.nextInt();
        }
    }
}
