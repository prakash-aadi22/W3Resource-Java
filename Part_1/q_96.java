package Part_1;

import java.util.Arrays;
import java.util.Scanner;

public class q_96 {
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
        boolean tested = false;
        int result = 0;
        int x = 10;
        int y = 20;
        for (int j : arr) {
            if (j == x)
                tested = true;
            if (tested && j == y) {
                System.out.println(true);
                result = 1;
            }
        }
        if (result == 0) {
            System.out.println(false);
        }
    }
}
