package Tema2;

import java.util.Scanner;
public class Tema2Ejercicio12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        double primer = sc.nextDouble();
        System.out.println("Introduce el segundo número: ");
        double segundo = sc.nextDouble();
        System.out.println("Introduce el tercer número: ");
        double tercer = sc.nextDouble();
        double mayor, menor, medio;

        if (primer >= segundo && primer >= tercer) {
            mayor = primer;
            if (segundo >= tercer) {
                medio = segundo;
                menor = tercer;
            } else {
                medio = tercer;
                menor = segundo;
            }
        } else if (segundo>=primer&&segundo>=tercer){
            mayor = segundo;
            if(primer>=tercer){
                medio = primer;
                menor = tercer;
            } else {
                medio = tercer;
                menor = primer;
            }

        }
        else{
            mayor = tercer;
            if(primer >= segundo) {
                medio = primer;
                menor = segundo;

            } else {
                medio = segundo;
                menor = primer;
            }

        }
        System.out.println("Números ordenados de mayor a menor: " + mayor + ", " + medio + ", " + menor);
    }
}