package Conditional_Statement;

import java.util.Scanner;

public class q_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if (n > 0){
            System.out.println("Entered number " + n + " is positive.");
        } else if (n < 0){
            System.out.println("Entered number " + n + " is negative.");
        } else {
            System.out.println("Entered number " + n + " is zero.");
        }
    }
}
