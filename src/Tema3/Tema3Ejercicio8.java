//Escribe un programa que lea por consola un día (1-31), un mes (1-12) y
//un año y nos indique si la fecha es correcta o no.
package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio8 {
    public static void fecha(int dia, int mes, int ano){
        //comrpobar febrero y los meses que tiene  30 o 31
        if(dia<1 || dia>31){
            System.out.println("Día incorrecto");
        }
        if(mes<1 || mes>12){
            System.out.println("Mes incorrecto");
        }
        if(ano<1 || ano>9999){
            System.out.println("Año incorrecto");
        }
        else System.out.println(dia+"/"+mes+"/"+ano);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el día, mes y año");
        fecha(sc.nextInt(),sc.nextInt(),sc.nextInt());
    }
}
