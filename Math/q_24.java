package Math;

import java.util.Scanner;

public class q_24 {
    private static long binomial_Coefficient(int n, int k) {
        if (k > n - k)
            k = n - k;

        long result = 1;
        for (int i = 1, m = n; i <= k; i++, m--)
            result = result * m / i;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Formula: (n/k) = n!/k!(n - k)!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number(n): ");
        int n = sc.nextInt();
        System.out.print("Input the second number(k): ");
        int k = sc.nextInt();
        if (n > 0 && k > 0) {
            System.out.println("Binomial Coefficient of the said numbers " + binomial_Coefficient(n, k));
        }
    }
}
