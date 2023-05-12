package Part_1;

import java.util.Scanner;

public class q_73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first String: ");
        String s1 = sc.nextLine();
        System.out.print("Enter the second String: ");
        String s2 = sc.nextLine();
        String result = "";
        result += (s1.length() >= 1) ? s1.charAt(0) : '#';
        result += (s2.length() >= 1) ? s2.charAt(s2.length() - 1) : '#';
        System.out.println(result);
    }
}
