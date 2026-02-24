package Tema5.Colecciones2.Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class AvistamientosMain {
    static ArrayList<Avistamiento> listaAvistamientos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;

        do {
            showMenu();
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    agregarAvistamiento();
                    break;
                case 2:
                    mostrarDesdeLasOcho();
                    break;
                case 3:
                    mostrarNocturnos();
                    break;
                case 4:
                    mostrarLobos();
                    break;
                case 5:
                    mostrarSerpientes();
                    break;
                case 6:
                    mostrarPajaros();
                    break;
                case 7:
                    System.out.println("Gracias por usar el programa!!!");
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        }
        while (opcion !=7);

    }
    public static void showMenu(){
        System.out.println("---------------------------------------------------");
        System.out.println("Opción 1: Añadir avistamiento");
        System.out.println("Opción 2: Mostrar avistamientos a partir de las 8");
        System.out.println("Opción 3: Mostrar avistamientos nocturnos");
        System.out.println("Opción 4: Mostrar Manadas");
        System.out.println("Opción 5: Mostrar Serpientes");
        System.out.println("Opción 6: Mostrar Pájaros");
        System.out.println("Opción 7: Salir");
        System.out.println("---------------------------------------------------");
    }
    public static void agregarAvistamiento(){
            System.out.println("¿Qué has visto?");
            System.out.println("1. Serpiente | 2. Pájaro | 3. Manada de lobos");
            int tipo = sc.nextInt();

            System.out.print("¿A qué hora (0-23)? ");
            int hora = sc.nextInt();
            sc.nextLine();

            if (tipo == 1) {
                System.out.print("Especie de la serpiente: ");
                String especie = sc.nextLine();
                System.out.print("Longitud en metros: ");
                double longitud = sc.nextDouble();

                Serpiente s = new Serpiente(hora, longitud, especie);
                listaAvistamientos.add(s);
                System.out.println("Serpiente registrada.");

            } else if (tipo == 2) {
                System.out.print("Especie del pájaro: ");
                String especie = sc.nextLine();
                System.out.print("Peso en KG): ");
                double peso = sc.nextDouble();

                Pajaro p = new Pajaro(hora, peso, especie);
                listaAvistamientos.add(p);
                System.out.println("Pájaro registrado.");

            } else if (tipo == 3) {
                System.out.print("Número de lobos en la manada: ");
                int numLobos = sc.nextInt();
                sc.nextLine();
                System.out.print("Observaciones: ");
                String obs = sc.nextLine();

                ManadaLobos m = new ManadaLobos(hora, numLobos, obs);
                listaAvistamientos.add(m);
                System.out.println("Manada registrada.");
            } else {
                System.out.println("Tipo de animal incorrecto.");
            }
        }
    public static void mostrarDesdeLasOcho() {
        System.out.println("Avistamientos a partir de las 8: ");
        for (Avistamiento a : listaAvistamientos) {
            if (a.getHora() >= 8 && a.getHora() < 20) {
                System.out.println(a.toString());
            }
        }
    }
    public static void mostrarNocturnos() {
        System.out.println("Avistamientos Nocturnos");
        for (Avistamiento a : listaAvistamientos) {
            if (a.getHora() >= 20 || a.getHora() <= 8) {
                System.out.println(a.toString());
            }
        }
    }

    public static void mostrarLobos() {
        System.out.println("Manadas de lobos");
        for (Avistamiento a : listaAvistamientos) {
            if (a instanceof ManadaLobos) {
                System.out.println(a.toString());
            }
        }
    }

    public static void mostrarSerpientes() {
        System.out.println("Serpientes");
        for (Avistamiento a : listaAvistamientos) {
            if (a instanceof Serpiente) {
                System.out.println(a.toString());
            }
        }
    }

    public static void mostrarPajaros() {
        System.out.println("Pajaros");
        for (Avistamiento a : listaAvistamientos) {
            if (a instanceof Pajaro) {
                System.out.println(a.toString());
            }
        }
    }
}

