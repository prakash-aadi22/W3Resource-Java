package Part_1;

import java.util.Scanner;

public class q_63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("The larger number is: " + a);
        }
        if (b > a){
            System.out.println("The larger number is: " + b);
        }
        if (a == b) {
            System.out.println("0");
        }
        if (a % 6 == b % 6) {
            if (a < b) {
                System.out.println("The smaller number is: " + a);
            }
            if (b < a) {
                System.out.println("The smaller number is: " + b);
            }
        }
    }
}
