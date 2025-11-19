//Crea un programa que pida un número por consola y nos indique si es
//positivo, negativo o 0. Para ello implementa la función numberSign que
//devuelve 0, 1 o -1 dependiendo de si el número que recibe como
//parámetro es 0, positivo o negativo
package Tema3;
import java.util.Scanner;
public class Tema3Ejercicio1 {
    public static int numberSign(int num1){
        int isPositive = 0;
        if (num1 == 0){
            isPositive = 0;
        }else if (num1 > 0){
            isPositive = 1;
        }else {
            isPositive = -1;
        }
        return isPositive;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int numero = sc.nextInt();
        int isPositive = numberSign(numero);
        if (isPositive == -1){
            System.out.println("negativo");
        }else if (isPositive == 0){
            System.out.println("0");
        }else  if (isPositive == 1){
            System.out.println("Positivo");
        }
    }
}
