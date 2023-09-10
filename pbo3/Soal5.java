package com.mycompany.pbo3;
import java.util.Scanner;
/*@author Fikri*/
public class Soal5 {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        long Gabungan = Long.parseLong(input.replace(" ", ""));
        if((Gabungan - 999999) % 5 == 0){
            System.out.println("jalan");
        }else{
            System.out.println("berhenti");
        }
    }
}