//Utiliza la función anterior y una función nueva que crearás llamada
//isAdult para hacer un programa que reciba una edad e indica si se es
//mayor de edad o no.
//boolean isAdult(age)
package Tema3;
import java.util.Scanner;
public class Tema3Ejercicio2 {
    public static boolean isAdult(int num1){
        boolean adulto = false;
        if (num1 >= 18){
            adulto = true;
        }
        return adulto;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la edad: ");
        int age = sc.nextInt();
        int isPositive = Tema3Ejercicio1.numberSign(age);
        boolean adulto = isAdult(age);
        if (isPositive == -1){
            System.out.println("Introduce un numero positivo: ");
            age = sc.nextInt();
        }
        if (adulto == true){
            System.out.println("Eres mayoh de edad");
        } else if (adulto == false) {
            System.out.println("Ereh menoh");
        }
    }
}
