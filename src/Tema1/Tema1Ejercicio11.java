package Tema1;

import java.util.Scanner;
public class Tema1Ejercicio11 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un año: ");
        int anno = sc.nextInt();
        if (anno%4 == 0) {
            System.out.println(" Es bisiesto!! ");
        }else
            System.out.println(" No es bisiesto ");

        System.out.println("PROGRAMA EN FASE BETA, PUEDE CONTENER ERRORES");
    }
}
