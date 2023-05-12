package Conditional_Statement;

import java.util.Scanner;

public class q_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the letter: ");
        String letter = sc.next();
        if (letter.length() == 1 && letter.charAt(0) >= 65 && letter.charAt(0) <= 90 && letter.charAt(0) >= 97 && letter.charAt(0) <= 122) {
            if (letter.equalsIgnoreCase("A") || letter.equalsIgnoreCase("E") || letter.equalsIgnoreCase("I") || letter.equalsIgnoreCase("O") || letter.equalsIgnoreCase("U")) {
                System.out.println(letter + " is vowel");
            } else {
                System.out.println(letter + " is consonant");
            }
        } else {
            System.out.println("Error");
        }
    }
}
