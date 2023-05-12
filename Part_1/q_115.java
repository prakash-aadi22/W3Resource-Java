package Part_1;

import java.util.Scanner;

public class q_115 {
    public static void stringPalindrome() {
        String str = "Radar";
        StringBuilder reverseStr = new StringBuilder();

        int strLength = str.length();

        for (int i = (strLength - 1); i >= 0; --i) {
            reverseStr.append(str.charAt(i));
        }

        if (str.equalsIgnoreCase(reverseStr.toString())) {
            System.out.println(str + " is a Palindrome String.");
        } else {
            System.out.println(str + " is not a Palindrome String.");
        }
    }

    public static void integerPalindrome() {
        int num = 3553, reversedNum = 0, remainder;
        int originalNum = num;
        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is Palindrome.");
        } else {
            System.out.println(originalNum + " is not Palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        StringBuilder sbr = sb.reverse();
        System.out.println(s);
        System.out.println(sb);
        System.out.println(sbr);
        System.out.println(s.equals(sbr.toString()));
        if (s.equals(sbr.toString())) {
            System.out.println(s + " is a palindrome.");
        } else {
            System.out.println(s + " is not a palindrome.");
        }
        stringPalindrome();
        integerPalindrome();
    }
}
