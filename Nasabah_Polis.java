/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Nasabah_Polis {
    private String idPolis;
    private Nasabah nasabah; 
    private String status;

    public Nasabah_Polis(String idPolis, Nasabah nasabah, String status) {
        this.idPolis = idPolis;
        this.nasabah = nasabah;
        this.status = status;
    }

    public String getIdPolis() { return idPolis; }
    public Nasabah getNasabah() { return nasabah; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public void tampilkanPolis() {
        System.out.println("=== DATA POLIS ===");
        System.out.println("ID Polis : " + idPolis);
        System.out.println("Status   : " + status);
        System.out.println("--- Data Nasabah ---");
        nasabah.tampilkanInfo();
    }    
}
