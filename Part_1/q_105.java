package Part_1;

import java.util.Arrays;
import java.util.Scanner;

public class q_105 {
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
        System.out.println(arr[0] == arr[arr.length - 2] && arr[1] == arr[arr.length - 1]);

        int result = 0;
        int l = 2;
        int start = 0;
        int end = arr.length - l;
        for (; l > 0; l--) {
            if (arr[start] != arr[end])
                result = 1;
            else {
                start++;
                end++;
            }
        }

        System.out.println(result != 1);
    }
}
// 8 --> {11, 15, 13, 10, 45, 20, 11, 15}