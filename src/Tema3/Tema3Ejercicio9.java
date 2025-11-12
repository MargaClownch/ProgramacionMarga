//Escribe un procedimiento que muestre por pantalla un triángulo como el
//que hay a continuación. Recibirá 2 parámetros: el carácter y el número
//de líneas del triángulo.
package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio9 {
    public static void triangulo(char shape, int lines) {

        for (int i = 1; i <= lines; i++) {
            for (int j = i; j < lines; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(shape);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el caracter y las lineas: ");
        triangulo(sc.next().charAt(0),sc.nextInt());
    }
}
