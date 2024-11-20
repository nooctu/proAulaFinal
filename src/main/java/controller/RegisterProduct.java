/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import clientOP.Drinks;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import clientOP.ListProducts;


/**
 *
 * @author kenie
 */
public class RegisterProduct implements ActionListener {
    Drinks frm_rp;

    public RegisterProduct(Drinks frm_rp) {
        this.frm_rp = frm_rp;
        this.frm_rp.btnconfirm.addActionListener (this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==frm_rp.btnconfirm) {
            ListProducts lp = new ListProducts ();
            lp.showTable (frm_rp.tableproducts);
            
        cleanAll1 ();
    }
        
    }

    private void cleanAll1() {
        frm_rp.nameProduct.setText("");
        frm_rp.amountProduct.setText("");
        frm_rp.priceProduct.setText ("");
    }
    
    
}
