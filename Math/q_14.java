package Math;

import java.util.Scanner;

public class q_14 {
    public static float square_Root(float num) {
        float a = num;
        float b = 1;
        double e = 0.000001;
        while (a - b > e) {
            a = (a + b) / 2;
            b = num / a;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the positive number: ");
        int x = sc.nextInt();
        System.out.println("Square Root of " + x + " is: " + Math.sqrt(x));
        System.out.println("Square root of a number using Babylonian method: " + square_Root(x));
    }
}
