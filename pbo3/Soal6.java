package com.mycompany.pbo3;

import java.math.BigInteger;
import java.util.Scanner;
/*@author Fikri*/
public class Soal6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //input sebagai string
        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();
        // Membuat objek BigInteger
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        // Proses addition dan multiplication
        BigInteger sum = a.add(b);
        BigInteger product = a.multiply(b);
        // Print tidak adanya nol didepan
        System.out.println(sum.toString());
        System.out.println(product.toString());
        scanner.close();
    }
}
