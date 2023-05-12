package Part_1;

import java.util.Arrays;
import java.util.Scanner;

public class q_92 {
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
        int numberOfEven = 0, numberOfOdd = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                numberOfEven++;
            } else {
                numberOfOdd++;
            }
        }
        System.out.println("Number of even elements of array: " + numberOfEven);
        System.out.println("Number of odd elements of array: " + numberOfOdd);
    }
}
