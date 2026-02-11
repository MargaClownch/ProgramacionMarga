package Tema5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tema5Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Gato> listaGatos = new ArrayList<>();

        System.out.println("--- GATOS MANAGER ---");
        System.out.println("Necesito que introduzcas 5 gatos válidos.");

        // Bucle hasta tener 5 gatos
        while (listaGatos.size() < 5) {
            System.out.println("Introduciendo Gato número " + (listaGatos.size() + 1) + ":");

            try {
                System.out.print("Nombre: ");
                String nombre = sc.next();

                System.out.print("Edad: ");
                int edad = sc.nextInt();

                Gato nuevoGato = new Gato(nombre, edad);

                listaGatos.add(nuevoGato);
                System.out.println("¡Gato guardado correctamente!");
                System.out.println("---Separador---");
            } catch (InputMismatchException e) {
                System.out.println("Error: La edad debe ser un número entero.");
                sc.next();
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Error en general: " + e.getMessage());
                e.printStackTrace();
            }
        }
        System.out.println("Lista de gatos guardados: ");
        for (Gato g : listaGatos) {
            g.imprimir();
        }
    }
}