package String;

import java.util.Scanner;

public class q_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "w3resource.com";
        System.out.println("Original String: " + str);
        System.out.print("Enter the index: ");
        int n = sc.nextInt();
        if (n < 14 && n >= 0) {
            System.out.println("The character(unicode point) at " + n + " is " + str.codePointAt(n));
        } else {
            System.out.println("Index out of bound.");
        }
    }
}
