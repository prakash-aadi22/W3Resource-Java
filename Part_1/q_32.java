package Part_1;

import java.util.Scanner;

public class q_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter your second number: ");
        double b = sc.nextDouble();
        if (a == b) {
            System.out.println(a + " is equal to " + b);
        } else if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (b > a) {
            System.out.println(b + " is greater than " + a);
        } else {
            System.out.println(a + " is not equal to " + b);
        }
    }
}
