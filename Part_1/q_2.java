package Part_1;

import java.util.Scanner;

public class q_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter your second number: ");
        double b = sc.nextDouble();
        double c = (a + b);
        System.out.println("The sum of " + a + " and " + b + " is: " + c);
        System.out.println(a + " + " + b + " = " + c);
    }
}
