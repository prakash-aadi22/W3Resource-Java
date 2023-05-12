package Data_Types;

import java.util.Scanner;

public class q_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length in inches: ");
        double i = sc.nextDouble();
        double m = i / 39.37;
        double m2 = i  * 0.0254;
        System.out.println("The length in meters is: " + m);
        System.out.println("The length in meters is: " + m2);
    }
}
