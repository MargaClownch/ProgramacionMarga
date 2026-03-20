package Tema7;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EjercicioB3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName;
        String fileNameOutput;
        ArrayList<String> listaDocumento = new ArrayList<>();

        System.out.println("Ingrese el nombre del archivo que quiere ordenar:");
        fileName = sc.nextLine();
        System.out.println("Ingrese el nombre del archivo de guardado:");
        fileNameOutput = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                listaDocumento.add(line);
            }
            //He encontrado esta línea de código en internet, no sé sí te molesta que la use :)
            Collections.sort(listaDocumento);

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            return;
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileNameOutput))) {
            for (String lineaOrdenada : listaDocumento) {
                bw.write(lineaOrdenada);
                bw.newLine();
            }
            System.out.println("Archivo ordenado y guardado correctamente en " + fileNameOutput);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }
}