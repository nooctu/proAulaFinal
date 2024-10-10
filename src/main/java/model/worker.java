/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author JABER
 */
public class worker {
    private String idworker;
    private String nombreworker;
    private String ccworker;
    private String emailworker;

    public worker(String idworker, String nombreworker, String ccworker, String emailworker) {
        this.idworker = idworker;
        this.nombreworker = nombreworker;
        this.ccworker = ccworker;
        this.emailworker = emailworker;
    }

    public String getIdworker() {
        return idworker;
    }

    public void setIdworker(String idworker) {
        this.idworker = idworker;
    }

    public String getNombreworker() {
        return nombreworker;
    }

    public void setNombreworker(String nombreworker) {
        this.nombreworker = nombreworker;
    }

    public String getCcworker() {
        return ccworker;
    }

    public void setCcworker(String ccworker) {
        this.ccworker = ccworker;
    }

    public String getEmailworker() {
        return emailworker;
    }

    public void setEmailworker(String emailworker) {
        this.emailworker = emailworker;
    }
  
    
    
}






