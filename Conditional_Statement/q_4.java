package Conditional_Statement;

import java.util.Scanner;

public class q_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double d = sc.nextDouble();
        if (d > 0) {
            if (Math.abs(d) < 1) {
                System.out.println("Positive Small Number");
            } else if (Math.abs(d) > 1000000) {
                System.out.println("Positive Large Number");
            } else {
                System.out.println("Positive Number");
            }
        } else if (d < 0) {
            if (Math.abs(d) < 1) {
                System.out.println("Negative Small Number");
            } else if (Math.abs(d) > 1000000) {
                System.out.println("Negative Large Number");
            } else {
                System.out.println("Negative Number");
            }
        } else {
            System.out.println("Zero");
        }
    }
}
