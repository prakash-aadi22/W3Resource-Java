package Part_1;

import java.util.Arrays;
import java.util.Scanner;

public class q_106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value of " + i + " element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The array is: " + Arrays.toString(arr));
        if (arr.length > 1) {
            int[] arr1 = new int[n];
//            for (int i = 0; i < arr.length - 1; i++) {
//                arr1[i] = arr[i + 1];
//            }
            System.arraycopy(arr, 1, arr1, 0, arr.length - 1);
//            if (arr.length - 1 >= 0) System.arraycopy(arr, 1, arr1, 0, arr.length - 1); // if the if (arr.length > 1) i snot applied
            arr1[arr.length - 1] = arr[0];
            System.out.println("The left shifted array is: " + Arrays.toString(arr1));
        }
    }
}
