package Part_1;

import java.util.Scanner;

public class q_118 {
    public static int strStr(String source, String target) {
        if (source == null || target == null) {
            return -1;
        }
        if ("".equals(target) || source.equals(target)) {
            return 0;
        }
        int i = 0;
        int last = source.length() - target.length() + 1;
        while (i < last) {
            if (source.charAt(i) == target.charAt(0)) {
                boolean equal = true;
                for (int j = 0; j < target.length(); ++j) {
                    if (source.charAt(i + j) != target.charAt(j)) {
                        equal = false;
                        break;
                    }
                }
                if (equal) {
                    return i;
                }
            }
            ++i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Python";
        System.out.print("Enter the string to find the first occurrence in th e above string: ");
        String find = sc.nextLine();
        System.out.println("The first occurrence of a string --> " + find + " in the string --> " + str + " is: " + str.contains(find));
        System.out.println("The first occurrence of a string --> " + find + " in the string --> " + str + " is: " + str.indexOf(find));

        String s = "Python";
        String t1 = "Py";
        String t2 = "yt";
        String t3 = "ab";
        System.out.println(strStr(s, t1));
        System.out.println(strStr(s, t2));
        System.out.println(strStr(s, t3));
    }
}
