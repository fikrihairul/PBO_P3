package com.mycompany.pbo3;
import java.util.Scanner;
/*@author Fikri*/
public class Soal4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Membaca jumlah penjualan bulan ini
        int totalPenjualan = scanner.nextInt();
        // Gaji pokok per bulan
        int gajiPokok = 500000;
        // Harga setiap item
        int hargaItem = 50000;
        // Inisialisasi bonus
        double bonus = 0.0;
        // Menghitung bonus berdasarkan jumlah penjualan
        if (totalPenjualan >= 40 && totalPenjualan <= 80) {
            // Bonus 25% untuk penjualan 40-80 item
            bonus = 0.25 * totalPenjualan * hargaItem;
        } else if (totalPenjualan > 80) {
            // Bonus 35% untuk penjualan di atas 80 item
            bonus = 0.35 * totalPenjualan * hargaItem;
        } else if (totalPenjualan < 15) {
            // Denda pemotongan gaji pokok 15% jika penjualan kurang dari 15 item
            gajiPokok -= 0.15 * (15 - totalPenjualan) * hargaItem;
        } else {
            // Bonus 10% untuk penjualan di bawah 40 item
            bonus = 0.10 * totalPenjualan * hargaItem;
        }
        // Total gaji
        int totalGaji = gajiPokok + (int) bonus;
        // Menampilkan gaji yang diterima
        System.out.println(totalGaji);
        scanner.close();
    }
}
