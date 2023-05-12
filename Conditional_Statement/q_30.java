package Conditional_Statement;

import java.util.Scanner;

public class q_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        long x = sc.nextLong();
        System.out.print("Enter the second number: ");
        long y = sc.nextLong();
        System.out.print("Enter the third number: ");
        long z = sc.nextLong();
        if (x == y && y == z) {
            System.out.println("All numbers are equal.");
        }
//        if (x == y && x == z) {
//            System.out.println("All numbers are equal.");
//        }
        else if ((x == y) || (x == z) || (y == z)) {
            System.out.println("Neither all are equal or different.");
        } else {
            System.out.println("All numbers are different.");
        }
    }
}
