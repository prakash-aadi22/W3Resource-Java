package Math;

import java.util.Scanner;

public class q_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the double number: ");
        double d_num = sc.nextDouble();
//        double d_num = 5.44444;
        if ((d_num % 1) == 0) {
            System.out.println("It's not a double number");
        } else {
            System.out.println("It's a double number");
        }
    }
}
