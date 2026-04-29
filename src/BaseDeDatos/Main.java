package BaseDeDatos;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Operaciones op = new Operaciones();

        List<Asignatura> asignaturas = op.listarAsignaturas();
        asignaturas.forEach(System.out::println);

        op.getEstudiantesPorCasa("Gryffindor");

        op.getMascotaDeEstudiante("Hermione", "Granger");

        op.getNumeroEstudiantesPorCasa();

        Asignatura moduloFicheros = new Asignatura(0, "Acceso a Datos", "Aula 2.1", true);
        op.insertarAsignatura(moduloFicheros);

        op.modificarAulaAsignatura(17, "Aula Maga 3");

        System.out.println("\n--- Finalizando programa ---");
        ConexionPostgres.closeConnection();
    }
}