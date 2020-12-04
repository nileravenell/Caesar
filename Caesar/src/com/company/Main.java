package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("plaintext: ");
        String text = input.nextLine();
        System.out.println("rotation (number): ");
        int rotation = input.nextInt();
        String ciphertext = "";
        char letters;
        for (int i=0; i < text.length(); i++) {
            letters = text.charAt(i);
            if (letters >= 'a' && letters <= 'z') {
                letters = (char) (letters + rotation);
                if (letters > 'z') {
                    letters = (char) (letters + 'a' - 'z' - 1);
                }
                ciphertext = ciphertext + letters;
            }
            else if (letters >= 'A' && letters <='Z') {
                letters = (char) (letters + rotation);

                if (letters > 'Z') {
                    letters = (char) (letters + 'A' - 'Z' - 1);
                }
                ciphertext = ciphertext + letters;
            }
            else {
                ciphertext = ciphertext + letters;
            }
        }
        System.out.println("ciphertext: " + ciphertext);
    }
}
