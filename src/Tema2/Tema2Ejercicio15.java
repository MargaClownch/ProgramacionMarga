package Tema2;

import java.util.Scanner;
public class Tema2Ejercicio15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número del mes (1-12): ");
        int mes = sc.nextInt();
        System.out.println("Introduce el año: ");
        int anio = sc.nextInt();
        int dias = 0;

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            dias = 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            dias = 30;
        } else if (mes == 2) {

            if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                dias = 29;
            } else {
                dias = 28;
            }
        } else {
            System.out.println("Mes inválido.");
        }
        System.out.println("El mes " + mes + " del año " + anio + " tiene " + dias + " días.");
    }
}
