package Tema2;
import java.util.Scanner;
import java.util.Random;
//El número secreto”. Programa un juego en el que se calcula
//aleatoriamente un número de 1 a 100. El usuario debe adivinarlo. Cada
//vez que el usuario pone un número el programa le indicará si lo ha
//acertado, si el número secreto es mayor o si es menor. Termina cuando
//el usuario acierta el número.
public class Tema2Ejercicio29 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int randomInt = random.nextInt(100);
        int num=0;
        System.out.println("Introduce el número correcto!: ");

        while (num!=randomInt){
            num = sc.nextInt();
           if (num < randomInt){
               System.out.println("El número es mayor");

           }
           else if(num > randomInt) {
               System.out.println("El número es menor");
           } else
               System.out.println("Has acertado!!!");
        }
    }
}
