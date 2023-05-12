package Part_1;

import java.util.Scanner;

public class q_72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first String: ");
        String s1 = sc.nextLine();
        if (s1.length() >= 3) {
            System.out.println(s1.substring(0, 3));
        }else {
            System.out.println("###");
        }
    }
}
