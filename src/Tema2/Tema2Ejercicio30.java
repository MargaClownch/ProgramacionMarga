package Tema2;
import java.util.Scanner;
import java.util.Random;
//Haz una calculadora. La calculadora permitirá hacer varias operaciones.
//Pedirá un número real, pedirá una operación (+, -, *, / o %), pedirá otro
//número real y mostrará el resultado por consola. A continuación pedirá
//los datos para una nueva operación. Piensa en un modo para que se
//pueda salir de la calculadora en cualquier momento.
public class Tema2Ejercicio30 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double resultado = 0;
        boolean salir = false;

        while (!salir){
            System.out.println("Ingresa el primer número: ");
            double num1 = sc.nextDouble();
            System.out.println("Ingresa el segundo número : ");
            double num2 = sc.nextDouble();
            System.out.println("Ingresa el operador (+, -, *, /) Para salir escribe salir : ");
            sc.nextLine();
            String operador = sc.nextLine();

        switch (operador) {
            case "+":
                resultado = num1 + num2;
                System.out.println(resultado);
                break;
            case "-":
                resultado = num1 - num2;
                System.out.println(resultado);
                break;
            case "*":
                resultado = num1 * num2;
                System.out.println(resultado);
                break;
            case "/":
                resultado = num1 / num2;
                System.out.println(resultado);
                break;
            case "salir":
                salir = true;
                break;
            }
        }
    }
}

