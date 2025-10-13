package Tema2;

import java.util.Scanner;
public class Tema2Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la base: ");
        double base = sc.nextDouble();
        System.out.println("Introduce la altura: ");
        double altura = sc.nextDouble();
        System.out.println("La superficie del triángulo es: "+(base*altura/2));
    }
}