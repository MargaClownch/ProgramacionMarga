package Tema2;
import java.util.Scanner;
// Haz un programa que encuentre e imprima por consola los 20 primeros
//números primos.
public class Tema2Ejercicio27 {
    public static void main(String[] args) {
    int contador = 0;
    int numero = 2;


        while (contador<=20) {
            boolean esPrimo = true;
            for (int i = 2; i * i <= numero; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                }
            }
            if (esPrimo) {
                System.out.println(numero);
                contador++;
            }
            numero++;
        }
    }
}
