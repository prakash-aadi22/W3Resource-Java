package Part_1;

import java.util.Scanner;

public class q_30 {
    public static void gfg() {
        int dec = 0;

        // taking 1AC as an example of hexadecimal Number.
        String hex = "1AC";
        int c = hex.length() - 1;

        // finding the decimal equivalent of the
        // hexadecimal number
        for (int i = 0; i < hex.length(); i++) {
            //extracting each character from the string.
            char ch = hex.charAt(i);
//            switch (ch) {
//                case '0':
//                case '1':
//                case '2':
//                case '3':
//                case '4':
//                case '5':
//                case '6':
//                case '7':
//                case '8':
//                case '9':
//                    dec = dec + Integer.parseInt(Character.toString(ch)) *
//                            (int) Math.pow(16, c);
//                    c--;
//                    break;
//                case 'a':
//                case 'A':
//                    dec = dec + 10 * (int) Math.pow(16, c);
//                    c--;
//                    break;
//                case 'b':
//                case 'B':
//                    dec = dec + 11 * (int) Math.pow(16, c);
//                    c--;
//                    break;
//                case 'c':
//                case 'C':
//                    dec = dec + 12 * (int) Math.pow(16, c);
//                    c--;
//                    break;
//                case 'd':
//                case 'D':
//                    dec = dec + 13 * (int) Math.pow(16, c);
//                    c--;
//                    break;
//                case 'e':
//                case 'E':
//                    dec = dec + 14 * (int) Math.pow(16, c);
//                    c--;
//                    break;
//                case 'f':
//                case 'F':
//                    dec = dec + 15 * (int) Math.pow(16, c);
//                    c--;
//                    break;
//                default:
//                    System.out.println("Invalid hex input");
//                    break;
//            }
//        }
            switch (ch) {
                case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> {
                    dec = dec + Integer.parseInt(Character.toString(ch)) *
                            (int) Math.pow(16, c);
                    c--;
                }
                case 'a', 'A' -> {
                    dec = dec + 10 * (int) Math.pow(16, c);
                    c--;
                }
                case 'b', 'B' -> {
                    dec = dec + 11 * (int) Math.pow(16, c);
                    c--;
                }
                case 'c', 'C' -> {
                    dec = dec + 12 * (int) Math.pow(16, c);
                    c--;
                }
                case 'd', 'D' -> {
                    dec = dec + 13 * (int) Math.pow(16, c);
                    c--;
                }
                case 'e', 'E' -> {
                    dec = dec + 14 * (int) Math.pow(16, c);
                    c--;
                }
                case 'f', 'F' -> {
                    dec = dec + 15 * (int) Math.pow(16, c);
                    c--;
                }
                default -> System.out.println("Invalid hex input");
            }
        }

//        // String oct to store the octal equivalent of a hexadecimal number.
//        String oct = "";
//
//        //converting decimal to octal number.
//        while (dec > 0) {
//            oct = dec % 8 + oct;
//            dec = dec / 8;
//        }


        // String oct to store the octal equivalent of a hexadecimal number.
        StringBuilder oct = new StringBuilder();

        //converting decimal to octal number.
        while (dec > 0) {
            oct.insert(0, dec % 8);
            dec = dec / 8;
        }

        // Printing the final output.
        System.out.println("Hexadecimal number = " + hex);
        System.out.println("Equivalent Octal Value = " + oct);
    }

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
        int[] octal_num = new int[100];
        Scanner in = new Scanner(System.in);

        System.out.print("Input a hexadecimal number: ");
        hexDec_num = in.nextLine();

        // Convert hexadecimal to decimal
        dec_num = hex_to_decimal(hexDec_num);

        //Convert decimal to octal
        while (dec_num != 0) {
            octal_num[i++] = dec_num % 8;
            dec_num = dec_num / 8;
        }

        System.out.print("Equivalent of octal number is: ");
        for (j = i - 1; j > 0; j--) {
            System.out.print(octal_num[j]);
        }
        System.out.print("\n");

        System.out.println("--------------------------------------");
        gfg();
    }
}
