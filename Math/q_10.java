package Math;

import java.util.Scanner;

public class q_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the float number: ");
        float n = sc.nextFloat();
        System.out.println("The rounded value of " + n + " is: " + Math.round(n)); // best
        System.out.println("The rounded value of " + n + " is: " + Math.floor(n));
        System.out.println("The rounded value of " + n + " is: " + Math.ceil(n));
    }
}
// 12.49999
//12.510000