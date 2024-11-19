/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workersOption;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author JABER
 */
public class dispatchOrder {
  private Connection conn;
    
    public dispatchOrder() {
        // Initialize database connection
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginpro?characterEncoding=utf8", "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
      
    public boolean dispatchOrderById(String orderId) {
        String sql = "DELETE FROM orders WHERE idOrder = ?";
        
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, orderId);
            int affectedRows = pstmt.executeUpdate();
                
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
