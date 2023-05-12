package String;

import java.util.Scanner;

public class q_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s1 = sc.next();
        System.out.print("Enter the second string: ");
        String s2 = sc.next();
        System.out.println(s1.equals(s2));
    }
}
