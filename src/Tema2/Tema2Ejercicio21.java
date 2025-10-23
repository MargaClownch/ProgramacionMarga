package Tema2;
//Escribe un programa que calcula la suma de todos los números pares
//entre 1 y 1000 y la muestra por consola.
public class Tema2Ejercicio21 {
    public static void main(String[] args) {
        int contador = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 0) {
                contador = contador + i;
            }
        }
        System.out.println("La suma de todos los pares es: " + contador);
    }
}
