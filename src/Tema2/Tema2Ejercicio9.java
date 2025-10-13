package Tema2;

import java.util.Scanner;
public class Tema2Ejercicio9 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los dólares que quieras cambiar: ");
        double dolar = sc.nextDouble();
        System.out.println(dolar+"$ son "+ (dolar*0.86)+"€");
    }
}
