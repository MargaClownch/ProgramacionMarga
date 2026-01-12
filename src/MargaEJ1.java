import java.util.Scanner;
public class MargaEJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        int notasTotal;
        double notasCal;
        int aprobados = 0;
        int suspendidos = 0;
        int contador;
        int nBilletes;
        int pBilletes = 32;
        double totalBilletes = 0;
        String nombre;
        int edad;

        do {
            System.out.println("Introduce la opción que desea ejecutar: ");
            System.out.println("1. Aprobados y Suspendidos");
            System.out.println("2. Billetes");
            System.out.println("3. Salir");
            menu = sc.nextInt();

            switch (menu){

                case 1:
                    System.out.println("Iniciado programa de notas");
                    System.out.println("Introduce el total de notas que hay: ");
                    notasTotal = sc.nextInt();
                    for (int i = 0; i < notasTotal; i++){
                        System.out.println("Introduce la calificacion: ");
                        notasCal = sc.nextDouble();
                        if (notasCal >= 5){
                            aprobados++;
                        } else {
                            suspendidos++;
                        }
                    }
                    System.out.println("Aprobados: " + aprobados);
                    System.out.println("Suspendidos: " + suspendidos);
                    break;
                case 2:
                    System.out.println("Introduce el numero de billetes que desea comprar:");
                    nBilletes = sc.nextInt();
                    for (int i = 0; i < nBilletes; i++){
                        System.out.println("Introduce el nombre: ");
                        sc.nextLine();
                        nombre = sc.nextLine();
                        System.out.println("Introduce la edad: ");
                        edad = sc.nextInt();
                        if (edad >= 65){
                            totalBilletes = (pBilletes * 90)/100;
                        } else if (edad >= 12 && edad <= 15) {
                            totalBilletes = totalBilletes + (pBilletes * 92)/100;

                        } else if (edad >= 4 && edad <= 11) {
                            totalBilletes = totalBilletes + (pBilletes * 65)/100;

                        } else if (edad < 4) {
                            totalBilletes = totalBilletes +0;

                        } else {
                            totalBilletes = totalBilletes + pBilletes;
                        }
                    }
                    System.out.println("Precio total de los billetes: " + totalBilletes);

                case 3:
                    System.out.println("Adios!!");
                    break;

                default:
                    System.out.println("Opcion no válida");
            }
        }
        while (menu !=3);

    }
}
