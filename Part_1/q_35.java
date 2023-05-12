package Part_1;

import java.util.Scanner;

public class q_35 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of the side of the polygon: ");
        int n = sc.nextInt();
        System.out.print("Enter the length of the side of the polygon: ");
        int s = sc.nextInt();
        double area = (n * s * s) / (4 * Math.tan(Math.PI / n));
        System.out.println("The area of the polygon with side " + s + " is: " + area);
    }
}
