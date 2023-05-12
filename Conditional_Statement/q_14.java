package Conditional_Statement;

import java.util.Scanner;

public class q_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number (Table to be calculated): ");
        int n = sc.nextInt();
        System.out.print("Input number of terms : ");
        int x = sc.nextInt();
        for (int i = 0; i <= x; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
