package Part_1;

import java.util.Arrays;
import java.util.Scanner;

public class q_83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element for both the array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value of " + i + " the element of the first array: ");
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value of " + i + " the element of the second array: ");
            arr2[i] = sc.nextInt();
        }
        System.out.println("Original first array: " + Arrays.toString(arr1));
        System.out.println("Original second array: " + Arrays.toString(arr2));
        int[] arr3 = new int[n];
        for (int i = 0; i < n; i++) {
            arr3[i] = arr1[i] * arr2[i];
        }
        System.out.println("The multiplied array: " + Arrays.toString(arr3));
    }
}
