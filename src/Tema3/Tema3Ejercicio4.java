//Escribe un programa que permita pasar de euros a dólares y de dólares
//a euros. Necesitarás implementar el procedimiento showMenu() y las
//funciones euro2dollar y dollar2euro.
package Tema3;
import java.util.Scanner;

public class Tema3Ejercicio4 {
    public static void showMenu(){
        System.out.println("Introduce 1 para convertir euro a dolar");
        System.out.println("Introduce 2 para convertir dolar a euro");
        System.out.println("Introduce 3 para salir");
    }
    public static double euro2dollar(double moneda){
        return moneda*1.15;
    }
    public static double dollar2euro(double moneda){
        return moneda*0.85;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        showMenu();
        double moneda;
        int opcion = sc.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Introduce euros: ");
                moneda = sc.nextDouble();
                System.out.println(moneda + " Euros es igual a " + euro2dollar(moneda) + " dolares");
                break;
            case 2:
                System.out.println("Introduce dollars: ");
                moneda = sc.nextDouble();
                System.out.println(moneda + " dolares es igual a " + dollar2euro(moneda) + " euros");
                break;
            case 3:
                System.out.println("Muchas Gracias!");
                break;

                default:
                    System.out.println("ERROR");
        }
    }
}
