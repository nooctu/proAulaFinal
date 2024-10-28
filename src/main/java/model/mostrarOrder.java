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
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author JABER
 */
public class mostrarOrder {
    
    public void obtenerinfoOrder(String idOrder,JTextField txtBuyer, JTextField txtnamepro,JTextField txtamount,JTextField txttotalpay){
    db_connection objetoConexion = new db_connection();
    String sql = "SELECT buyer, nameproducts, amount, totalpay FROM orders WHERE idOrder = ?";

    try (Connection conexion = objetoConexion.conectar();
         PreparedStatement pstmt = conexion.prepareStatement(sql)) {

        pstmt.setString(1, idOrder);  // Asignamos el ID o la identificación del cliente
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            // Asignamos los valores obtenidos a los JTextFields correspondientes
            txtBuyer.setText(rs.getString("buyer"));
            txtnamepro.setText(rs.getString("nameproducts"));
            txtamount.setText(rs.getString("amount"));
            txttotalpay.setText(rs.getString("totalpay"));
        } else {
            JOptionPane.showMessageDialog(null, "ID NO ENCONTRADA");
        }

    }catch (SQLException e){
          JOptionPane.showMessageDialog(null, "Error al obtener la información del order: " + e.getMessage()); 
          
          }
}
}
