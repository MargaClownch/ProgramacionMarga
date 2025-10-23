package Tema2;
import java.util.Scanner;
//Haz un programa que pida un número entero por consola e indica si es
//primo o no. Un número primo sólo es divisible por él mismo y por la
//unidad.
public class Tema2Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int num = sc.nextInt();
        boolean esPrimo = true;
        if (num <= 1) {
            esPrimo = false;
        } else
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    esPrimo = false;
                }

            }
        if (esPrimo) {
            System.out.println(num + " es un número primo.");
        } else {
            System.out.println(num + " no es un número primo.");
        }
    }
}

