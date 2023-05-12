package Part_1;

import java.util.Arrays;
import java.util.Scanner;

public class q_97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value of the " + i + " element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The array is: " + Arrays.toString(arr));
        System.out.print("Enter the specified number : ");
        int x = sc.nextInt();
        int result = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == x && arr[i + 1] == x) {
                System.out.println(true);
                result = 1;
            }
            if (i <= arr.length - 3 && arr[i] == x && arr[i + 2] == x) {
                System.out.println(true);
                result = 1;
            }
        }
        if (result == 0) {
            System.out.println(false);
        }
    }
}
//        int[] arr = {10, 20, 10, 50, 20, 13, 50};
//        int x = 10;
//        int[] arr = {10, 10, 50, 50, 20, 13, 50};
//        int x = 10;
//        int[] arr = {10, 20, 50, 40, 60, 13, 60};
//        int x = 13;
//        int[] arr = {10, 20, 50, 13, 90, 13, 60};
//        int x = 60;
