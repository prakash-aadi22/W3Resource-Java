package Part_1;

import java.util.Scanner;

public class q_62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter the second integer: ");
        int b = sc.nextInt();
        System.out.print("Enter the third integer: ");
        int c = sc.nextInt();
        if (a >= 20 || b >= 20 || c >= 20) {
            System.out.println(Math.abs(a - b) > 20 || Math.abs(b - c) > 20 || Math.abs(a - c) > 20);
        }
        else {
            System.out.println(false);
        }
    }
}
