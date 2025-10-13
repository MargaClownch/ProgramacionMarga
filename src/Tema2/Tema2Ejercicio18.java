package Tema2;

import java.util.Scanner;
public class Tema2Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        double numero = sc.nextDouble();

        if (numero < 0) {
            System.out.println("Error: no se puede calcular la raíz cuadrada de un número negativo.");
        } else {
            double raiz = Math.sqrt(numero);
            System.out.println("La raíz cuadrada de " + numero + " es " + raiz);
            //he descubierto que existe la clase Math.sqrt() que ya calcula la raíz, no sabía cómo hacerlo de otra forma
        }
    }
}