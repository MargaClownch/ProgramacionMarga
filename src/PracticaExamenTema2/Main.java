package PracticaExamenTema2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Criatura> lista = new ArrayList<>();

    public static void main(String[] args) {
        int opcion = 0;

        do {
            System.out.println("\n--- MINI LIGA DE CRIATURAS ---");
            System.out.println("1. Crear criatura");
            System.out.println("2. Listar criaturas");
            System.out.println("3. Combatir");
            System.out.println("4. Entrenar criatura");
            System.out.println("5. Evolucionar criatura");
            System.out.println("6. Curar criatura");
            System.out.println("7. Salir");
            System.out.print("Elige: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1: crearCriatura(); break;
                case 2: listarCriaturas(); break;
                case 3: combatir(); break;
                case 4: entrenar(); break;
                case 5: evolucionar(); break;
                case 6: curar(); break;
                case 7: System.out.println("¡Adiós!"); break;
                default: System.out.println("Opción no válida.");
            }
        } while (opcion != 7);
    }

    public static void crearCriatura() {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Tipo (FUEGO, AGUA, PLANTA, ELECTRICO): ");
        String tipo = sc.nextLine().toUpperCase();
        System.out.print("Nivel (1-10): ");
        int nivel = sc.nextInt();

        // Stats base de ejemplo
        int ps = 20 + (nivel * 2);
        int atk = 10 + nivel;
        int def = 5 + nivel;

        if (tipo.equals("FUEGO")) lista.add(new FuegoMon(nombre, nivel, ps, atk, def));
        //else if (tipo.equals("AGUA")) lista.add(new AguaMon(nombre, nivel, ps, atk, def)); // Asumiendo que has creado AguaMon
            // Aquí añadirías los demás tipos
        else System.out.println("Tipo no reconocido.");
    }

    public static void listarCriaturas() {
        if (lista.isEmpty()) {
            System.out.println("No hay criaturas.");
            return;
        }
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + ". " + lista.get(i).toString());
        }
    }

    public static void combatir() {
        if (lista.size() < 2) {
            System.out.println("Necesitas al menos 2 criaturas.");
            return;
        }
        listarCriaturas();
        System.out.print("Índice atacante: ");
        int i1 = sc.nextInt();
        System.out.print("Índice defensor: ");
        int i2 = sc.nextInt();

        if (i1 < 0 || i1 >= lista.size() || i2 < 0 || i2 >= lista.size()) {
            System.out.println("Índices inválidos.");
            return;
        }

        Criatura c1 = lista.get(i1);
        Criatura c2 = lista.get(i2);

        if (c1.estaDebilitada() || c2.estaDebilitada()) {
            System.out.println("¡Una de las criaturas está debilitada y no puede pelear!");
            return;
        }

        // Bucle de combate hasta que una caiga
        while (!c1.estaDebilitada() && !c2.estaDebilitada()) {
            int danio = c1.atacar(c2);
            System.out.println(c1.getNombre() + " ataca a " + c2.getNombre() + " y hace " + danio + " de daño!");

            if (c2.estaDebilitada()) {
                System.out.println("¡" + c2.getNombre() + " ha sido debilitado!");
                break; // Sale del bucle si c2 muere
            }

            // Turno del defensor
            int danio2 = c2.atacar(c1);
            System.out.println(c2.getNombre() + " contraataca y hace " + danio2 + " de daño!");

            if (c1.estaDebilitada()) {
                System.out.println("¡" + c1.getNombre() + " ha sido debilitado!");
            }
        }
    }

    public static void entrenar() {
        listarCriaturas();
        System.out.print("Índice a entrenar: ");
        int index = sc.nextInt();
        if (index >= 0 && index < lista.size()) {
            Criatura c = lista.get(index);
            // Casteamos a Entrenable para asegurar que tiene el método
            if (c instanceof Entrenable) {
                ((Entrenable) c).entrenar();
            }
        }
    }

    public static void evolucionar() {
        listarCriaturas();
        System.out.print("Índice a evolucionar: ");
        int index = sc.nextInt();
        if (index >= 0 && index < lista.size()) {
            Criatura c = lista.get(index);
            if (c instanceof Evolucionable) {
                Evolucionable evo = (Evolucionable) c;
                if (evo.puedeEvolucionar()) {
                    Criatura nueva = evo.evolucionar();
                    lista.set(index, nueva); // Sustituye en la lista
                    System.out.println("Evolución completada.");
                } else {
                    System.out.println("Aún no tiene nivel suficiente (necesita Nv.8).");
                }
            }
        }
    }

    public static void curar() {
        listarCriaturas();
        System.out.print("Índice a curar: ");
        int index = sc.nextInt();
        if (index >= 0 && index < lista.size()) {
            lista.get(index).curarCompleto();
            System.out.println("Criatura curada.");
        }
    }
}