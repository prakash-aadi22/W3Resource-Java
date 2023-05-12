package Conditional_Statement;

import java.util.Scanner;

public class q_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double d1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double d2 = sc.nextDouble();
        System.out.print("Enter the third number: ");
        double d3 = sc.nextDouble();
        double d4 = Math.max(d1, d2);
        System.out.println(Math.max(d4, d3));
        if (d1 > d2 && d1 > d3){
            System.out.println("The greatest number is " + d1);
        } else if (d2 > d1 && d2 > d3){
            System.out.println("The greatest number is " + d2);
        } else {
            System.out.println("The greatest number is " + d3);
        }
    }
}
