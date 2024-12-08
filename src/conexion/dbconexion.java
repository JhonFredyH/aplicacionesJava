
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbconexion {

    // Configuración de la conexión
    static String url = "jdbc:mysql://localhost:3306/ejerciciojava";
    static String user = "root";
    static String pass = "";

    // Método para establecer la conexión con la base de datos
    public static Connection conectar() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, user, pass); 
            System.out.println("Conectado a la base de datos");
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos:");
            e.printStackTrace();
        }
        return con;
    }
}
