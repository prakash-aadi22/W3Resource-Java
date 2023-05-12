package Part_1;

import java.util.Scanner;

public class q_64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose two integer values between 25 to 75: ");
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        if (a >= 25 && a <= 75 && b >= 25 && b <= 75) {
            int x = a % 10;
            a /= 10;
            int y = b % 10;
            b /= 10;
            if (a == b || a == y || x == b || x == y) {
                System.out.println(true);
            }
        } else {
            System.out.println(false);
        }
    }
}
