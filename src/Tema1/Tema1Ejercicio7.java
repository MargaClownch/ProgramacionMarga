package Tema1;

import java.util.Scanner;
public class Tema1Ejercicio7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total = 7;
        System.out.println("introduce un número del 1 al 6: =");
        int cara = sc.nextInt();
        System.out.println("La cara opuesta es= "+ (total-cara));
    }
}
