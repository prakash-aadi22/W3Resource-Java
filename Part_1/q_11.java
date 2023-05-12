package Part_1;

import java.util.Scanner;

public class q_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of radius: ");
        double r = sc.nextDouble();
        System.out.println("The perimeter of the circle is: " + 2 * Math.PI * r);
        System.out.println("The area of the circle is: " + Math.PI * r * r);
    }
}
