package Tema2;

import java.util.Scanner;
public class Tema2Ejercicio5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        double primer = sc.nextDouble();
        System.out.println("Introduce el segundo número: ");
        double segundo = sc.nextDouble();
        System.out.println("Introduce el tercer número: ");
        double tercer = sc.nextDouble();
        System.out.println("La media de los 3 números es: "+(primer + segundo + tercer)/3);
        //
    }
}
