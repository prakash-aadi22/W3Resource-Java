package Math;

import java.util.Scanner;

public class q_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the double value: ");
        double value = sc.nextDouble();
        double fractional_part = value % 1;
        double integral_part = value - fractional_part;
        System.out.println("Original part: " + value);
        System.out.println("Integral part: " + integral_part);
        System.out.println("Fractional part: " + fractional_part);
        System.out.println("---------------------------------------");
        double integral_part1 = Math.floor(value);
        double fractional_part1 = value  - integral_part1;
        System.out.println("Original part: " + value);
        System.out.println("Integral part: " + integral_part1);
        System.out.println("Fractional part: " + fractional_part1);
        System.out.println("==========================================");
        System.out.println(10.0 % 1);
        System.out.println(10.5 % 1);
        System.out.println(10.0 / 1);
        System.out.println(10.5 / 1);
    }
}
