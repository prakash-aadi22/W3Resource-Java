package Part_1;

import java.util.Arrays;
import java.util.Scanner;

public class q_99 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value of " + i + " element: ");
            arr[i] = sc.nextInt();
        }
//        int[] arr = {10, 20, 10, 20, 40, 20, 50}; true
//        int[] arr = {20, 20, 10, 20, 40, 20, 50}; true
//        int[] arr = {10, 30, 10, 20, 40, 20, 50}; false
        System.out.println("The array is: " + Arrays.toString(arr));
        System.out.print("Enter the specified number: ");
        int x = sc.nextInt();
        int result = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != x && arr[i + 1] != x) {
                result = 1;
                break;
            }
        }
        System.out.println(result);
        System.out.println(result == 0);
    }
}
