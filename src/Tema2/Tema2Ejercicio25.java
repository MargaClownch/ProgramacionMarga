package Tema2;
import java.util.Scanner;
//Haz un programa que pide un número entero por consola y calcula el
//factorial. Por ejemplo el factorial de 5 es:
//5! = 5 * 4 * 3 * 2 * 1
public class Tema2Ejercicio25 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num = sc.nextInt();
        int factorial =1;

        if (num<0){
            System.out.println("Introduce un número positivo");
        } else
            for (int i = 1; i<=num; i++){
                factorial = factorial * i;
            }
        System.out.println("El factorial de: " + num + " es " + factorial);
    }
}
