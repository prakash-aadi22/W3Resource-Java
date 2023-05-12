package Conditional_Statement;

import java.util.Scanner;

public class q_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        int sum = 0;
        System.out.print("First " + n + " natural numbers are: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ", ");
            sum += i;
        }
        System.out.println("\nSum of first " + n + " natural number are: " + sum);
    }
}
