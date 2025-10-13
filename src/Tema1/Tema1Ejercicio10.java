package Tema1;

import java.util.Scanner;
public class Tema1Ejercicio10 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println(" Introduce el primer número: ");
        double primero = sc.nextDouble();
        System.out.println(" Introduce el segundo número: ");
        double segundo = sc.nextDouble();
        System.out.println(" La suma es: " + (primero + segundo));
        System.out.println(" La resta es: " + (primero - segundo));
        System.out.println(" La división es: " + (primero / segundo));
        System.out.println(" La multiplicación es: " + (primero * segundo));
        System.out.println(" El resto es: " + (primero % segundo));
    }
}
