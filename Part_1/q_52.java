package Part_1;

import java.util.Scanner;

public class q_52 {

    public static boolean sumOfTwo(int p, int q, int r) {
        return ((p + q) == r || (q + r) == p || (r + p) == q);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int a = sc.nextInt();
        System.out.print("Enter your second number: ");
        int b = sc.nextInt();
        System.out.print("Enter your third number: ");
        int c = sc.nextInt();
        if (((a + b) == c || (b + c) == a || (c + a) == b)) {
            System.out.println("The result is: True");
        } else {
            System.out.println("The result is: False");
        }

        System.out.print("The result is: " + sumOfTwo(a, b, c));
    }
}
