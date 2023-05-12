package Part_1;

import java.util.Scanner;

public class q_34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the hexagon: ");
        int side = sc.nextInt();
        double area = (1.5 * Math.sqrt(3) * side * side);
        System.out.println("The Area of the polygon is: " + area);
    }
}
