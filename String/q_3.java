package String;

import java.util.Scanner;

public class q_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "w3resource.com";
        System.out.println("Original String: " + str);
        System.out.print("Enter the index: ");
        int n = sc.nextInt();
        if (n < 15 && n >= 1) {
            System.out.println("The character(unicode point) at " + n + " is " + str.codePointBefore(n));
        } else {
            System.out.println("Index out of bound.");
        }
    }
}
