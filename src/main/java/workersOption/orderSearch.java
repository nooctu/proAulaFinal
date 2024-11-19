/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workersOption;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.db_connection;


/**
 *
 * @author JABER
 */
public class orderSearch {
     public boolean accesoOrder(String id) {
        db_connection db = new db_connection();
        boolean accesoCorrecto = false;

        try {
            Connection cn = db.conectar();
            String sql = "SELECT idOrder FROM orders WHERE idOrder = ?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1,id);
            
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                accesoCorrecto = true;
                
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        return accesoCorrecto;
    }
}

