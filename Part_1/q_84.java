package Part_1;

import java.util.Scanner;

public class q_84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        if (s.length() >= 3) {
            String attach = s.substring((s.length() - 3));
            System.out.println(attach + s + attach);
        } else {
            System.out.println("Your string must be greater than 3 words.");
        }
    }
}
