package Data_Types;

import java.util.Scanner;

public class q_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double num = sc.nextDouble();
        System.out.println("The square of " + num + " is: " + Math.pow(num, 2));
        System.out.println("The cube of " + num + " is: " + Math.pow(num, 3));
        System.out.println("The forth power of " + num + " is: " + Math.pow(num, 4));
    }
}
