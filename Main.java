/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Serialization;

/**
 *
 * @author DELL
 */
import java.util.Scanner;

public class Main {
    private static final Scanner input = new Scanner(System.in);
    private static CrudMhs dao;

    public static void main(String[] args) {
        dao = new CrudMhs("student.ser");
        int choice = 0;
        do {
            printMenu();
             System.out.print("\nMasukkan menu pilihan anda: \n");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1 -> tambahMahasiswa();
                case 2 -> tampilkanMahasiswa();
                case 3 -> perbaruiMahasiswa();
                case 4 -> hapusMahasiswa();
                case 5 -> {
                    dao.saveMahasiswa();
                    System.out.println("\nData mahasiswa berhasil disimpan.\n");
                    System.out.println("\nTerima kasih!\n");
                }
                default -> System.out.println("\nPilihan tidak valid.\n");
            }
        } while (choice != 5);
    }

    private static void printMenu() {
        System.out.println("\nsilakan pilih :\n");
        System.out.println("1. menambah data mahasiswa");
        System.out.println("2. menampilkan data mahasiswa");
        System.out.println("3. memperbarui data mahasiswa");
        System.out.println("4. menghapus data mahasiswa");
        System.out.println("5. menyimpan data mahasiswa dan keluar");
    }

    private static void tambahMahasiswa() {
        System.out.print("masukkan nama : ");
        String nama = input.nextLine();
        System.out.print("masukkan NIM : ");
        String nim = input.nextLine();
        System.out.print("masukkan kelas praktikum : ");
        String kelas = input.nextLine();
        System.out.print("masukan asal : ");
        String asal = input.nextLine();
        
        DataMhs mhs = new DataMhs(nama, nim, kelas, asal);
        dao.insertMahasiswa(mhs);
        System.out.println("\nData mahasiswi berhasil ditambahkan.");
    }

    private static void tampilkanMahasiswa() {
        dao.printMahasiswa();
    }

    private static void perbaruiMahasiswa() {
        System.out.print("masukkan Nama baru: ");
        String nama = input.nextLine();
        System.out.print("masukkan NIM baru : ");
        String nim = input.nextLine();
        System.out.print("masukkan Kelas baru: ");
        String kelas = input.nextLine();
        System.out.print("masukkan Asal baru: ");
        String asal = input.nextLine();
        

        DataMhs mhs = new DataMhs (nama, nim, kelas, asal);
        dao.updateMahasiswa(mhs);
        System.out.println("\ndata berhasil diupdate.");
    }

    private static void hapusMahasiswa() {
        System.out.print("\nmasukkan nama mahasiswi yang ingin dihapus: ");
        String nama = input.nextLine();

        dao.deleteMahasiswi (nama);
        System.out.println("\nberhasil dihapus.");
    }
}
