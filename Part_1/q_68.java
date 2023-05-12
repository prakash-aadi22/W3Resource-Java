package Part_1;

import java.util.Scanner;

public class q_68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s = "Python 3.0";
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        if (s.length() >= 3) {
            String s1 = s.substring(s.length() - 3);
            System.out.println(s1 + " " + s1 + " " + s1 + " " + s1);
        } else {
            System.out.println("Enter the String which has length >= 3.");
        }
    }
}
