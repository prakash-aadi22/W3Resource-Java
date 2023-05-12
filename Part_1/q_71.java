package Part_1;

import java.util.Scanner;

public class q_71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first String: ");
        String s1 = sc.nextLine();
        System.out.print("Enter the second String: ");
        String s2 = sc.nextLine();
        if (s1.length() >= 1 && s2.length() >= 1) {
            System.out.println(s1.substring(1) + " " + s2.substring(1));
        } else {
            System.out.println("Enter the String which has length >= 1.");
        }
    }
}
