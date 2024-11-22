package connections;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class db_connection {
    
    private static Connection con = null;
    
    
    private static final String url = "jdbc:mysql://localhost:3306/loginpro?characterEncoding=utf8";
    private static final String user = "root"; // Ajusta según el usuario de tu BD
    private static final String pass = "";     // Ajusta según la contraseña de tu BD

    public static Connection conectar() {
        Connection con = null; 
        try {
            con = DriverManager.getConnection(url,user,pass);
            System.out.println("Conexion establecida con exito.");
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexion: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }
}

