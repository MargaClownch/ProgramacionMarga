package Tema2;

import java.util.Scanner;
public class Tema2Ejercicio11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        double primer = sc.nextDouble();
        System.out.println("Introduce el segundo número: ");
        double segundo = sc.nextDouble();
        System.out.println("Introduce el tercer número: ");
        double tercer = sc.nextDouble();

        if (segundo==(primer+1)&&tercer==(primer+2)){
            System.out.println("Son consecutivos ");
        }
        else if(segundo==(tercer+1)&&primer==(tercer+2)){
            System.out.println("Son consecutivos ");
        }
        else System.out.println("No son consecutivos");
    }
}