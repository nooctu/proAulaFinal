/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
/**
 *
 * @author JABER
 */
public class workerDAO {
   /* public List<worker> obtenerWorker(){
        List<worker> workers = new ArrayList<>();
        String sql = "SELECT idworker, nombreworker, ccworker, emailworker";
        
         try (Connection con = db_connection.conectar();
             PreparedStatement pstmt = con.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                String idworker = rs.getString("idworker");
                String nombreworker = rs.getString("nombreworker");
                String ccworker = rs.getString("ccwroker");
                String emailworker = rs.getString("emailworker");

                worker Worker = new worker (idworker, nombreworker, ccworker, emailworker);
                workers.add(Worker);
            }

        } catch (SQLException e) {
            System.err.println("Error al obtener worker: " + e.getMessage());
        }
        
        
        
        return workers;
    }
*/
    //METODO CONTRATAR TRABAJADOR
    public void contratarWorker(String idworker, String nombreworker, String ccworker, String emailworker) {
   

    String sql = "INSERT INTO workersp (idworker, nombreworker, ccworker, emailworker, ) VALUES (?, ?, ?, ?)";

    try (Connection con = db_connection.conectar();
         PreparedStatement pstmt = con.prepareStatement(sql)) {

        pstmt.setString(1, idworker);
        pstmt.setString(2, nombreworker);
        pstmt.setString(3, ccworker);
        pstmt.setString(4, emailworker);

        pstmt.executeUpdate();
        System.out.println("Worker insert sucessfull");
        
    } catch (SQLException e) {
        System.err.println("Error the insert worker " + e.getMessage());
    }
    /*public void deleteWorker(String id_worker) {
        String sql = "DELETE FROM workersp WHERE idworker = ?";

        try (Connection con = db_connection.conectar();
             PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setString(1, id_worker);
            int affectedRows = pstmt.executeUpdate();

            if (affectedRows > 0) {
                System.out.println("Worker eliminado con éxito.");
            } else {
                System.out.println("No se encontró el worker con código: " + id_worker);
            }

        } catch (SQLException e) {
            System.err.println("Error al eliminar profesor: " + e.getMessage());
        }
    }
  */
    
}


   
    
}
