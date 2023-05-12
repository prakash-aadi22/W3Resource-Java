package Conditional_Statement;

import java.util.Scanner;

public class q_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        long x = sc.nextLong();
        System.out.print("Enter the second number: ");
        long y = sc.nextLong();
        System.out.print("Enter the third number: ");
        long z = sc.nextLong();
        if (x < y && y < z) {
            System.out.println("Increasing order");
        } else if (x > y && y > z) {
            System.out.println("Decreasing order");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
