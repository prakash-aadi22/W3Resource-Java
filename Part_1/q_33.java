package Part_1;

import java.util.Scanner;

public class q_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        long n = sc.nextLong();
        System.out.print("The sum of the digits " + n + " is: ");
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);

        System.out.print("Enter your number: ");
        long a = sc.nextLong();
        System.out.print("The sum of the digits " + a + " is: ");
        int sum1 = 0;
        do {
            sum1 += a % 10;
            a /= 10;
        } while (a != 0);
        System.out.println(sum1);

        System.out.print("Enter your number: ");
        long x = sc.nextLong();
        System.out.print("The sum of the digits " + x + " is: ");
        int sum2;
        for (sum2 = 0; x > 0; sum2 += x % 10, x /= 10) {
            System.out.print("");
        }
        System.out.println(sum2);
    }
}
