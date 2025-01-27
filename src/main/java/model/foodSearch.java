package model;

import connections.db_productConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class foodSearch {

    /**
     *
     * @param nameprod
     * @param typeprod
     * @param precioprod
     * @param cantidadprod
     * @return
     */
    public boolean findProduct(String nameprod, String precioprod) {
        db_productConnection db = new db_productConnection();
        boolean accesoCorrecto = false;

        try {
            Connection cn = db.conectar();
            String sql = "SELECT nombreProducto, precioProducto FROM productspfood WHERE nombreProducto = ? AND precioProducto = ?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, nameprod);
            pst.setString(2, precioprod);
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
