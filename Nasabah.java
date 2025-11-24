/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Nasabah {
    private String idNasabah;
    private String nama;
    private int usia;

    public Nasabah(String idNasabah, String nama, int usia) {
        this.idNasabah = idNasabah;
        this.nama = nama;
        this.usia = usia;
    }

    public String getIdNasabah() { return idNasabah; }
    public void setIdNasabah(String idNasabah) { this.idNasabah = idNasabah; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public int getUsia() { return usia; }
    public void setUsia(int usia) { this.usia = usia; }

    public void tampilkanInfo() {
        System.out.println("ID Nasabah : " + idNasabah);
        System.out.println("Nama       : " + nama);
        System.out.println("Usia       : " + usia);
    }
}
