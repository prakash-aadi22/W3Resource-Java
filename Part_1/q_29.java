package Part_1;

import java.util.Scanner;

public class q_29 {

    public static int hex_to_decimal(String s) {
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }
        return val;
    }

    public static void main(String[] args) {
        String hexDec_num;
        int dec_num, i = 1, j;
        int[] bin_num = new int[100];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Hexadecimal Number : ");
        hexDec_num = sc.nextLine();

        /* convert hexadecimal to decimal */
        dec_num = hex_to_decimal(hexDec_num);

        /* convert decimal to binary */
        while (dec_num != 0) {
            bin_num[i++] = dec_num % 2;
            dec_num = dec_num / 2;
        }

        System.out.print("Equivalent Binary Number is: ");
        for (j = i - 1; j > 0; j--) {
            System.out.print(bin_num[j]);
        }
        System.out.print("\n");
    }
}
