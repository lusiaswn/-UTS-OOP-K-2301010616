/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rumahsakitapp;

/**
 *
 * @author Lusia Merry Mater Dolorosa Sawu
 * TGL 24 MEI2005
 */
import java.util.Scanner;

public class DaftarPasien {
    private Pasien[] daftarPasien;
    private int jumlahPasien;

    public DaftarPasien(int kapasitas) {
        daftarPasien = new Pasien[kapasitas];
        jumlahPasien = 0;
    }

    public void tambahPasien(Pasien pasien) {
        if (jumlahPasien < daftarPasien.length) {
            daftarPasien[jumlahPasien] = pasien;
            jumlahPasien++;
            System.out.println("Pasien berhasil ditambahkan.");
        } else {
            System.out.println("Kapasitas penuh. Tidak bisa menambahkan pasien.");
        }
    }

    public void tampilkanPasien() {
        if (jumlahPasien == 0) {
            System.out.println("Belum ada data pasien.");
        } else {
            for (int i = 0; i < jumlahPasien; i++) {
                if (daftarPasien[i] != null) {
                    daftarPasien[i].tampilkan();
                }
            }
        }
    }

    public void editPasien(int id, String nama, int umur, String penyakit) {
        for (int i = 0; i < jumlahPasien; i++) {
            if (daftarPasien[i] != null && daftarPasien[i].getId() == id) {
                daftarPasien[i].setNama(nama);
                daftarPasien[i].setUmur(umur);
                daftarPasien[i].setPenyakit(penyakit);
                System.out.println("Data pasien berhasil diperbarui.");
                return;
            }
        }
        System.out.println("Pasien dengan ID tersebut tidak ditemukan.");
    }

    public void hapusPasien(int id) {
        for (int i = 0; i < jumlahPasien; i++) {
            if (daftarPasien[i] != null && daftarPasien[i].getId() == id) {
                // geser ke kiri
                for (int j = i; j < jumlahPasien - 1; j++) {
                    daftarPasien[j] = daftarPasien[j + 1];
                }
                daftarPasien[jumlahPasien - 1] = null;
                jumlahPasien--;
                System.out.println("Pasien berhasil dihapus.");
                return;
            }
        }
        System.out.println("Pasien dengan ID tersebut tidak ditemukan.");
    }
}
