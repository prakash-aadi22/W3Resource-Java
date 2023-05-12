package Part_1;

import java.util.Arrays;
import java.util.Scanner;

public class q_82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element of the array (number should be odd): ");
        int n = sc.nextInt();
        if (n % 2 != 0) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter the value of " + i + " the element of the array: ");
                arr[i] = sc.nextInt();
            }
            System.out.println("Original Array: " + Arrays.toString(arr));
            int max;
            int a = arr[0];
            int b = arr[arr.length / 2];
            int c = arr[arr.length - 1];
            if (a >= b && a >= c) {
                max = a;
            } else if (b >= a && b >= c) {
                max = b;
            } else {
                max = c;
            }
            System.out.println("Largest element between first, last, and middle values: " + max);
        } else {
            System.out.println("The number is not odd.");
        }
    }
}
