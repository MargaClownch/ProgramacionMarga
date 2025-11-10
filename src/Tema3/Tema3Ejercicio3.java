//Crea un programa que pida al usuario un radio válido por teclado (>0) y
//calcule la superficie y perímetro de un círculo. Necesitarás implementar
//y utilizar las siguientes funciones:
//boolean validRadius(radius)
//double calculateCirclePerimeter(radius)
//double calculateCircleArea(radius)
package Tema3;
import java.util.Scanner;

public class Tema3Ejercicio3 {

    public static boolean validRadius(double radius){
        boolean valido = false;
        if(radius <= 0){
            valido = true;
        }
        return valido;
    }

    public static double calculateCirclePerimeter(double radius){
        return 2*Math.PI*radius;

    }
    public static double calculateCircleArea(double radius){
        return Math.PI*(radius*radius);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el radio del circulo");
        double radio = sc.nextDouble();
        boolean valido = validRadius(radio);

        while (valido == true){
            System.out.println("Introduce un radio");
            radio = sc.nextDouble();
            valido = validRadius(radio);
        }

        double perimeter = calculateCirclePerimeter(radio);
        double area = calculateCircleArea(radio);

        System.out.println("El perímetro es: " +  perimeter);
        System.out.println("El area es: " +  area);
    }
}
