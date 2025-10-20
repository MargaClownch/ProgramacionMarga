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
        System.out.print("Ingresa el primer número, Para salir ingresa #: ");
        double num1 = sc.nextDouble();
        System.out.print("Ingresa el operador (+, -, *, /) : ");
        String operador = sc.next();
        System.out.print("Ingresa el segundo número : ");
        double num2 = sc.nextDouble();
        double resultado = 0;
        boolean salida = true;

        while (salida==true){
            if (num1<0) {
                salida = false;
            } else if (num2<=0) {
                salida = false;

            }else
            switch (operador) {
                case "+":
                    resultado = num1 + num2;
                    break;
                case "-":
                    resultado = num1 - num2;
                    break;
                case "*":
                    resultado = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Error: División por cero.");
                        return; // Termina el programa
                    }
                    break;
                default:
                    System.out.println("Operador no válido.");
                    return; // Termina si el operador es inválido
            }

            System.out.println("Resultado: " + resultado);

        }
    }
}
