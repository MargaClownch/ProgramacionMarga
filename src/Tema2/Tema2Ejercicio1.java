package Tema2;

import java.util.Scanner;
public class Tema2Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el lado del cuadrado: ");
        double lado = sc.nextDouble();
        System.out.println("El perímetro es: "+(lado*4)+" El area es: "+(lado*lado));

    }
}
