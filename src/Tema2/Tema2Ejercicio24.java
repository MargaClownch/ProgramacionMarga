package Tema2;
import java.util.Scanner;
//Realiza un programa que permite a un profesor introducir la nota de un
//número indefinido de alumnos y le indica cuántos suspendidos o
//aprobados hay.
public class Tema2Ejercicio24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int apro=0;
        int sus=0;
        int nota;
        System.out.println("Introduce la nota del alumno o un número negativo para salir del programa: ");

        do {
            nota = sc.nextInt();
            if (nota>=5){
                apro++;
            }else
                sus++;
        }
        while (nota>=0);

        System.out.println("Hay "+ apro + "aprobados!");
        System.out.println("Hay "+ (sus-1) + "suspendidos...");
        }
    }

