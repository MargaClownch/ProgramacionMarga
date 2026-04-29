package BaseDeDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Operaciones {

    public List<Asignatura> listarAsignaturas() {
        List<Asignatura> listaAsignaturas = new ArrayList<>();
        String sql = "SELECT id_asignatura, nombre, aula, obligatoria FROM Asignatura";

        try {
            // Obtenemos la conexión fuera del try-with-resources para NO cerrarla
            Connection conn = ConexionPostgres.getConnection();

            try (PreparedStatement pstmt = conn.prepareStatement(sql);
                 ResultSet rs = pstmt.executeQuery()) {

                while (rs.next()) {
                    listaAsignaturas.add(new Asignatura(
                            rs.getInt("id_asignatura"),
                            rs.getString("nombre"),
                            rs.getString("aula"),
                            rs.getBoolean("obligatoria")
                    ));
                }
                System.out.println(" Se han cargado " + listaAsignaturas.size() + " asignaturas.");
            }
        } catch (SQLException e) {
            System.out.println(" Error al listar asignaturas: " + e.getMessage());
        }
        return listaAsignaturas;
    }

    public void getEstudiantesPorCasa(String nombreCasa) {
        String sql = "SELECT e.nombre, e.apellido FROM Estudiante e JOIN Casa c ON e.id_casa = c.id_casa WHERE c.nombre = ?";

        try {
            Connection conn = ConexionPostgres.getConnection();
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, nombreCasa);

                try (ResultSet rs = pstmt.executeQuery()) {
                    System.out.println("\n--- Estudiantes de la casa " + nombreCasa + " ---");
                    while (rs.next()) {
                        System.out.println("- " + rs.getString("nombre") + " " + rs.getString("apellido"));
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println(" Error al consultar estudiantes: " + e.getMessage());
        }
    }

    public void getMascotaDeEstudiante(String nombre, String apellido) {
        String sql = "SELECT m.nombre, m.especie FROM Mascota m JOIN Estudiante e ON m.id_estudiante = e.id_estudiante WHERE e.nombre = ? AND e.apellido = ?";

        try {
            Connection conn = ConexionPostgres.getConnection();
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, nombre);
                pstmt.setString(2, apellido);

                try (ResultSet rs = pstmt.executeQuery()) {
                    System.out.println("\n--- Mascota de " + nombre + " " + apellido + " ---");
                    if (rs.next()) {
                        System.out.println("🐾 " + rs.getString("nombre") + " (Especie: " + rs.getString("especie") + ")");
                    } else {
                        System.out.println("Este estudiante no tiene mascota registrada.");
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println(" Error al buscar mascota: " + e.getMessage());
        }
    }

    public void getNumeroEstudiantesPorCasa() {
        String sql = "SELECT c.nombre, COUNT(e.id_estudiante) AS total FROM Casa c LEFT JOIN Estudiante e ON c.id_casa = e.id_casa GROUP BY c.nombre";

        try {
            Connection conn = ConexionPostgres.getConnection();
            try (PreparedStatement pstmt = conn.prepareStatement(sql);
                 ResultSet rs = pstmt.executeQuery()) {

                System.out.println("\n--- Número de Estudiantes por Casa ---");
                while (rs.next()) {
                    System.out.println(rs.getString("nombre") + ": " + rs.getInt("total") + " estudiantes.");
                }
            }
        } catch (SQLException e) {
            System.out.println(" Error al contar estudiantes: " + e.getMessage());
        }
    }

    public void insertarAsignatura(Asignatura nuevaAsignatura) {
        String sql = "INSERT INTO Asignatura (nombre, aula, obligatoria) VALUES (?, ?, ?)";

        try {
            Connection conn = ConexionPostgres.getConnection();
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, nuevaAsignatura.getNombre());
                pstmt.setString(2, nuevaAsignatura.getAula());
                pstmt.setBoolean(3, nuevaAsignatura.isObligatoria());

                int filas = pstmt.executeUpdate();
                System.out.println("\n Se ha insertado " + filas + " asignatura correctamente (" + nuevaAsignatura.getNombre() + ").");
            }
        } catch (SQLException e) {
            System.out.println(" Error al insertar asignatura: " + e.getMessage());
        }
    }

    public void modificarAulaAsignatura(int idAsignatura, String nuevaAula) {
        String sql = "UPDATE Asignatura SET aula = ? WHERE id_asignatura = ?";

        try {
            Connection conn = ConexionPostgres.getConnection();
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, nuevaAula);
                pstmt.setInt(2, idAsignatura);

                int filas = pstmt.executeUpdate();
                if (filas > 0) {
                    System.out.println("\n Aula actualizada con éxito para la asignatura ID: " + idAsignatura);
                } else {
                    System.out.println("\n No se ha encontrado ninguna asignatura con el ID: " + idAsignatura);
                }
            }
        } catch (SQLException e) {
            System.out.println(" Error al modificar el aula: " + e.getMessage());
        }
    }

    public void eliminarAsignatura(int idAsignatura) {
        String sql = "DELETE FROM Asignatura WHERE id_asignatura = ?";

        try {
            Connection conn = ConexionPostgres.getConnection();
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setInt(1, idAsignatura);

                int filas = pstmt.executeUpdate();
                if (filas > 0) {
                    System.out.println("\n Asignatura con ID " + idAsignatura + " eliminada correctamente de la BD.");
                } else {
                    System.out.println("\n No se ha encontrado la asignatura con ID: " + idAsignatura);
                }
            }
        } catch (SQLException e) {
            System.out.println(" Error al eliminar la asignatura: " + e.getMessage());
        }
    }
}
