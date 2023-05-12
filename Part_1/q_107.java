package Part_1;

import java.util.Arrays;
import java.util.Scanner;

public class q_107 {
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
        int result = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1] - 1) {
                result++;
            }
        }
        System.out.println(result >= 3);
    }
}
// 6 --> {11, 12, 13, 14, 45, 20}