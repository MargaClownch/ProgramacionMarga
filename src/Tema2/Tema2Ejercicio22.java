package Tema2;
import java.util.Scanner;
//Realiza un programa que lea por consola un número entero e indique
//cuántas cifras tiene. Pista: usa varias divisiones entre 10.
public class Tema2Ejercicio22 {
    public static void main(String[] args){
        int cifras=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int num = sc.nextInt();
        while(num/10!=0){
            num=num/10;
                cifras++;
            }
        System.out.println("El número tiene: "+cifras+" cifras");
        }
    }

