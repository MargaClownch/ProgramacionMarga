package Tema7.Serializacion;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();

        //No hay true al final asi que reescribirá el archivo cada vez
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Resources/usuario.txt"))) {

            bw.write("Nombre: " + nombre);
            bw.newLine();

            bw.write("Edad: " + edad);
            bw.newLine();

            System.out.println("Datos guardados correctamente en 'usuario.txt'");

        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
