package Tema2;

import java.util.Scanner;
public class Tema2Ejercicio14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de personas: ");
        int personas = sc.nextInt();
        System.out.print("Introduce el número de días de estancia: ");
        int dias = sc.nextInt();

        if (personas <= 0 || dias <= 0) {
            System.out.println("El número de personas y días debe ser mayor que cero.");

        }

        double precioBase = personas * dias * 15.0;
        double precioFinal = precioBase;
        if (personas > 5 && dias >= 7) {
            precioFinal = precioBase * 0.75;
        }
        System.out.println("Precio base: "+ precioBase+"0€");
        if (precioFinal < precioBase) {
            System.out.println("Se le ha aplicado un descuento del 25% por grupo grande y estancia prolongada");
        }
        System.out.println("Precio final: "+ precioFinal+"0€");
    }
}
