/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clientOP;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.db_ordersConnection;
import model.db_productConnectionfood;
import model.foodSearch;



/**
 *
 * @author kenie
 */
public class Food extends javax.swing.JFrame {
    

    /**
     * Creates new form Drinks
     */
    public Food() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        drinks = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        sopa = new javax.swing.JButton();
        doritos = new javax.swing.JButton();
        bandeja = new javax.swing.JButton();
        detodito = new javax.swing.JButton();
        golpeC = new javax.swing.JButton();
        arrozConHuevo = new javax.swing.JButton();
        onlySopa = new javax.swing.JButton();
        arroz = new javax.swing.JButton();
        papasFritas = new javax.swing.JButton();
        tablaconfi = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableproducts = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nameProduct = new javax.swing.JTextField();
        amountProduct = new javax.swing.JTextField();
        priceProduct = new javax.swing.JTextField();
        idProduct = new javax.swing.JTextField();
        btnconfirm = new javax.swing.JButton();
        cancelPRO = new javax.swing.JButton();
        UPDATE = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Back2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        drinks.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        jLabel1.setText("CHOOSE ONE OR MORE FOODS!");

        sopa.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        sopa.setText("SOPA Y SECO / 10000");
        sopa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sopaActionPerformed(evt);
            }
        });

        doritos.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        doritos.setText("DORITOS / 2300");
        doritos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doritosActionPerformed(evt);
            }
        });

        bandeja.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        bandeja.setText("BANDEJA PAISA / 32000");
        bandeja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bandejaActionPerformed(evt);
            }
        });

        detodito.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        detodito.setText("DETODITO / 2000");
        detodito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detoditoActionPerformed(evt);
            }
        });

        golpeC.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        golpeC.setText("GOLPE / 2300");
        golpeC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                golpeCActionPerformed(evt);
            }
        });

        arrozConHuevo.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        arrozConHuevo.setText("ARROZ CON HUEVO / 12000");
        arrozConHuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrozConHuevoActionPerformed(evt);
            }
        });

        onlySopa.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        onlySopa.setText("SOPA / 8000");
        onlySopa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onlySopaActionPerformed(evt);
            }
        });

        arroz.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        arroz.setText("PORCIÓN ARROZ / 5000");
        arroz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrozActionPerformed(evt);
            }
        });

        papasFritas.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        papasFritas.setText("PORCIÓN PAPAS FRITAS / 4000");
        papasFritas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                papasFritasActionPerformed(evt);
            }
        });

        tablaconfi.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        jLabel2.setText("Do your list, can you choose more than 1.");

        tableproducts.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        tableproducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "AMOUNT", "PRICE"
            }
        ));
        jScrollPane2.setViewportView(tableproducts);

        javax.swing.GroupLayout tablaconfiLayout = new javax.swing.GroupLayout(tablaconfi);
        tablaconfi.setLayout(tablaconfiLayout);
        tablaconfiLayout.setHorizontalGroup(
            tablaconfiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablaconfiLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(157, 157, 157))
            .addGroup(tablaconfiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tablaconfiLayout.setVerticalGroup(
            tablaconfiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablaconfiLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        nameProduct.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        nameProduct.setText(" ");

        amountProduct.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        amountProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountProductActionPerformed(evt);
            }
        });

        priceProduct.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N

        idProduct.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        idProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idProductActionPerformed(evt);
            }
        });

        btnconfirm.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        btnconfirm.setText("CONFIRM");
        btnconfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfirmActionPerformed(evt);
            }
        });

        cancelPRO.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        cancelPRO.setText("CANCEL");
        cancelPRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelPROActionPerformed(evt);
            }
        });

        UPDATE.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        UPDATE.setText("UPDATE");
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel4.setText("ID:");

        jLabel5.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel5.setText("NAME:");

        jLabel6.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel6.setText("AMOUNT:");

        jLabel7.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel7.setText("PRICE:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(nameProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(amountProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(priceProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnconfirm)
                        .addGap(45, 45, 45)
                        .addComponent(UPDATE)
                        .addGap(45, 45, 45)
                        .addComponent(cancelPRO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(idProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(amountProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(priceProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnconfirm)
                            .addComponent(UPDATE)
                            .addComponent(cancelPRO))
                        .addGap(34, 34, 34))))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(detodito, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(golpeC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bandeja, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(sopa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(doritos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(arrozConHuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(arroz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(onlySopa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(papasFritas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addComponent(tablaconfi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tablaconfi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(79, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bandeja)
                            .addComponent(arrozConHuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(onlySopa)
                            .addComponent(sopa))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(doritos)
                            .addComponent(arroz))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(detodito)
                            .addComponent(papasFritas))
                        .addGap(18, 18, 18)
                        .addComponent(golpeC)
                        .addGap(58, 58, 58))))
        );

        Back2.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        Back2.setText("BACK");
        Back2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout drinksLayout = new javax.swing.GroupLayout(drinks);
        drinks.setLayout(drinksLayout);
        drinksLayout.setHorizontalGroup(
            drinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drinksLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(drinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(drinksLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Back2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        drinksLayout.setVerticalGroup(
            drinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drinksLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(drinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Back2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(drinks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(drinks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void arrozConHuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrozConHuevoActionPerformed
        // TODO add your handling code here:
        
        idProduct.setText("7411");
        nameProduct.setText("Arroz con huevo");
        amountProduct.setText("1");
        priceProduct.setText("12000");
    }//GEN-LAST:event_arrozConHuevoActionPerformed

    private void golpeCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_golpeCActionPerformed
        // TODO add your handling code here:
        
        idProduct.setText("6898");
        nameProduct.setText("Golpe con todo");
        amountProduct.setText("1");
        priceProduct.setText("2300");
    }//GEN-LAST:event_golpeCActionPerformed

    private void btnconfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfirmActionPerformed
        // TODO add your handling code here:
            
        String idToRow = idProduct.getText();
        String nameToRow = nameProduct.getText();
        String amountToRow = amountProduct.getText();
        String priceToRow = priceProduct.getText();
                
        foodSearch ps = new foodSearch();
        boolean busquedaExitosa = ps.findProduct(nameToRow, priceToRow);
        
        if (busquedaExitosa) {
                    
            int rowsDispo = tableproducts.getRowCount();
            int z = -1;
        
            for (int i = 0; i < rowsDispo; i++) {
                if(tableproducts.getValueAt(i, 0) == null){
                z = i;  
                break;
                }
            }
        
            tableproducts.setValueAt(idToRow, z, 0);
        
            for (int x = 1; x < 4; x++) {
        
                tableproducts.setValueAt(nameToRow, z, x);
            }
        
            for (int g = 2; g < 4; g++) {
                  
                tableproducts.setValueAt(amountToRow, z, g);
            }
        
            for (int f = 3; f < 4; f++) {   
                tableproducts.setValueAt(priceToRow, z, f);
            
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Inexistent product");
        }
        
        String collect = amountProduct.getText().trim();
        String collectName = nameProduct.getText().trim();
        int substract = Integer.parseInt(collect);
                
        db_productConnectionfood db = new db_productConnectionfood();
        
        try {
            Connection cn = db.conectar();

            String consult = "SELECT cantidadProducto, nombreProducto FROM productspfood WHERE nombreProducto = ?";
            PreparedStatement pstConsulta = cn.prepareStatement(consult);
            pstConsulta.setString(1, collectName);
            ResultSet rs = pstConsulta.executeQuery();

        if (rs.next()) {
            int stockActual = rs.getInt("cantidadProducto");
            if (stockActual > substract) {
                // Realizar la resta
                String sql = "UPDATE productspfood SET cantidadProducto = cantidadProducto - ? WHERE nombreProducto = ?";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setInt(1, substract);
                pst.setString(2, collectName);

                int filasAfectadas = pst.executeUpdate();
                if (filasAfectadas > 0) {
                    JOptionPane.showMessageDialog(null, "Amount substracted successfully. Thanks for buying with us");
                } else {
                    JOptionPane.showMessageDialog(null, "An error ocurred.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "This product doesn't have enough stock to sell it.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Inexistent Product.");
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error: " + e);
    }
        
    String getPrice = priceProduct.getText();
    int priceToOrder = Integer.parseInt(getPrice);
    
    String getAmount = amountProduct.getText();
    int amountToOrder = Integer.parseInt(getAmount);
        
    db_ordersConnection db2 = new db_ordersConnection();
        Connection cn = db2.conectar();
        
                if (cn != null) {
            try {
            
                String sql = "INSERT INTO orders (nameproducts, amount, totalpay, idOrder) VALUES (?, ?, ?, ?)";
                PreparedStatement pst = cn.prepareStatement(sql);
                
                // Establecer los valores en la consulta
                pst.setString(1, nameToRow);
                pst.setString(2, amountToRow);
                pst.setInt(3, priceToOrder * amountToOrder);
                pst.setString(4, idToRow);

                // Ejecutar la consulta
                                                    
                int rowsInserted = pst.executeUpdate();
                if (rowsInserted > 0) {
                    JOptionPane.showMessageDialog(null, "Succesful Registration!");
                }
                

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error to register data: " + e);
            }
        } else {
        JOptionPane.showMessageDialog(null, "Error de conexión a la base de datos");
    }
    }//GEN-LAST:event_btnconfirmActionPerformed

    private void Back2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back2ActionPerformed
        // TODO add your handling code here:
         BuyProduct access = new BuyProduct();
        access.setVisible(true);

        this.dispose();
        
    }//GEN-LAST:event_Back2ActionPerformed

    private void sopaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sopaActionPerformed
        // TODO add your handling code here:
        idProduct.setText("4121");
        nameProduct.setText("Sopa y seco");
        amountProduct.setText("1");
        priceProduct.setText("10000");
    }//GEN-LAST:event_sopaActionPerformed

    private void idProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idProductActionPerformed

    private void amountProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountProductActionPerformed

    private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed
        // TODO add your handling code here:
        idProduct.setText("");
        nameProduct.setText("");
        amountProduct.setText("");
        priceProduct.setText("");
    }//GEN-LAST:event_UPDATEActionPerformed

    private void bandejaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bandejaActionPerformed
        // TODO add your handling code here:
        
        idProduct.setText("7454");
        nameProduct.setText("Bandeja Paisa");
        amountProduct.setText("1");
        priceProduct.setText("32000");
    }//GEN-LAST:event_bandejaActionPerformed

    private void onlySopaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onlySopaActionPerformed
        // TODO add your handling code here:
        
        idProduct.setText("7412");
        nameProduct.setText("Sopa");
        amountProduct.setText("1");
        priceProduct.setText("8000");
    }//GEN-LAST:event_onlySopaActionPerformed

    private void doritosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doritosActionPerformed
        // TODO add your handling code here:
        
        idProduct.setText("6847");
        nameProduct.setText("Doritos");
        amountProduct.setText("1");
        priceProduct.setText("2300");
    }//GEN-LAST:event_doritosActionPerformed

    private void arrozActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrozActionPerformed
        // TODO add your handling code here:
        
        idProduct.setText("9512");
        nameProduct.setText("Porción arroz");
        amountProduct.setText("1");
        priceProduct.setText("5000");
    }//GEN-LAST:event_arrozActionPerformed

    private void detoditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detoditoActionPerformed
        // TODO add your handling code here:
        
        idProduct.setText("1234");
        nameProduct.setText("Detodito");
        amountProduct.setText("1");
        priceProduct.setText("2000");
    }//GEN-LAST:event_detoditoActionPerformed

    private void papasFritasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_papasFritasActionPerformed
        // TODO add your handling code here:
        
        idProduct.setText("1451");
        nameProduct.setText("Papas fritas");
        amountProduct.setText("1");
        priceProduct.setText("4000");
    }//GEN-LAST:event_papasFritasActionPerformed

    private void cancelPROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelPROActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelPROActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Food().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back2;
    private javax.swing.JButton UPDATE;
    public javax.swing.JTextField amountProduct;
    private javax.swing.JButton arroz;
    private javax.swing.JButton arrozConHuevo;
    private javax.swing.JButton bandeja;
    public javax.swing.JButton btnconfirm;
    public javax.swing.JButton cancelPRO;
    private javax.swing.JButton detodito;
    private javax.swing.JButton doritos;
    private javax.swing.JPanel drinks;
    private javax.swing.JButton golpeC;
    public javax.swing.JTextField idProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTextField nameProduct;
    private javax.swing.JButton onlySopa;
    private javax.swing.JButton papasFritas;
    public javax.swing.JTextField priceProduct;
    private javax.swing.JButton sopa;
    private javax.swing.JPanel tablaconfi;
    public javax.swing.JTable tableproducts;
    // End of variables declaration//GEN-END:variables
}


