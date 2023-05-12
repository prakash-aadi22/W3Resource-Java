package Part_1;

import java.util.Scanner;

public class q_109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of staircase shape: ");
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println("Number of rows: " + ((int) ((Math.sqrt(8 * (long) n + 1) - 1) / 2)));
        }
    }
}
