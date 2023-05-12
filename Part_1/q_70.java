package Part_1;

import java.util.Scanner;

public class q_70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first String: ");
        String s1 = sc.nextLine();
        System.out.print("Enter the second String: ");
        String s2 = sc.nextLine();
        if (s1.length() > s2.length()) {
            System.out.println(s2 + " " + s1 + " " + s2);
        } else if (s1.length() < s2.length()) {
            System.out.println(s1 + " " + s2 + " " + s1);
        } else {
            System.out.println(s1 + " " + s2 + " " + s1);
            System.out.println(s2 + " " + s1 + " " + s2);
        }
    }
}
