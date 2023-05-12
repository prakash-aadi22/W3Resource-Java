package Conditional_Statement;

import java.util.Arrays;
import java.util.Scanner;

public class q_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the " + (i + 1) + "th number: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("\nThe numbers are: " + Arrays.toString(arr));
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("The sum of all number are: " + sum);
        float avg = (float) sum / 5;
        System.out.println("The average of all number are: " +avg);
    }
}
