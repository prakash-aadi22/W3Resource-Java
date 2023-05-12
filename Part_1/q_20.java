package Part_1;

import java.util.Scanner;

public class q_20 {
    public static void main(String[] args) {
        int dec_num, rem;
        String hexDec_num = "";

        /* hexadecimal number digits */

        char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        Scanner sc = new Scanner(System.in);

        System.out.print("Input a decimal number: ");
        dec_num = sc.nextInt();

        while (dec_num > 0) {
            rem = dec_num % 16;
            hexDec_num = hex[rem] + hexDec_num;
            dec_num = dec_num / 16;
        }
        System.out.print("Hexadecimal number is : " + hexDec_num + "\n");
    }
}
