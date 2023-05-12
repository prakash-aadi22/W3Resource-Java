package Part_1;

import java.util.Arrays;
import java.util.Scanner;

public class q_101 {
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
        int countNumberOf10 = 0;
        int countNumberOf20 = 0;
        for (int j : arr) {
            if (j == 10) {
                countNumberOf10++;
            } else if (j == 20) {
                countNumberOf20++;
            }
        }
        System.out.println("Number of 10s are " + countNumberOf10);
        System.out.println("Number of 20s are " + countNumberOf20);
        if (countNumberOf10 > countNumberOf20){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
