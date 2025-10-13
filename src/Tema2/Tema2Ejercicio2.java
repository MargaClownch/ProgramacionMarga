package Tema2;

import java.util.Scanner;
public class Tema2Ejercicio2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la base: ");
        double base = sc.nextDouble();
        System.out.println("Introduce la altura: ");
        double altura = sc.nextDouble();
        System.out.println("El prímetro es: "+(2*base+2*altura));
        System.out.println("La superficie es:"+(base*altura));
    }
}
