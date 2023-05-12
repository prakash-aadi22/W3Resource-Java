package Conditional_Statement;

import java.util.Scanner;

public class q_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt();
        int s = n + 4 - 1;
        for (int i = 1; i <= n; i++) {
            for (int x = s; x != 0; x--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
            s--;
        }
    }
}
