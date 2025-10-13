package Tema2;

import java.util.Scanner;
public class Tema2Ejercicio7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número ");
        double primer = sc.nextDouble();
        System.out.println("Introduce el segundo número ");
        double segundo = sc.nextDouble();

        if (primer>segundo){
            System.out.println("La resta del mayor número con el menor es: "+(primer-segundo));
        }
        else
            System.out.println("La resta del mayor número con el menor es: "+(segundo-primer));
    }
}
