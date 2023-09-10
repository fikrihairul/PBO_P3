package com.mycompany.pbo3;
import java.util.Scanner;
import java.util.ArrayList;
/*@author Fikri*/
public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        ArrayList<String> tokens = new ArrayList<>();
        StringBuilder currentToken = new StringBuilder();

        // Perulangan setiap karakter dalam string input
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                // Menambahkan karakter alfabet ke token saat ini
                currentToken.append(c);
            } else if (currentToken.length() > 0) {
                // Token ditambah ke list
                tokens.add(currentToken.toString());
                currentToken.setLength(0); // Reset current token
            }
        }
        // menambahkan last token jika ada
        if (currentToken.length() > 0) {
            tokens.add(currentToken.toString());
        }
        // Print nomer token
        System.out.println(tokens.size());
        //print setiap token pada baris baru
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}