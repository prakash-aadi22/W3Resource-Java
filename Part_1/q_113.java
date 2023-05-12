package Part_1;

import java.util.Arrays;
import java.util.Scanner;

public class q_113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of the first array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value of " + i + " element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The first array is: " + Arrays.toString(arr));
        System.out.print("Enter the number of elements of the second array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            System.out.print("Enter the value of " + i + " element: ");
            arr1[i] = sc.nextInt();
        }
        System.out.println("The second array is: " + Arrays.toString(arr1));
        Arrays.sort(arr);
        Arrays.sort(arr1);
        System.out.println("The first sorted array is: " + Arrays.toString(arr));
        System.out.println("The second sorted array is: " + Arrays.toString(arr1));
        int[] arr2 = new int[n + n1];
        System.arraycopy(arr, 0, arr2, 0, n);
        System.arraycopy(arr1, 0, arr2, n, n1);
        System.out.println("The merged array is: " + Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println("The merged sorted array is: " + Arrays.toString(arr2));
        System.out.println("---------------------------------------------------------");
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {2, 5, 7, 8};
        int[] result = new int[8];
        System.arraycopy(array1, 0, result, 0, 4);
        System.arraycopy(array2, 0, result, 4, 4);
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
    }
}
//        array1 = [1, 2, 3, 4]
//        array2 = [2, 5, 7, 8]
//        result = [1, 2, 2, 3, 4, 5, 7, 8]
