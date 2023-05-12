package Math;

import java.util.Scanner;

public class q_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Roman number: ");
        String str = sc.next();
//        String str = "DCCVII";
        int len = str.length();
        str = str + " ";
        int result = 0;
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            char next_char = str.charAt(i + 1);
            if (ch == 'M') {
                result += 1000;
            } else if (ch == 'C') {
                if (next_char == 'M') {
                    result += 900;
                    i++;
                } else if (next_char == 'D') {
                    result += 400;
                    i++;
                } else {
                    result += 100;
                }
            } else if (ch == 'D') {
                result += 500;
            } else if (ch == 'X') {
                if (next_char == 'C') {
                    result += 90;
                    i++;
                } else if (next_char == 'L') {
                    result += 40;
                    i++;
                } else {
                    result += 10;
                }
            } else if (ch == 'L') {
                result += 50;
            } else if (ch == 'I') {
                if (next_char == 'X') {
                    result += 9;
                    i++;
                } else if (next_char == 'V') {
                    result += 4;
                    i++;
                } else {
                    result++;
                }
            } else { // if (ch == 'V')
                result += 5;
            }
        }
        System.out.println("Roman Number: " + str);
        System.out.println("Equivalent Integer: " + result);
    }
}
/*
SYMBOL       VALUE
  I            1
  IV           4
  V            5
  IX           9
  X            10
  XL           40
  L            50
  XC           90
  C            100
  CD           400
  D            500
  CM           900
  M            1000
*/