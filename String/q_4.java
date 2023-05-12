package String;

import java.util.Scanner;

public class q_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "w3resource.com";
        System.out.println("Original String: " + str);
        System.out.print("Enter the start index: ");
        int x = sc.nextInt();
        System.out.print("Enter the end index: ");
        int y = sc.nextInt();
        if (x >= 0 && y < 14) {
            System.out.println("The character(unicode point) between " + x + " and " + y + " is " + str.codePointCount(x, y));
        } else {
            System.out.println("Index out of bound.");
        }
    }
}
