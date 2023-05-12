package Math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class q_5 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of elements of the array: ");
            int x = sc.nextInt();
            int[] arr = new int[x];
            for (int i = 0; i < x; i++) {
                System.out.print("Enter the value of " + i + " element: ");
                arr[i] = sc.nextInt();
            }
            System.out.println("The array is: " + Arrays.toString(arr));
//        int[] arr = {0, -1, 2, 3, -4, 5, 6, -7, 8, 9};
            int count = 0;
            ArrayList<Integer> al = new ArrayList<>();
            for (int i : arr) {
                int n = Math.abs(i);
                if (!al.contains(n)) {
                    al.add(n);
//                System.out.print(n + ", ");
                    count++;
                }
            }
            System.out.println("The absolute distinct array is: " + al);
            System.out.println("The absolute distinct value in the array is: " + count);
    }
}
