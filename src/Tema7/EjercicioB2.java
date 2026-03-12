package Tema7;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class EjercicioB2 {
    public static void main(String[] args) {
        String fileName = "Resources/alumnos_notas.txt";

        try{
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String line;
                String[] datos = br.readLine().split(" ");
                String nombre = datos[0];
                String apellido = datos[1];
                int nota1 = Integer.parseInt(datos[2]);
                int nota2 = Integer.parseInt(datos[3]);
                int nota3 = Integer.parseInt(datos[4]);
                int nota4 = Integer.parseInt(datos[5]);
                int nota5 = Integer.parseInt(datos[6]);
                while ((line=br.readLine()) != null){
                    datos = line.split(" ");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
