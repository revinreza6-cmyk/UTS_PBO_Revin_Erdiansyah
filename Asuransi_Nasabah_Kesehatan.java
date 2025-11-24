/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Asuransi_Nasabah_Kesehatan extends Nasabah {
    private String perlindungan;

    public Asuransi_Nasabah_Kesehatan(String id, String nama, int usia, String perlindungan) {
        super(id, nama, usia);
        this.perlindungan = perlindungan;
    }

    public String getPerlindungan() { return perlindungan; }
    public void setPerlindungan(String perlindungan) { this.perlindungan = perlindungan; }

    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Perlindungan Kesehatan : " + perlindungan);
    }    
}
