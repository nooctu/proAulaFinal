/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clientOP;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import model.db_productConnection;

/**
 *
 * @author kenie
 */
public class ListProducts {
    db_productConnection con =new db_productConnection();
    Connection cn = con.conectar();
    
    public static void main (String[] args ) {
       // Crear el JFrame principal
        JFrame frame = new JFrame("List of products");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Crear el JTable y agregarlo dentro de un JScrollPane
        JTable table = new JTable();
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);

        // Llamar al método para mostrar los datos
        showTable(table);

        // Mostrar el JFrame
        frame.setVisible(true);
    }

    // Método para mostrar los datos de la tabla
    public static void showTable(JTable table) {
        // Modelo de tabla
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Amount");
        model.addColumn("Price");
        model.addColumn("Total");

        // Configuración de la conexión
        String url = "jdbc:mysql://localhost:3306/loginpro?characterEncoding=utf8";
        String user = "root";
        String password = "";
        String query = "SELECT * FROM productsp";

        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query)) {

            // Iterar sobre los resultados
            while (rs.next()) {
                Object[] row = new Object[5];
                row[0] = rs.getInt(1); // ID
                row[1] = rs.getString(2); // Name
                row[2] = rs.getInt(3); // Amount
                row[3] = rs.getDouble(4); // Price
                row[4] = rs.getDouble(5); // Total

                model.addRow(row); // Agregar fila al modelo
            }

            table.setModel(model); // Asignar el modelo a la tabla
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error to conect with the data base: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

