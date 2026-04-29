package BaseDeDatos;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConexionPostgres {

    private static Connection connection = null;

    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            try {
                // 1. Cargamos las propiedades desde el fichero externo
                Properties props = new Properties();
                props.load(new FileInputStream("src/BaseDeDatos/db.properties"));

                String url = props.getProperty("db.url");
                String user = props.getProperty("db.user");
                String pass = props.getProperty("db.password");

                // 2. Establecemos la conexión usando el driver JDBC [cite: 184]
                connection = DriverManager.getConnection(url, user, pass);
                System.out.println("✅ Conexión exitosa a la base de datos Hogwarts en AWS.");

            } catch (IOException e) {
                System.err.println("❌ Error al leer el archivo de propiedades: " + e.getMessage());
            } catch (SQLException e) {
                System.err.println("❌ Error al conectar con la base de datos: " + e.getMessage());
            }
        }
        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                connection = null;
                System.out.println("🔌 Conexión cerrada.");
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
}