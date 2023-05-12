package Part_1;

import java.util.ArrayList;
import java.util.Scanner;

public class q_119 {
    public static int finding(int[] num, int target) {
        int lower = 0;
        int upper = num.length - 1;
        int index = -1;
        while (lower <= upper) {
            int mid = (lower + upper) >> 1;
            if (num[mid] == target) {
                index = mid;
            }
            if (num[mid] >= target) {
                upper = mid - 1;
            } else {
                lower = mid + 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find the first occurrence in the above array: ");
        int target = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(4);
        al.add(6);
        al.add(7);
        al.add(8);
        System.out.println("The first occurrence of a number --> " + target + " in the array --> " + al + " is: " + al.indexOf(target));

        int[] num = {2, 4, 6, 7, 8};
        int index = finding(num, target);
        System.out.println("Position of " + target + " is " + index);
    }
}
