//Escribe un programa que pida un número entero por consola de 1 a 10 y
//te muestre su tabla de multiplicar.
package Tema3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Tema3Ejercicio5 {
    public static void multiplicationTable(int a){
        for (int i = 1; i<=10; i++){
            System.out.println(a + " por " + i + " es igual a " + a*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número del 1 al 10");
        int num = sc.nextInt();

        multiplicationTable(num);
    }
}
