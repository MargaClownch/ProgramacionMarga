package Tema3;

import java.util.Scanner;

public class MyMath {
// EJ1
    public static double squarePerimeter(double lado) {
        return lado * 4;
    }

    public static double squareArea(double lado) {
        return lado * lado;
    }

    public static double rectanglePerimeter(double base, double altura) {
        return (base + altura) * 2;

    }

    public static double rectangleArea(double base, double altura) {
        return base * altura;
    }

    public static double circlePerimeter(double radio) {
        return 2 * Math.PI * radio;
    }

    public static double circleArea(double radio) {
        return Math.PI * (radio * radio);
    }
// EJ2
    public static String esPrimo(int primo) {
        boolean esPrimo = true;
        if (primo <= 1) {
            esPrimo = false;
        } else
            for (int i = 2; i < primo; i++) {
                if (primo % i == 0) {
                    esPrimo = false;
                }

            }
        if (esPrimo) {
            return "Es Primo";
        } else
            return "No es primo";
    }
// EJ3
    public static int numDigits(int num) {
        int cifras = 1;
        Scanner sc = new Scanner(System.in);
        while (num / 10 != 0) {
            num = num / 10;
            cifras++;
        }
        return num;
    }
// EJ4
    public static int numPares(int num) {
        if (num == 0) {
            return 1;
        }
        int contadorPares = 0;
        int digitoActual;

        while (num > 0) {
            digitoActual = num % 10;

            if (digitoActual % 2 == 0) {
                contadorPares++;
            }
            num = num / 10;
        }
        return contadorPares;
    }
// EJ5
    public static int numImpar(int num) {
        int contadorImpares = 0;
        int digitoActual;

        while (num > 0) {
            digitoActual = num % 10;

            if (digitoActual % 2 != 0) {
                contadorImpares++;
            }
            num = num / 10;
        }
        return contadorImpares;
    }
// EJ6
    public static int calcFactorial(int num) {
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
// EJ7
    public static int calcFactorialRecursive(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * calcFactorialRecursive(num - 1);
    }
// EJ8
    public static int calcEquation(double a, double b, double c) {
        return 0;
    }
// EJ9
    public static int DigitSum(int digito) {
        int sum = 0;
        while (digito > 0) {
            sum += digito % 10;
            digito /= 10;
        }
        return sum;
    }
}


