package Part_1;

import java.util.Scanner;

public class q_108 {
    static long digSum(long n) {
        long sum = 0;
        while (n > 0 || sum > 9) {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the positive integer: ");
        long n = sc.nextLong();
//        System.out.print("The sum of the digits " + n + " is: ");
//        int sum = 0;
//        while (n != 0) {
//            sum += n % 10;
//            n /= 10;
//        }
//        System.out.println(sum);
        System.out.println(digSum(n));
        if (n > 0) {
            System.out.print("The single digit number is: " + (n == 0 ? 0 : (n % 9 == 0 ? 9 : n % 9)));
        }
    }
}
