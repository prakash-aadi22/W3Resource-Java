package Part_1;

import java.util.Arrays;
import java.util.Scanner;

public class q_79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First Method --->>> ");
        int[] arr1 = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the value of " + i + " the element of the array: ");
            arr1[i] = sc.nextInt();
        }
        System.out.println("Original Array: " + Arrays.toString(arr1));
        int[] arr2 = new int[3];
        arr2[0] = arr1[1];
        arr2[1] = arr1[2];
        arr2[2] = arr1[0];
        System.out.println("After rotating the array in left direction: " + Arrays.toString(arr2));
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Second Method --->>> ");
        int[] arr3 = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the value of " + i + " the element of the array: ");
            arr3[i] = sc.nextInt();
        }
        System.out.println("Original Array: " + Arrays.toString(arr3));
        int[] arr4 = {arr3[1], arr3[2], arr3[0]};
        System.out.println("After rotating the array in left direction: " + Arrays.toString(arr4));
    }
}
