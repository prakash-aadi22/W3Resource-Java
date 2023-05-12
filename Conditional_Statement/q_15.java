package Conditional_Statement;

import java.util.Scanner;

public class q_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        int sum = 0;
        System.out.print("First " + n + " odd natural numbers are: ");
//        for (int i = 1; i <= n; i++) {
//            if (i % 2 != 0) {
//                System.out.print(i + ", "); // wrong for first 5 // right for upto number 5
//                sum += i;
//            }
//        }
        for (int i = 1; i <= n; i++) {
            System.out.print(2 * i - 1 + ", ");
            sum += 2 * i - 1;
        }
        System.out.println("\nSum of first " + n + " odd natural number are: " + sum);
    }
}
