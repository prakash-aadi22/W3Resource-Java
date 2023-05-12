package Part_1;

import java.util.Arrays;

public class q_114 {
    public static void main(String[] args) {
        String str = "abcdef";
        char[] A = str.toCharArray();
        int offset = 3;
        int len = A.length;
//        offset %= len;
        reverse(A, 0, len - offset - 1);
        reverse(A, len - offset, len - 1);
        reverse(A, 0, len - 1);
        System.out.println(Arrays.toString(A));

        String s = "abcdef";
        String s1 = s.substring(0, 3);
        String s2 = s.substring(3, 6);
        System.out.println(s2 + s1);
    }

    private static void reverse(char[] str, int start, int end) {
        while (start < end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }
}
