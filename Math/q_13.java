package Math;

import java.util.Scanner;

public class q_13 {
    public static void main(String[] args) {

        int dec_num, quot, i = 1, j;
        int[] bin_num = new int[100];
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a Decimal(Integer) Number : ");
        dec_num = sc.nextInt();

        quot = dec_num;

        while (quot != 0) {
            bin_num[i++] = quot % 2;
            quot = quot / 2;
        }
        StringBuilder binary_str = new StringBuilder();
        System.out.print("Binary number is: ");
        for (j = i - 1; j > 0; j--) {
            binary_str.append(bin_num[j]);
        }
        System.out.print(binary_str);
        i = binary_str.length() - 1;
        while (binary_str.charAt(i) == '0') {
            i--;
        }
        int length = 0;
        int ctr = 0;
        for (; i >= 0; i--) {
            if (binary_str.charAt(i) == '1') {
                length = Math.max(length, ctr);
                ctr = 0;
            } else {
                ctr++;
            }
        }
        length = Math.max(length, ctr);
        System.out.println("\nLength of the longest sequence: " + length);
    }
}
