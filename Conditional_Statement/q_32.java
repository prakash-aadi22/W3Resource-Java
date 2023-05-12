package Conditional_Statement;

import java.util.Scanner;

public class q_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first decimal number: ");
        double d1 = sc.nextDouble();
        System.out.print("Enter the second decimal number: ");
        double d2 = sc.nextDouble();
        int i1 = (int) (d1 * 100);
        int i2 = (int) (d2 * 100);
        if (i1 == i2) {
            System.out.println("They are the same up to two decimal places.");
        } else {
            System.out.println("They are different.");
        }
        System.out.println("=============================================");
        d1 = Math.round(d1 * 100);
        d1 = d1 / 1000;
        d2 = Math.round(d2 * 100);
        d2 = d2 / 1000;
        if (d1 == d2) {
            System.out.println("They are the same up to two decimal places.");
        } else {
            System.out.println("They are different.");
        }
    }
}
