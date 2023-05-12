package Part_1;

import java.util.Arrays;
import java.util.Scanner;

public class q_104 {
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
        if (Arrays.toString(arr).contains("10")) {
            int l = arr.length - 1;
            int[] arr1;
            while (arr[l] != 10) {
                l--;
            }
            arr1 = new int[arr.length - 2 - l];
//            for (int i = 0; i < l; i++) {
//                arr1[i] = arr[i];
//            }
            System.arraycopy(arr, 0, arr1, 0, l);
            System.out.println("New Array: " + Arrays.toString(arr1));

            // Incorrect for double value of 10
            int l1 = 0;
            int[] arr2;
            while (arr[l1] != 10) {
                l1++;
            }
            arr2 = new int[l1];
//            for (int i = 0; i < l1; i++) {
//                new_array[i] = arr[i];
//            }
            System.arraycopy(arr, 0, arr2, 0, l1);
            System.out.println("New Array: " + Arrays.toString(arr2));
        } else {
            System.out.println("There is no value as 10");
/*
//            int[] arr2 = new int[n];
//            System.arraycopy(arr, 0, arr2, 0, n);
//            System.out.println("New Array: " + Arrays.toString(arr2));
*/
        }
    }
}
// 8 --> {11, 10, 13, 10, 45, 20, 33, 53};