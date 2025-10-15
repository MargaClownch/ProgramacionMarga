package Tema2;
import java.util.Scanner;
//Realiza un programa que lee por consola dos números enteros (A y B).
//Si B es mayor que A, muestra todos los números impares entre ellos.

public class Tema2Ejercicio20 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        int primer = sc.nextInt();
        System.out.println("Introduce el segundo número: ");
        int segundo = sc.nextInt();
        if (primer<segundo) {
            for (int i = segundo; i >= primer; i--) {
                if (i % 2 == 1) {
                    System.out.println(i);
                }
            }
        }
    }
}
