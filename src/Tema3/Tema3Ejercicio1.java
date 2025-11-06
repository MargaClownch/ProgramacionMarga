//Crea un programa que pida un número por consola y nos indique si es
//positivo, negativo o 0. Para ello implementa la función numberSign que
//devuelve 0, 1 o -1 dependiendo de si el número que recibe como
//parámetro es 0, positivo o negativo
package Tema3;
import java.util.Scanner;
public class Tema3Ejercicio1 {
    public static int numberSign(int num1){
        if (num1 == 0){
            return 0;
        }else if (num1 > 0){
            return 1;
        }else {
            return -1;
        }
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int num1 = sc.nextInt();

        if (numberSign(num1) == 0){
            System.out.println("El numero es 0 ");
        }else if (numberSign(num1) > 0) {
            System.out.println("El numero es positivo: ");
        }else
            System.out.println("El numero es negativo");
    }
}
