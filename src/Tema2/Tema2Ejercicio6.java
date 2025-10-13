package Tema2;

import java.util.Scanner;
public class Tema2Ejercicio6 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número ");
        double num = sc.nextDouble();
        if (num > 0){
            System.out.println("El número es positivo!! ");
        } else if (num ==0) {
            System.out.println("El número es 0!!");
        }
        else
            System.out.println("El número es negativo!!");
    }
}
