package com.mycompany.pbo3;
import java.util.Scanner;
/*@author Fikri*/
public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Inisialisasi array untuk menyimpan data
        String[] strings = new String[5];
        int[] integers = new int[5];
        // Membaca dan menyimpan data
        for (int i = 0; i < 3; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            if (parts.length == 2) {
                strings[i] = parts[0];
                integers[i] = Integer.parseInt(parts[1]);
            }
        }
        // Cetak head line
        System.out.println("================================");
        // Cetak data didalam line
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-15s%03d%n", strings[i], integers[i]);
        }
        // Cetak footer line
        System.out.println("================================");
        scanner.close();
    }
}