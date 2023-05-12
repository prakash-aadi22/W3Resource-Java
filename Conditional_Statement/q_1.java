package Conditional_Statement;

import java.util.Scanner;

public class q_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double num = sc.nextDouble();
        if (num > 0) {
            System.out.println("The number " + num + " is positive.");
        } else if (num < 0) {
            System.out.println("The number is " + num + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
