package Tema2;

import java.util.Scanner;
public class Tema2Ejercicio10 {
    public static void  main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        double primer = sc.nextDouble();
        System.out.println("Introduce el segundo número: ");
        double segundo = sc.nextDouble();
        System.out.println("Introduce el tercer número: ");
        double tercer = sc.nextDouble();
        if (primer<segundo&&segundo<tercer){
            System.out.println("Los números están ordenados de menor a mayor ");
        }
        else
            System.out.println("Los números no están ordenados de menor a mayor ");
    }
}
