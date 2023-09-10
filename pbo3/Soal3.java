package com.mycompany.pbo3;
import java.util.Scanner;
/*@author Fikri*/
public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Membaca input A, operator, dan B
        double A = scanner.nextInt();
        String operator = scanner.next();
        double B = scanner.nextInt();
        double result = 0;
        // Melakukan operasi berdasarkan operator
        if (A <= 1000 && B <= 1000){
            if (operator.equals("+")) {
            result = A + B;
            } else if (operator.equals("-")) {
                result = A - B;
            } else if (operator.equals("*")) {
                result = A * B;
            } else if (operator.equals("/")) {
                result = A / B;
            } else if (operator.equals("%")) {
                result = A % B;
            }
        }else{
            System.out.println("pastikan input anda tidak melebihi 1000");
        }
        // Menampilkan hasil operasi
        if (result == (int) result) {
            System.out.println((int) result); // Jika hasil adalah bilangan bulat, tampilkan sebagai int
        } else {
            System.out.println(result); // Jika hasil adalah bilangan pecahan, tampilkan sebagai double
        }
        scanner.close();
    }
}
