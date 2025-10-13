package Tema2;

import java.util.Scanner;
public class Tema2Ejercicio8 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los euros que quieras cambiar: ");
        double euros = sc.nextDouble();
        System.out.println(euros+"€ son "+ (euros*1.17)+"$");
    }
}
