package Part_1;

import java.util.Scanner;

public class q_112 {
    public static int factorial(int x) {
        if (x >= 1) {
            return x * factorial(x - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        int y = factorial(x);
        System.out.println("The factorial of " + x + " is: " + y);

        int n = x;
        int n1 = n;
        long ctr = 0;
        while (n != 0) {
            ctr += n / 5;
            n /= 5;
        }
        System.out.printf("Number of trailing zeros of the factorial %d is %d ", n1, ctr);
    }
}
