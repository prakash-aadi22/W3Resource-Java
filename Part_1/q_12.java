package Part_1;

import java.util.Scanner;

public class q_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter your second number: ");
        double b = sc.nextDouble();
        System.out.print("Enter your third number: ");
        double c = sc.nextDouble();
        double d = (a + b + c) / 3;
        System.out.println("The average of " + a + " and " + b + " and " + c + " is: " + d);
    }
}
