package Tema3.Array;
import java.util.Scanner;

public class MenuArray {
    public static int[] crearVector(Scanner sc) {
        System.out.print("Introduce el tamaño del vector: ");
        int tam = sc.nextInt();
        int[] arr = new int[tam];
        for (int i = 0; i < tam; i++) {
            System.out.print("Valor para la posición " + i + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int[] crearVectorSecundario(Scanner sc, int tam) {
        System.out.println("Para esta operación necesitas otro vector de tamaño " + tam);
        int[] arr = new int[tam];
        for (int i = 0; i < tam; i++) {
            System.out.print("Valor array 2 pos " + i + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector1 = null;
        int opcion;

        System.out.println("Primero, vamos a crear tu vector principal.");
        vector1 = crearVector(sc);

        do {
            System.out.println("\n--- MENÚ DE OPERACIONES ---");
            System.out.println("1. Imprimir array");
            System.out.println("2. Ver Máximo");
            System.out.println("3. Ver Mínimo");
            System.out.println("4. Ver Media");
            System.out.println("5. Buscar un número (Check)");
            System.out.println("6. Sumar con otro array");
            System.out.println("7. Restar con otro array");
            System.out.println("8. Multiplicar por otro array");
            System.out.println("9. Invertir (Creando copia)");
            System.out.println("10. Invertir (Modificando original)");
            System.out.println("11. ¿Es Capicúa?");
            System.out.println("12. Crear un nuevo vector principal");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Tu vector es: ");
                    MyArray.imprimirArray(vector1);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("El máximo es: " + MyArray.arrayMax(vector1));
                    break;
                case 3:
                    System.out.println("El mínimo es: " + MyArray.arrayMin(vector1));
                    break;
                case 4:
                    System.out.println("La media es: " + MyArray.arrayAverage(vector1));
                    break;
                case 5:
                    System.out.print("¿Qué número buscas?: ");
                    int num = sc.nextInt();
                    boolean existe = MyArray.arrayCheck(vector1, num);
                    if (existe) {
                        System.out.println("El número " + num + " está en el array.");
                    } else {
                        System.out.println("El número " + num + " NO está en el array.");
                    }
                    break;
                case 6:
                    int[] v2Sum = crearVectorSecundario(sc, vector1.length);
                    int[] resultadoSum = MyArray.arraySum(vector1, v2Sum);
                    System.out.print("Resultado Suma: ");
                    MyArray.imprimirArray(resultadoSum);
                    break;
                case 7:
                    int[] v2Res = crearVectorSecundario(sc, vector1.length);
                    int[] resultadoRes = MyArray.arrayRes(vector1, v2Res);
                    System.out.print("Resultado Resta: ");
                    MyArray.imprimirArray(resultadoRes);
                    break;
                case 8:
                    int[] v2Mult = crearVectorSecundario(sc, vector1.length);
                    int[] resultadoMult = MyArray.arrayMult(vector1, v2Mult);
                    System.out.print("Resultado Multiplicación: ");
                    MyArray.imprimirArray(resultadoMult);
                    break;
                case 9:
                    int[] invertido = MyArray.arrayInv(vector1);
                    System.out.print("Copia invertida: ");
                    MyArray.imprimirArray(invertido);
                    break;
                case 10:
                    MyArray.arrayInvProcedimiento(vector1);
                    System.out.println("El vector original ha sido invertido.");
                    System.out.print("Ahora es: ");
                    MyArray.imprimirArray(vector1);
                    break;
                case 11:
                    boolean capicua = MyArray.arrayCapicua(vector1);
                    if (capicua) {
                        System.out.println("Sí es capicúa.");
                    } else {
                        System.out.println("No es capicúa.");
                    }
                    break;
                case 12:
                    vector1 = crearVector(sc);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);
    }
}