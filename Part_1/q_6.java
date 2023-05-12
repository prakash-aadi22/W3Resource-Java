package Part_1;

import java.util.Scanner;

public class q_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter your second number: ");
        double b = sc.nextDouble();
        double sum = (a + b);
        double sub = (a - b);
        double mul = (a * b);
        double div = (a / b);
        double mod = (a % b);
        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " - " + b + " = " + sub);
        System.out.println(a + " * " + b + " = " + mul);
        System.out.println(a + " / " + b + " = " + div);
        System.out.println(a + " % " + b + " = " + mod);
    }
}
