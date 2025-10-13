package Tema2;

import java.util.Scanner;
public class Tema2Ejercicio4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        double primer = sc.nextDouble();
        System.out.println("Introduce el segundo número: ");
        double segundo = sc.nextDouble();
        System.out.println("Introduce el tercer número: ");
        double tercer = sc.nextDouble();

        if (primer > segundo && primer> tercer){
            System.out.println(primer + "Es mayor que el resto ");
        } else if (segundo > primer && segundo > tercer){
            System.out.println(segundo + "Es mayor que el resto ");
        }
        else
            System.out.println(tercer + "Es mayor que el resto ");

    }
}
