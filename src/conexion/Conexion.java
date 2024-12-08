
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    String db = "login_java"; 
    String url = "jdbc:mysql://localhost:3306/" + db; 
    String user = "root"; 
    String password = ""; 
    String driver = "com.mysql.cj.jdbc.Driver"; 

    private Connection cx;

    public Connection conectar() {
        try {
            Class.forName(driver); 
            cx = DriverManager.getConnection(url, user, password); 
            System.out.println("Conexión exitosa a la base de datos");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: No se encontró el driver JDBC");
            cx = null;
        } catch (SQLException ex) {
            System.out.println("Error al conectar con la base de datos: " + ex.getMessage());
            cx = null;
        }
        return cx;
    }

    public void desconectar() {
        if (cx != null) {
            try {
                cx.close();
                System.out.println("Conexión cerrada");
            } catch (SQLException ex) {
                System.out.println("Error al cerrar la conexión: " + ex.getMessage());
            }
        }
    }
    
    
    
}


