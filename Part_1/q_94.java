package Part_1;

import java.util.Arrays;
import java.util.Scanner;

public class q_94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value of the " + i + " element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array: " + Arrays.toString(arr));
        int i = 0;
        while (i < arr.length && arr[i] % 2 == 0)
            i++;

        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] % 2 != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        System.out.println("New Array: " + Arrays.toString(arr));
    }
}
