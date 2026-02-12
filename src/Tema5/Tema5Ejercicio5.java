package Tema5;

import java.util.Scanner;

public class Tema5Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pruebas
        try {
            System.out.println("Probando imprimePositivo con 5:");
            imprimePositivo(5); // Funciona

            System.out.println("Probando imprimePositivo con -2:");
            imprimePositivo(-2); // Falla y salta al catch

        } catch (Exception e) {
            System.out.println("Excepción capturada: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("---Separador---");

        try {
            System.out.println("Probando imprimeNegativo con -5:");
            imprimeNegativo(-5); // Funciona

            System.out.println("Probando imprimeNegativo con 10:");
            imprimeNegativo(10); // Falla

        } catch (Exception e) {
            System.out.println("Excepción capturada: " + e.getMessage());
            e.printStackTrace();
        }
    }
    // Funcion 1: Lanza error si es negativo
    public static void imprimePositivo(int p) throws Exception {
        if (p < 0) {
            throw new Exception("Error: El número es negativo (" + p + ")");
        }
        System.out.println("Imprimiendo positivo: " + p);
    }

    // Funcion 2: Lanza error si es positivo o cero
    public static void imprimeNegativo(int n) throws Exception {
        if (n >= 0) {
            throw new Exception("Error: El número es positivo o cero (" + n + ")");
        }
        System.out.println("Imprimiendo negativo: " + n);
    }
}