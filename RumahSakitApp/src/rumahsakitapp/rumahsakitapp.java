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

public class rumahsakitapp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DaftarPasien daftar = new DaftarPasien(100);

        int pilihan;
        do {
            System.out.println("\n==== MENU RUMAH SAKIT ====");
            System.out.println("1. Tambah Data Pasien");
            System.out.println("2. Lihat Semua Data Pasien");
            System.out.println("3. Edit Data Pasien");
            System.out.println("4. Hapus Data Pasien");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Tambah Pasien ---");
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Umur: ");
                    int umur = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Penyakit: ");
                    String penyakit = scanner.nextLine();

                    Pasien pasien = new Pasien(id, nama, umur, penyakit);
                    daftar.tambahPasien(pasien);
                    break;

                case 2:
                    daftar.tampilkanPasien();
                    break;

                case 3:
                    System.out.print("\nMasukkan ID pasien yang ingin diedit: ");
                    int idEdit = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nama Baru: ");
                    String namaBaru = scanner.nextLine();
                    System.out.print("Umur Baru: ");
                    int umurBaru = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Penyakit Baru: ");
                    String penyakitBaru = scanner.nextLine();

                    daftar.editPasien(idEdit, namaBaru, umurBaru, penyakitBaru);
                    break;

                case 4:
                    System.out.print("\nMasukkan ID pasien yang ingin dihapus: ");
                    int idHapus = scanner.nextInt();
                    scanner.nextLine();
                    daftar.hapusPasien(idHapus);
                    break;

                case 5:
                    System.out.println("Terima kasih telah menggunakan aplikasi.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 5);

        scanner.close();
    }
}
