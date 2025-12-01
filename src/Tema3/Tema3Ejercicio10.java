//Escribe un programa que muestre un menú con 9 opciones (si tus
//ejercicios son modulares no debería costarte demasiado):
//a) Muestra el signo de un número introducido por el usuario.
//b) Indica si el usuario es mayor de edad o no.
//c) Calcula el área y perímetro de un círculo.
//d) Conversor de euros a dólares y de dólares a euros.
//e) Mostrar tabla de multiplicar de un número.
//f) Mostrar tablas de multiplicar del 1 al 10.
//g) Comprobador de números primos.
//h) Comprobador de fechas.
//i) Dibujar triángulos.
package Tema3;

import java.util.Scanner;

import static Tema3.Tema3Ejercicio1.numberSign;

public class Tema3Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//meterlo en un procedmiento
        System.out.println("a) Muestra el signo de un número introducido por el usuario.\n" +
                "b) Indica si el usuario es mayor de edad o no.\n" +
                "c) Calcula el área y perímetro de un círculo.\n" +
                "d) Conversor de euros a dólares y de dólares a euros.\n" +
                "e) Mostrar tabla de multiplicar de un número.\n" +
                "f) Mostrar tablas de multiplicar del 1 al 10.\n" +
                "g) Comprobador de números primos.\n" +
                "h) Comprobador de fechas.\n" +
                "i) Dibujar triángulos.");
        char selector = sc.next().charAt(0);
        switch(selector){
                case 'a':
                    System.out.println("Introduce un numero: ");
                    int isPositive = numberSign(sc.nextInt());
                    if (isPositive == -1){
                        System.out.println("No es positivo");
                    }else if (isPositive == 0){
                        System.out.println("0");
                    }else  if (isPositive == 1){
                        System.out.println("Positivo");
                    } break;
                case 'b':
                    System.out.println("Introduce la edad: ");
                    int age = sc.nextInt();
                    isPositive = numberSign(age);
                    boolean adulto = Tema3Ejercicio2.isAdult(age);
                    if (isPositive == -1){
                        System.out.println("Introduce un numero positivo: ");
                        age = sc.nextInt();
                    }
                    if (adulto == true){
                        System.out.println("Eres mayo de edad");
                    } else if (adulto == false) {
                        System.out.println("Ereh menoh");
                    } break;
                    case 'c':
                        System.out.println("Introduce el radio del circulo");
                        double radio = sc.nextDouble();
                        boolean valido = Tema3Ejercicio3.validRadius(radio);

                        while (valido == true){
                            System.out.println("Introduce un radio");
                            radio = sc.nextDouble();
                            valido = Tema3Ejercicio3.validRadius(radio);
                        }

                        double perimeter = Tema3Ejercicio3.calculateCirclePerimeter(radio);
                        double area = Tema3Ejercicio3.calculateCircleArea(radio);

                        System.out.println("El perímetro es: " +  perimeter);
                        System.out.println("El area es: " +  area);
                        break;
                        case 'd':
                            Tema3Ejercicio4.showMenu();
                            double moneda;
                            int opcion = sc.nextInt();
                            switch (opcion){
                                case 1:
                                    System.out.println("Introduce euros: ");
                                    moneda = sc.nextDouble();
                                    System.out.println(moneda + " Euros es igual a " + Tema3Ejercicio4.euro2dollar(moneda) + " dolares");
                                    break;
                                case 2:
                                    System.out.println("Introduce dollars: ");
                                    moneda = sc.nextDouble();
                                    System.out.println(moneda + " dolares es igual a " + Tema3Ejercicio4.dollar2euro(moneda) + " euros");
                                    break;
                                case 3:
                                    System.out.println("Muchas Gracias!");
                                    break;

                                default:
                                    System.out.println("ERROR");

                            } break;
                            case 'e':
                                System.out.println("Introduce un número del 1 al 10");
                                int num = sc.nextInt();

                                Tema3Ejercicio5.multiplicationTable(num);
                                break;
                                case 'f':
                                    for (int i = 1; i <= 10; i++) {
                                        Tema3Ejercicio5.multiplicationTable(i);
                                    }break;
                                    case 'g':
                                        int cerrar = 1;
                                        int numero = 0;
                                        while (cerrar != 0) {
                                            System.out.println("Digite un numero: ");
                                            Tema3Ejercicio7.primo(sc.nextInt());
                                            System.out.println("Pulse 1 para continuar o 0 para salir: ");
                                            cerrar = sc.nextInt();
                                        }break;
                                        case 'h':
                                            System.out.println("Introduce el día, mes y año");
                                            Tema3Ejercicio8.fecha(sc.nextInt(),sc.nextInt(),sc.nextInt());
                                            break;
                                            case 'i':
                                                System.out.println("Introduce el caracter y las lineas: ");
                                                Tema3Ejercicio9.triangulo(sc.next().charAt(0),sc.nextInt());
                                                break;
                                                default:
                                                    System.out.println("ERROR");
        }

        }
    }


