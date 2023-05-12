package Part_1;

import java.util.Arrays;
import java.util.Scanner;

public class q_102 {
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
        int count = 0;
        for (int j : arr) {
            if (j == 10 || j == 30) {
                count++;
            }
        }
        if (count > 0){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
