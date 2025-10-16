package Tema2;
import java.util.Scanner;
//Lee por teclado varios números enteros positivos hasta recibir un
//número negativo. El programa mostrará la media de los números (sin
//tener en cuenta el negativo).
public class Tema2Ejercicio23 {
    public static void main(String[] args){
        double contador=0;
        double suma=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la nota para hacer la media o un número negativo para salir: ");
        double nota;
        do {
            nota = sc.nextDouble();
            if (nota>=0){
                contador++;
            suma=nota+suma;}
        }
        while (nota>=0);

        if (contador>0) {
            double media = suma / contador;
            System.out.println("La media es: " + media);
            }else {
            System.out.println("No se ha introducido ningun número");
        }
    }
}



