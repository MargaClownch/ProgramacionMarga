package Tema2;
//Escribe un programa que muestra por consola todos los números pares
//entre 1 y 1000.

public class Tema2Ejercicio19 {
    public static void main(String[] args){
        for (int i = 1; i<=1000; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
