package String;

import java.util.Scanner;

public class q_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "Java Exercises!";
        System.out.println("Original String: " + s);
        System.out.print("Enter the index: ");
        int n = sc.nextInt();
        if (n < 15 && n >= 0) {
            System.out.println("The character at position " + n + " is " + s.charAt(n));
        } else {
            System.out.println("Index out of bound.");
        }
    }
}
