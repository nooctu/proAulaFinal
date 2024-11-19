/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainClintAP;
import clientOP.Drinks; 


/**
 *
 * @author kenie
 */
public class ClientP1 {
    public static Drinks frm_rp;
    public static controller.RegisterProduct c_frm_rp;
    public static void main (String [] args ) { 
        
        frm_rp=new Drinks();
        frm_rp.setVisible (true);
        frm_rp.setLocationRelativeTo(null);
        c_frm_rp = new controller.RegisterProduct (frm_rp);
                
    }
    
}
