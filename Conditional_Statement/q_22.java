package Conditional_Statement;

import java.util.Scanner;

public class q_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no_row, c = 1, blk, i, j;
        System.out.print("Enter number of rows: ");
        no_row = sc.nextInt();
        for (i = 0; i < no_row; i++) {
            for (blk = 1; blk <= no_row - i; blk++)
                System.out.print(" ");
            for (j = 0; j <= i; j++) {
                if (j == 0 || i == 0)
                    c = 1;
                else
                    c = c * (i - j + 1) / j;
                System.out.print(" " + c);
            }
            System.out.print("\n");
        }
    }
}
