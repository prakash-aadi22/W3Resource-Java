package Data_Types;

import java.util.Scanner;

public class q_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int i1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int i2 = sc.nextInt();
        System.out.println("Result of comparing signed numbers: " + Integer.compare(i1, i2));
        System.out.println("Result of comparing unsigned numbers: " + Integer.compareUnsigned(i1, i2));
    }
}
