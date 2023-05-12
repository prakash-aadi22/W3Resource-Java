package Data_Types;

import java.util.Scanner;

public class q_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        long num1 = sc.nextLong();
        System.out.print("Enter the second number: ");
        long num2 = sc.nextLong();
        long sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        long difference = num1 - num2;
        System.out.println("The difference of " + num1 + " and " + num2 + " is: " + difference);
        long product = num1 * num2;
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
        double average = (double) (num1 + num2) / 2;
        System.out.println("The average of " + num1 + " and " + num2 + " is: " + average);
        long distance = num1 - num2;
        System.out.println("The distance between " + num1 + " and " + num2 + " is: " + Math.abs(distance));
        System.out.println("The maximum integer between " + num1 + " and " + num2 + " is: " + Math.max(num1, num2));
        System.out.println("The minimum integer between " + num1 + " and " + num2 + " is: " + Math.min(num1, num2));
    }
}
