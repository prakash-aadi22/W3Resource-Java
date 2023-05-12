package Math;

import java.util.Scanner;

public class q_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x = sc.nextInt();
        System.out.print("Enter the second number: ");
        int y = sc.nextInt();
        System.out.print("The result is: ");
        if (x == 15 || y == 15) {
            System.out.println(true);
        } else {
            System.out.println(x + y == 15 || Math.abs(x - y) == 15);
        }
    }
}
