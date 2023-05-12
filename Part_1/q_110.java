package Part_1;

import java.util.Scanner;

public class q_110 {
    static int isPowerOfFour(int n) {
        if (n == 0)
            return 0;
        while (n != 1) {
            if (n % 4 != 0)
                return 0;
            n = n / 4;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int test = 0;
        if (n < 1) {
            System.out.println(false);
            test = 1;
        }
        if ((n & (n - 1)) != 0) {
            System.out.println(false);
            test = 1;
        }
        if (test == 0) {
            System.out.println((n & 0x55555555) != 0);
        }

        if (isPowerOfFour(n) == 1)
            System.out.println(n + " is a power of 4");
        else
            System.out.println(n + " is not a power of 4");
    }
}
