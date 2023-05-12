package Conditional_Statement;

import java.util.Scanner;

public class q_21 {
    public static void main(String[] args) {
        System.out.print("Enter number of rows (half of the diamond) : ");
        Scanner sc = new Scanner(System.in);
        int i, j, r;
        r = sc.nextInt();

        for (i = 0; i <= r; i++) {
            for (j = 1; j <= r - i; j++)
                System.out.print(" ");
            for (j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.print("\n");
        }

        for (i = r - 1; i >= 1; i--) {
            for (j = 1; j <= r - i; j++)
                System.out.print(" ");
            for (j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.print("\n");
        }

    }
}
