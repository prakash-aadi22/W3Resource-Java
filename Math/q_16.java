package Math;

import java.util.Scanner;

public class q_16 {
    public static int power(int b, int e) {
        if (e == 0) return 1;

        int result = b;
        int temp = b;
        int i, j;

        for (i = 1; i < e; i++) {
            for (j = 1; j < b; j++) {
                result += temp;
            }
            temp = result;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the positive number: ");
        int x = sc.nextInt();
        System.out.print("Enter the power number: ");
        int y = sc.nextInt();
        System.out.println(x + " to the power of " + y + " is: " + Math.pow(x, y));
        System.out.println("-------------------------------------------------------------------");
        if (x > 0 && y > 0)
            System.out.println("Power of the number: " + power(x, y));
    }
}
