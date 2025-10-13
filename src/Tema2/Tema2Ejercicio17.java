package Tema2;

import java.util.Scanner;
public class Tema2Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la opción (0: cuadrado, 1: rectángulo, 2: triángulo): ");
        int opcion = sc.nextInt();

        if (opcion == 0) {
            System.out.println("Introduce el lado del cuadrado: ");
            double lado = sc.nextDouble();
            double superficie = lado * lado;
            double perimetro = 4 * lado;
            System.out.println("Superficie del cuadrado: " + superficie);
            System.out.println("Perímetro del cuadrado: " + perimetro);
        } else if (opcion == 1) {
            System.out.println("Introduce la base del rectángulo: ");
            double base = sc.nextDouble();
            System.out.println("Introduce la altura del rectángulo: ");
            double altura = sc.nextDouble();
            double superficie = base * altura;
            double perimetro = 2 * (base + altura);
            System.out.println("Superficie del rectángulo: " + superficie);
            System.out.println("Perímetro del rectángulo: " + perimetro);
        } else if (opcion == 2) {
            System.out.println("Introduce la base del triángulo: ");
            double base = sc.nextDouble();
            System.out.println("Introduce la altura del triángulo: ");
            double altura = sc.nextDouble();
            double superficie = (base * altura) / 2;
            System.out.println("Superficie del triángulo: " + superficie);
        } else {
            System.out.println("Error: opción no válida.");
        }
    }
}