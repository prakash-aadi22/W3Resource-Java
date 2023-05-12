package Conditional_Statement;

import java.util.Scanner;

public class q_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("The number is: " + i + " And the cube of " + i + " is: " + (int) Math.pow(i, 3));
        }
    }
}
