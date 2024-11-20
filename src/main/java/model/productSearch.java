package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class productSearch {

    /**
     *
     * @param nameprod
     * @param typeprod
     * @param precioprod
     * @param cantidadprod
     * @return
     */
    public boolean findProduct(String nameprod, String typeprod, String precioprod, String cantidadprod) {
        db_productConnection db = new db_productConnection();
        boolean accesoCorrecto = false;

        try {
            Connection cn = db.conectar();
            String sql = "SELECT nombreproducto, tipoproducto, precioproducto, cantidadproducto FROM productsp WHERE nombreproducto = ? AND tipoproducto = ? AND precioproducto = ? AND cantidadproducto = ?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, nameprod);
            pst.setString(2, typeprod);
            pst.setString(3, precioprod);
            pst.setString(4, cantidadprod);
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