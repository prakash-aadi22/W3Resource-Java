package Part_1;

import java.util.Arrays;
import java.util.Scanner;

public class q_100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of both array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        System.out.println("For the first array --> ");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value of " + i + " element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The first array is: " + Arrays.toString(arr));
        System.out.println("For the second array --> ");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value of " + i + " element: ");
            arr1[i] = sc.nextInt();
        }
        System.out.println("The second array is: " + Arrays.toString(arr1));
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i] - arr1[i]) <= 1) {
                count++;
            }
        }
        System.out.println("Number of elements: " + count);
    }
}
