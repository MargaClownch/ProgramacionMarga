package BaseDeDatos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Operaciones op = new Operaciones();

        List<Asignatura> asignaturas = op.listarAsignaturas();
        asignaturas.forEach(System.out::println);

        // 1. Probar estudiantes de Gryffindor
        op.getEstudiantesPorCasa("Gryffindor");

        // 2. Probar mascota de Hermione Granger
        op.getMascotaDeEstudiante("Hermione", "Granger");

        // 3. Probar estudiantes por casa
        op.getNumeroEstudiantesPorCasa();

        // 4. Crear una asignatura y probar a insertarla (Inventamos una)
        Asignatura moduloFicheros = new Asignatura(0, "Acceso a Datos", "Aula 2.1", true);
        op.insertarAsignatura(moduloFicheros);

        // 5. Probar modificar aula (Cambia el ID por el de la asignatura que acabas de crear)
        op.modificarAulaAsignatura(1, "Aula Maga 3");

        // 6. Eliminar la asignatura
        // op.eliminarAsignatura(1);
    }
}