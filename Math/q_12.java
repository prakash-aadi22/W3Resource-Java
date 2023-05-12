package Math;

import java.util.Scanner;

public class q_12 {

    public static void prime_number_between_two_numbers(int n1, int n2) {
        int count2 = 0;
        if (n1 == 1 || n1 == 0)
            n1 = 2;
        System.out.print("Prime Number between " + n1 + " and " + n2 + " are: ");
        int count;
        for (int i = n1; i <= n2; i++) {
            count = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.print(i + ", ");
                count2++;
            }
        }
        System.out.println("\nTotal numbers of prime number between " + n1 + " and " + n2 + " are: " + count2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the positive number: ");
        int x = sc.nextInt();
        int count2 = 0;
        if (x >= 0) {
            System.out.print("Prime Number before " + x + " are: ");
            int count;
            for (int i = 2; i <= x; i++) {
                count = 0;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        count++;
                        break;
                    }
                }
                if (count == 0) {
                    System.out.print(i + ", ");
                    count2++;
                }
            }
            System.out.println("\nTotal numbers of prime number are before " + x + " is: " + count2);
        } else {
            System.out.println("Negative number");
        }

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("A program to find the prime numbers between two numbers including the both numbers.");
        System.out.println("Note :- The second number should be greater than the first one.");
        System.out.print("Input first integer: ");
        int num1 = sc.nextInt();
        System.out.print("Input second integer: ");
        int num2 = sc.nextInt();
        if (num1 >= 0 && num2 >= 0 && num2 > num1) {
            prime_number_between_two_numbers(num1, num2);
        }
    }
}
