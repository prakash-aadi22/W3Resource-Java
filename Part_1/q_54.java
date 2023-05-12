package Part_1;

import java.util.Scanner;

public class q_54 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int a = in.nextInt();
        System.out.print("Input the second number: ");
        int b = in.nextInt();
        System.out.print("Input the third number : ");
        int c = in.nextInt();
        if ((a % 10 == b % 10) || (a % 10 == c % 10) || (b % 10 == c % 10)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println("The result is: " + test_last_digit(a, b, c));
    }

    public static boolean test_last_digit(int p, int q, int r) {
        return (p % 10 == q % 10) || (p % 10 == r % 10) || (q % 10 == r % 10);
    }
}
