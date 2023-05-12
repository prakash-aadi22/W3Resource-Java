package Conditional_Statement;

import java.util.Scanner;

public class q_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        long yearNumber = sc.nextLong();
        if ((yearNumber % 400 == 0) || ((yearNumber % 4 == 0) && (yearNumber % 100 != 0))) {
            System.out.println(yearNumber + " is leap year.");
        } else {
            System.out.println(yearNumber + " is not leap year.");
        }
    }
}
