package Part_1;

import java.util.Scanner;

public class q_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your length: ");
        double length = sc.nextDouble();
        System.out.print("Enter your breadth: ");
        double breadth = sc.nextDouble();
        System.out.println("The perimeter of rectangle is: " + 2 * (length + breadth));
        System.out.println("The area of rectangle is: " + (length * breadth));
    }
}
