package model;

import connections.db_productConnectionsweet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class sweetSearch {

    /**
     *
     * @param nameprod
     * @param typeprod
     * @param precioprod
     * @param cantidadprod
     * @return
     */
    public boolean findProduct(String nameprod, String precioprod) {
        db_productConnectionsweet db = new db_productConnectionsweet();
        boolean accesoCorrecto = false;

        try {
            Connection cn = db.conectar();
            String sql = "SELECT nombreProducto, precioProducto FROM productspsweets WHERE nombreProducto = ? AND precioProducto = ?";
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
