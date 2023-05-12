package Math;

import java.util.Scanner;

public class q_21 {
    static int max_distinct_primes(int r1, int r2) {
        long[] factor_count = new long[r2 + 1];
        boolean[] prime_num = new boolean[r2 + 1];
        for (int i = 0; i <= r2; i++) {
            factor_count[i] = 0;
            prime_num[i] = true;
        }

        for (int i = 2; i <= r2; i++) {
            if (prime_num[i]) {
                factor_count[i] = 1;
                for (int j = i * 2; j <= r2; j += i) {
                    factor_count[j]++;
                    prime_num[j] = false;
                }
            }
        }

        int max_num = (int) factor_count[r1];
        int num = r1;

        for (int i = r1; i <= r2; i++) {
            if (factor_count[i] > max_num) {
                max_num = (int) factor_count[i];
                num = i;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Note :- The second number should be greater than the first one.");
        System.out.print("Input first integer: ");
        int num1 = sc.nextInt();
        System.out.print("Input second integer: ");
        int num2 = sc.nextInt();
        if (num1 > 0 && num2 > 0 && num2 > num1) {
            System.out.println("Maximum number of distinct prime factors of the said range: " + max_distinct_primes(num1, num2));
        }
    }
}
