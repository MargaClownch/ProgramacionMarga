package Tema1;

import java.util.Scanner;
public class Tema1Ejercicio8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        int primero = sc.nextInt();
        System.out.println("Introduce el segundo número: ");
        int segundo = sc.nextInt();
        if (primero > segundo){
            System.out.println(primero + " Es mayor que: " + segundo);
        } else if (primero < segundo) {
            System.out.println(segundo + " Es mayor que: " + primero);
        } else
            System.out.println(primero + " Es igual a: " + segundo);

    }
}
