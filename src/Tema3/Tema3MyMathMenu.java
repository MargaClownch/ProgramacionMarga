package Tema3;
import java.util.Scanner;

import static Tema3.MyMath.*;

public class Tema3MyMathMenu {
    public static void showMenu(){
        System.out.println("Introduce del 1-9 para ejecutar los ejercicios acordes o 0 para salir");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido!! Pulse 1 para empezar: ");
        int menu = sc.nextInt();
        while(menu!=0){
            showMenu();
            menu = sc.nextInt();
            switch (menu){
                case 1:
                    System.out.println("Introcue el lado del cuadrado");
                    double lado = sc.nextDouble();
                    double perimetro = MyMath.squarePerimeter(lado);
                    double area = MyMath.squareArea(lado);
                    System.out.println("El perímetro es: " + perimetro);
                    System.out.println("El área es: " + area);
                    break;
                case 2:
                    System.out.println("Introduce un número y te diré sí es primo!!");
                    System.out.println(esPrimo(sc.nextInt()));
                    if(esPrimo(sc.nextInt())){
                        System.out.println("Es primo");
                    }
                    break;
                case 3:
                    System.out.println("Introduce un número y te diré cuántos digitos tiene: ");
                    System.out.println("Tiene " + numDigits(sc.nextInt()));
                    break;
                case 4:
                    System.out.println("Introduce un entero y te devolveré los pares: ");
                    System.out.println("Tiene " + numPares(sc.nextInt()) + "numeros pares");
                    break;
                case 5:
                    System.out.println("Introduce un entero y te devolveré los impares: ");
                    System.out.println("Tiene " + numImpar(sc.nextInt()) + "numeros impares");
                    break;
                case 6:
                    System.out.println("Introduce un numero y te calculo el factorial, no te pases de 10 que me petas el pc: ");

                    System.out.println("El factorial es " + calcFactorial(sc.nextInt()));
                    break;
                case 7:
                    System.out.println("Lo mismo que el ejercicio 6 pero más guay: ");
                    System.out.println("El factorial es " + calcFactorialRecursive(sc.nextInt()));
                    break;
                case 8:
                    System.out.println("WORK IN PROGRESS!!!!!!");
                    break;
                case 9:
                    System.out.println("Dime un entero y de sumo los digitos que tiene: ");
                    System.out.println("La suma es " + DigitSum(sc.nextInt()));
                    break;
                default:
                    System.out.println("Opcion no permitida");
                    break;
            }
        }
    }
}
