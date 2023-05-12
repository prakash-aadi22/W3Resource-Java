package Part_1;

import java.util.Arrays;
import java.util.Scanner;

public class q_81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element of the array: ");
        int n = sc.nextInt();
        if (n > 0) {
            int[] arr1 = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter the value of " + i + " the element of the array: ");
                arr1[i] = sc.nextInt();
            }
            System.out.println("Original Array: " + Arrays.toString(arr1));
            int x = arr1[0];
            arr1[0] = arr1[arr1.length - 1];
            arr1[arr1.length - 1] = x;
            System.out.println("New array after swapping the first and last elements: " + Arrays.toString(arr1));
        } else {
            System.out.println("The length of the array must be > 0.");
        }
    }
}
