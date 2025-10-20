package Tema2;
import java.util.Scanner;
import java.util.Random;
//Haz un programa que calcule un número aleatorio de la lotería de
//Navidad (de 0 a 99.999) y después pida al usuario por consola hasta 5
//números indicando cada vez si ha ganado la lotería o no
public class Tema2Ejercicio28 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int randomInt = random.nextInt(99999);
        int contador = 1;
        System.out.println("Introduce un número: ");

        while (contador<=5) {
            int num = sc.nextInt();
            if (num == randomInt) {
                System.out.println("Has ganado la lotería!!!!!");
            } else
                System.out.println("Qué te esperabas manin?");
            contador++;
        }
    }
}
