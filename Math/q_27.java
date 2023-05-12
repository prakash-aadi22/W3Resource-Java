package Math;

import java.util.Scanner;

public class q_27 {
    static boolean isPerfectSquare(int x) {
        int s = (int) Math.sqrt(x);
        return (s * s == x);
    }

    static boolean isFibonacci(int x) {
        return isPerfectSquare(5 * x * x + 4) || isPerfectSquare(5 * x * x - 4);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = sc.nextInt();
        if (n >= 0) {
            System.out.println("Is " + n + " Fibonacci number? " + isFibonacci(n));
        }
    }
}
