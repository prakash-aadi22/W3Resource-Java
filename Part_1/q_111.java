package Part_1;

import java.util.Scanner;

public class q_111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number: ");
        int x = sc.nextInt();
        System.out.print("Input second number: ");
        int y = sc.nextInt();
        while (y != 0) {
            int carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }
        System.out.println("Sum: " + x);
    }
}
