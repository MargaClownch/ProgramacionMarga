package Tema7;
import java.io.*;

public class EjercicioB1 {
    public static void main(String[] args) {
        String fileName = "Resources/numeros.txt";

        try {
           try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String line;
                int max = 0;
                int min = 999999999;
                while((line = br.readLine()) != null) {
                    if (Integer.parseInt(line) > max) {
                        max = Integer.parseInt(line);
                    }
                    if (Integer.parseInt(line) < min) {
                        min = Integer.parseInt(line);
                    }
                }
               System.out.println("El número más grande es: " + max);
               System.out.println("El número más pequeño es: " + min);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
