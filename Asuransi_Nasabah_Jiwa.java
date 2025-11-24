/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Asuransi_Nasabah_Jiwa extends Nasabah {
    private double nilaiPertanggungan;

    public Asuransi_Nasabah_Jiwa(String id, String nama, int usia, double nilaiPertanggungan) {
        super(id, nama, usia);
        this.nilaiPertanggungan = nilaiPertanggungan;
    }


    public double getNilaiPertanggungan() { return nilaiPertanggungan; }
    public void setNilaiPertanggungan(double nilaiPertanggungan) { this.nilaiPertanggungan = nilaiPertanggungan; }

    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Nilai Pertanggungan Jiwa : Rp " + nilaiPertanggungan);
    }    
}
