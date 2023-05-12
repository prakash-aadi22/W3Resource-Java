package Part_1;

import java.util.Arrays;
import java.util.Scanner;

public class q_95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of the array: ");
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = String.valueOf(i);
        }
        System.out.println("Original array: " + Arrays.toString(arr));
    }
}
