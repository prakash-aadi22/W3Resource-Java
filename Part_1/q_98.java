package Part_1;

import java.util.Arrays;
import java.util.Scanner;

public class q_98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value of " + i + " element: ");
            arr[i] = sc.nextInt();
        }
//        int[] arr = {10, 20, 10, 20, 40, 13, 20}; true
//        int[] arr = {10, 20, 20, 10, 40, 13, 20}; false
        System.out.println("The array is: " + Arrays.toString(arr));
        int result = 0, count = 0;
        if (arr[arr.length - 1] == 20) {
            count++;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 20) {
                count++;
            }
            if (arr[i] == 20 && arr[i + 1] == 20) {
                System.out.println(false);
                result = 1;
            }
        }
        if (result == 0) {
            System.out.println(count == 3);
        }
    }
}
