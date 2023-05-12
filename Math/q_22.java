package Math;

import java.util.Scanner;

public class q_22 {

    public static int nextPalindromeGenerator(int n) {
        int ans = 1, digit, rev_num, num;

        //For single digit number, next smallest palindrome is n+1
        if (n < 10) {
            return n + 1;
        }

        num = n;
        while (ans != 0) {
            rev_num = 0;
            n = ++num;

            while (n > 0) {       // reversing the number
                digit = n % 10;
                rev_num = rev_num * 10 + digit;
                n = n / 10;
            }

            if (rev_num == num) {
                return num;
            } else ans = 1;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = sc.nextInt();
        if (n >= 0) {
            System.out.println("Next smallest palindrome: " + nextPalindromeGenerator(n));
        }
    }
}
