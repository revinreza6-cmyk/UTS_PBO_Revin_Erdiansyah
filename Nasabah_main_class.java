/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Nasabah_main_class {
    static ArrayList<Nasabah_Polis> dataPolis = new ArrayList<>();
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int pilih;

        do {
            System.out.println("\n=== APLIKASI ASURANSI NASABAH ===");
            System.out.println("1. Tambah Data Polis");
            System.out.println("2. Tampilkan Semua Polis");
            System.out.println("3. Cari Polis");
            System.out.println("4. Ubah Status Polis");
            System.out.println("5. Cek Status Polis");
            System.out.println("6. Keluar");
            System.out.print("Pilih: ");
            pilih = in.nextInt();
            in.nextLine();

            switch (pilih) {
                case 1 : tambahPolis();
                case 2 : tampilkanSemua();
                case 3 : cariPolis();
                case 4 : ubahStatus();
                case 5 : cekStatus();
                case 6 : System.out.println("Program selesai.");
            }

        } while (pilih != 6); 
    }

    // 1. Tambah Polis
    public static void tambahPolis() {
        System.out.print("ID Nasabah: ");
        String idN = in.nextLine();
        System.out.print("Nama: ");
        String nama = in.nextLine();
        System.out.print("Usia: ");
        int usia = in.nextInt(); in.nextLine();

        System.out.println("Jenis Nasabah:");
        System.out.println("1. Kesehatan");
        System.out.println("2. Jiwa");
        System.out.print("Pilih: ");
        int jenis = in.nextInt(); in.nextLine();

        Nasabah n;

        if (jenis == 1) {
            System.out.print("Jenis Perlindungan: ");
            String perl = in.nextLine();
            n = new Asuransi_Nasabah_Kesehatan(idN, nama, usia, perl);
        } else {
            System.out.print("Nilai Pertanggungan: ");
            double nilai = in.nextDouble(); in.nextLine();
            n = new Asuransi_Nasabah_Jiwa(idN, nama, usia, nilai);
        }

        System.out.print("ID Polis: ");
        String idP = in.nextLine();

        dataPolis.add(new Nasabah_Polis(idP, n, "Aktif"));
        System.out.println("Polis berhasil ditambahkan!");
    }

    // 2. Tampilkan Semua Polis
    public static void tampilkanSemua() {
        if (dataPolis.isEmpty()) {
            System.out.println("Belum ada data.");
            return;
        }

        for (Nasabah_Polis p : dataPolis) {
            p.tampilkanPolis();
            System.out.println("-----------------");
        }
    }

    // 3. Cari Polis
    public static void cariPolis() {
        System.out.print("Masukkan ID Polis: ");
        String id = in.nextLine();

        for (Nasabah_Polis p : dataPolis) {
            if (p.getIdPolis().equals(id)) {
                p.tampilkanPolis();
                return;
            }
        }

        System.out.println("Polis tidak ditemukan!");
    }

    // 4. Ubah Status Polis
    public static void ubahStatus() {
        System.out.print("Masukkan ID Polis: ");
        String id = in.nextLine();

        for (Nasabah_Polis p : dataPolis) {
            if (p.getIdPolis().equals(id)) {
                System.out.print("Status baru: ");
                String s = in.nextLine();
                p.setStatus(s);
                System.out.println("Status berhasil diubah!");
                return;
            }
        }

        System.out.println("Polis tidak ditemukan!");
    }

    // 5. Cek Status Polis
    public static void cekStatus() {
        System.out.print("Masukkan ID Polis: ");
        String id = in.nextLine();

        for (Nasabah_Polis p : dataPolis) {
            if (p.getIdPolis().equals(id)) {
                System.out.println("Status Polis: " + p.getStatus());
                return;
            }
        }

        System.out.println("Polis tidak ditemukan!");
        
    
    }
    
}
