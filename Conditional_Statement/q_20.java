package Conditional_Statement;

import java.util.Scanner;

public class q_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int numberOfRows = sc.nextInt();
        int number = 1;
        for (int row = 1; row <= numberOfRows; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }

        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt();
        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }
}
