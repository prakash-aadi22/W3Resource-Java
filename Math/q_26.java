package Math;

import java.util.Scanner;

public class q_26 {
    public static void primeFactors(int n) {
        while (n % 2 == 0) {
            System.out.print(2 + ", ");
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.print(i + ", ");
                n /= i;
            }
        }

        if (n > 2)
            System.out.print(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if (n > 0) {
            System.out.print("The prime factor of " + n + " are: ");
            primeFactors(n);
        }
        System.out.println("\n============================================================");
        if (n > 0) {
            System.out.print("The factor of " + n + " are: ");
            for (int i = 1; i < n; i++) {
                if (n % i == 0)
                    System.out.print(i + ", ");
            }
        }
    }
}
