package Tema7;
import java.io.*;
import java.util.ArrayList;

public class EjercicioB2 {
    public static void main(String[] args) {
        String fileName = "Resources/alumnos_notas.txt";
        ArrayList<AlumnoB2> listaAlumnos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] datos = line.split(" ");

                if (datos.length >= 2) {
                    String nombre = datos[0];
                    String apellido = datos[1];
                    ArrayList<Double> notas = new ArrayList<>();

                    for (int i = 2; i < datos.length; i++) {
                        try {
                            notas.add(Double.parseDouble(datos[i]));
                        } catch (NumberFormatException e) {
                            System.out.println("Error: " + datos[i] + " no es una nota válida para " + nombre);
                        }
                    }

                    double suma = 0;
                    for (Double nota : notas) {
                        suma += nota;
                    }

                    double media = 0;
                    if (notas.size() > 0) {
                        media = suma / notas.size();
                    }

                    AlumnoB2 nuevoAlumno = new AlumnoB2(nombre, apellido, media);
                    listaAlumnos.add(nuevoAlumno);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        listaAlumnos.sort((a1, a2) -> Double.compare(a2.getMedia(), a1.getMedia()));

        System.out.println("Nota media de los alumnos: ");
        for (AlumnoB2 al : listaAlumnos) {
            System.out.println("---------------------------------------");
            System.out.printf("Alumn@: %s %s | Media: %.2f\n", al.getNombre(), al.getApellido(), al.getMedia());
            System.out.println("---------------------------------------");
        }
    }
}